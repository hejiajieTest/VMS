package com.tscloud.manager.util;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tscloud.manager.entity.vehDataPart.VehDataPart;


public class DatabaseHelper {
    private final static Logger LOGGER = LoggerFactory.getLogger(DatabaseHelper.class);
    
 /*   public final class Constant{
    	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    	private static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=sql_server_test";
    	//private static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=master";
    	private static final String USERNAME = "sa";
    	private static final String PASSWORD = "123456";
    }*/
    public final class Constant{
    	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    	private static final String URL = "jdbc:sqlserver://218.84.134.247:5002;DatabaseName=HisData201704P1";
    	//private static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=master";
    	private static final String USERNAME = "sa";
    	private static final String PASSWORD = "qwer123.";
    }
    
    private String driver ;
  	private String url ;
  	private String userName ;
  	private String passWord ;

    private static final String SQL = "SELECT top 1 * FROM ";// 数据库操作
    
    private static final String SHOW_TABLES_SQL = "SHOW TABLES ";
    
    private static final String SHOW_TABLES_LIKE_SQL = "SHOW TABLES LIKE '";
    private static Connection conn = null;

    
    public DatabaseHelper(String driver,String url,String userName,String passWord){
    	this.driver = driver ;
    	this.url = url ;
    	this.userName = userName ;
    	this.passWord = passWord ;
    	getConnection();
    }
    /**
	 * 
	 * 功能描述：like %XXXX% 处理(过滤通配符% _)
	 *
	 * @author ：hjj
	 * 创建日期 ：2019年7月20日 
	 *
	 * @param likeStr
	 * @return
	 *
	 * 修改历史 ：(修改人，修改时间，修改原因/内容)
	 */
    public static String filterWildcard(String likeStr){
        if(null==likeStr){
            return "%%";
        }
        String str=likeStr.replaceAll("%","\\\\%").replaceAll("_","\\\\_");
        return "%"+str+"%";
    }
    

    /**
     * 获取数据库连接
     *
     * @return
     */
    public Connection getConnection(){
    	try {
        	Class.forName(driver);
            conn = DriverManager.getConnection(url, userName, passWord);
            System.out.println(conn);
        }catch (Exception e) {
        	e.printStackTrace();
        }
        return conn;
    }
    


//    /**
//     * 关闭数据库连接
//     * @param conn
//     */
//    public static void closeConnection(Connection conn) {
//        if(conn != null) {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                LOGGER.error("数据库连接关闭失败", e);
//            }
//        }
//    }
    
    

    /**
     * 获取数据库下的所有表名catalog - 数据库目录名称，可设为null，（具体JDBC驱动的实现不一样在MySQL中指数据库名）。
	 *	schemaPattern - 方案名称的样式，可设为null，（ 具体JDBC驱动的实现不一样， 在Oracle中指用户名）。
	 *	tableNamePattern - 表名称的样式，可以包含匹配符比如：“TEST%”
	 *	types - 要包括的表类型组成的列表，可设为null，表示所有的。
     */
    public static List<String> getTableNames(String tableNamePattern) {
    	tableNamePattern = null ;
        List<String> tableNames = new ArrayList<>();
//        Connection conn = getConnection();
        ResultSet rs = null;
        try {
            //获取数据库的元数据
            DatabaseMetaData db = conn.getMetaData();
            //从元数据中获取到所有的表名
            rs = db.getTables(null, null, tableNamePattern, new String[] { "TABLE" });
            while(rs.next()) {
                tableNames.add(rs.getString(3));
            }
        } catch (SQLException e) {
            LOGGER.error("获取数据库表名失败", e);
        } finally {
            try {
                rs.close();
                conn.close();
            } catch (SQLException e) {
                LOGGER.error("数据库连接关闭失败", e);
            }
        }
        return tableNames;
    }

    /**
	 * 获得某表的建表语句
	 * @param tableName
	 * @return
	 * @throws Exception
	 */
	public static List<Map<String,String>> getCommentByTableName(String tableNamePattern) {
		List<Map<String,String>> list = new ArrayList<Map<String,String>>() ;
		int i = 0 ;
//		Connection conn = getConnection();
		ResultSet rst = null ;
		ResultSet rs = null ;
		Statement stmt_t = null ;
		Statement stmt = null ;
		try{
			stmt =conn.createStatement();
			stmt_t =conn.createStatement();
			if(stmt_t != null){
				if(tableNamePattern == null){
					rst = stmt_t.executeQuery(SHOW_TABLES_SQL);
				}else{
					rst = stmt_t.executeQuery(SHOW_TABLES_LIKE_SQL+filterWildcard(tableNamePattern) +"'");
				}
				while(rst.next()) {
					String tableName = rst.getString(1);
					rs =stmt.executeQuery("SHOW CREATE TABLE " + tableName);
					if (stmt != null && rs != null && rs.next()) {
						Map<String,String> map = new HashMap<String,String>();
						String createDDL = rs.getString(2);
						String comment = parse(createDDL) ;
						if(comment == null || "".equals(comment)){
							comment = tableName ;
						}
						map.put("tableName", tableName);
						map.put("comment", comment);
						list.add(map);
						rs.close();
					}
				}
				rst.close();
			}
		} catch (SQLException e) {
			 LOGGER.error("获取表名与注释失败", e);
		}finally{
			if (stmt != null) {
				try {
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					LOGGER.error("", e);
				}
			}
		}
			
		return list;
	}
	
	/**
	 * 返回注释信息
	 * @param all
	 * @return
	 */
	
	public static String parse(String all) {
		String comment = null;
		int index = all.indexOf("COMMENT='");
		if (index < 0) {
			return "";
		}
		comment = all.substring(index + 9);
		comment = comment.substring(0, comment.length() - 1);
		return comment;
	}
	
    /**
     * 将字段与数据封装成map返回给前台（格式：column_1:data_name,data_name="vs_data"）
     * @param tableName 表名
     * @return
     */
    public static VehDataPart getData(String sqlString) {
    	 VehDataPart vehDataPart = new VehDataPart() ;
        PreparedStatement pStemt = null;
        String tableSql = sqlString;
        try {
        	pStemt = conn.prepareStatement(tableSql);
            ResultSet resultSet = pStemt.executeQuery();
            /*//结果集元数据
            ResultSetMetaData rsmd = pStemt.getMetaData();
            //判空
            if(rsmd != null){
	            //表列数
	            int size = rsmd.getColumnCount();
	            for (int i = 0; i < size; i++) {
	                columnNames.add(rsmd.getColumnName(i + 1));
	            }
            }*/
           /*if(!resultSet.next() ){
        	    vehDataPart.setGpsId(0L);
	           	vehDataPart.setAlarm(0);
	           	vehDataPart.setVehID(0);
	           	vehDataPart.setVelocity(0);
	           	vehDataPart.setTime(new Date());
	           	vehDataPart.setRunMile(0);
	           	vehDataPart.setAngleText("无");
	           	vehDataPart.setLongitude(new BigDecimal(0));
	           	vehDataPart.setLatitude(new BigDecimal(0));
	           	vehDataPart.setAlarmStatus("无");
           }
        	   vehDataPart = null ;
           }*/
            while (resultSet.next()) {
            	vehDataPart.setGpsId(resultSet.getLong("GpsId"));
            	vehDataPart.setAlarm(resultSet.getInt("Alarm"));
            	vehDataPart.setVehID(resultSet.getInt("VehID")+10000);
            	vehDataPart.setVelocity(resultSet.getInt("Velocity"));
            	try {
					vehDataPart.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(resultSet.getString("Time")));
				} catch (ParseException e) {
					e.printStackTrace();
				}
            	vehDataPart.setRunMile(resultSet.getInt("RunMile"));
            	vehDataPart.setAngle(resultSet.getInt("Angle"));
            	vehDataPart.setLongitude(resultSet.getBigDecimal("Longitude"));
            	vehDataPart.setLatitude(resultSet.getBigDecimal("Latitude"));
            	vehDataPart.setAlarmStatus(resultSet.getString("AlarmStatus"));
            }
        } catch (SQLException e) {
            LOGGER.error("getColumnNames failure", e);
        } finally {
            if (pStemt != null) {
                try {
                    pStemt.close();
                    conn.close();
                } catch (SQLException e) {
                    LOGGER.error("getColumnNames close pstem and connection failure", e);
                }
            }
        }
        return vehDataPart;
    }
    /**
     * 将字段与数据封装成map返回给前台（格式：column_1=data_name,data_name="vs_data"）
     * @param tableName 表名
     * @return
     */
    public static List<Map<String,String>> getColumnNames(String tableName) {
    	List<Map<String,String>> list = new ArrayList<Map<String,String>>() ;
        //与数据库的连接
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        try {
            pStemt = conn.prepareStatement(tableSql);
            //结果集元数据
            ResultSetMetaData rsmd = pStemt.getMetaData();
            //判空
            if(rsmd != null){
	            //表列数
	            int size = rsmd.getColumnCount();
	            for (int i = 0; i < size; i++) {
	            	Map<String,String> map = new HashMap<String,String>() ;
	            	map.put("columnName_"+i+1,rsmd.getColumnName(i+1)) ;
	            	list.add(map);
	            }
            }
        } catch (SQLException e) {
            LOGGER.error("getColumnNames failure", e);
        } finally {
            if (pStemt != null) {
                try {
                    pStemt.close();
                    conn.close();
                } catch (SQLException e) {
                    LOGGER.error("getColumnNames close pstem and connection failure", e);
                }
            }
        }
        return list;
    }

    /**
     * 获取表中所有字段类型
     * @param tableName
     * @return
     */
    public static List<String> getColumnTypes(String tableName) {
        List<String> columnTypes = new ArrayList<>();
        //与数据库的连接
//        Connection conn = getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        try {
            pStemt = conn.prepareStatement(tableSql);
            //结果集元数据
            ResultSetMetaData rsmd = pStemt.getMetaData();
            
            //表列数
            int size = rsmd.getColumnCount();
            for (int i = 0; i < size; i++) {
                columnTypes.add(rsmd.getColumnTypeName(i + 1));
            }
        } catch (SQLException e) {
            LOGGER.error("getColumnTypes failure", e);
        } finally {
            if (pStemt != null) {
                try {
                    pStemt.close();
                    conn.close();
                } catch (SQLException e) {
                    LOGGER.error("getColumnTypes close pstem and connection failure", e);
                }
            }
        }
        return columnTypes;
    }

    /**
     * 获取表中字段的所有注释
     * @param tableName
     * @return
     */
    public static List<String> getColumnComments(String tableName) {
        List<String> columnTypes = new ArrayList<>();
        //与数据库的连接
//        Connection conn = getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        List<String> columnComments = new ArrayList<>();//列名注释集合
        ResultSet rs = null;
        try {
            pStemt = conn.prepareStatement(tableSql);
            rs = pStemt.executeQuery("show full columns from " + tableName);
            while (rs.next()) {
                columnComments.add(rs.getString("Comment"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                    conn.close();
                } catch (SQLException e) {
                    LOGGER.error("getColumnComments close ResultSet and connection failure", e);
                }
            }
        }
        return columnComments;
    }
    public static void main(String[] args) 
    {
    	 //new DatabaseHelper(Constant.DRIVER,Constant.URL,Constant.USERNAME,Constant.PASSWORD);
    	 //List<Map<String,String>> list =  DatabaseHelper.getData("table_1");
    	 //System.out.println(list.size());
    }
}