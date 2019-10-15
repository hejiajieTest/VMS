/**
 * VehDataPartServiceImpl.java	  V1.0   2019年10月8日 下午5:31:36
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.service.vehDataPart.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tscloud.common.framework.Exception.ServiceException;
import com.tscloud.common.framework.domain.TrackableEntity;
import com.tscloud.common.framework.mapper.BaseInterfaceMapper;
import com.tscloud.common.framework.service.impl.BaseInterfaceServiceImpl;
import com.tscloud.manager.entity.vehDataPart.VehDataPart;
import com.tscloud.manager.mapper1.vehDataPart.VehDataPartMapper;
import com.tscloud.manager.service.vehDataPart.IVehDataPartService;
import com.tscloud.manager.util.DatabaseHelper;

@Service
public class VehDataPartServiceImpl extends BaseInterfaceServiceImpl<VehDataPart> implements IVehDataPartService{

	@Resource
	private VehDataPartMapper vehDataPartMapper ;
	private static final double x_PI = 3.14159265358979324 * 3000.0 / 180.0;
	private static final double PI = 3.1415926535897932384626;
	private static final double a = 6378245.0;
	private static final double ee = 0.00669342162296594323;

	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://218.84.134.247:5002;DatabaseName=";
	//private static final String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=master";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "qwer123.";
	
	@Override
	public BaseInterfaceMapper<VehDataPart> getBaseInterfaceMapper() {
		return vehDataPartMapper;
	}

    @Override
    public VehDataPart getByVehId(String id) throws ServiceException {
	   Date date = new Date();
	   SimpleDateFormat simple = new SimpleDateFormat("yyyyMM") ;
	   String url = simple.format(date) ;
	   if( 1<= date.getDate() && 10 >= date.getDate()){
		   url = "HisData"+url+"P1" ;
	   }
	   if( 10 < date.getDate() && 20 >= date.getDate()){
		   url = "HisData"+url+"P2" ;
	   }
	   if( 20< date.getDate()){
		   url = "HisData"+url+"P3" ;
	  }
	   DatabaseHelper data = new DatabaseHelper(DRIVER, URL+url, USERNAME, PASSWORD) ;
	   //树结构中，防止车辆id和车组id相同，比如车辆id为7，车组id为26，车组的上一级车组又是7，书无法显示，所以将车辆+10000
	   int newId =Integer.valueOf(id)-10000;
	   String tableName= "VehDataPart"+((Integer.valueOf(id)-10000)/50+1) ;
	   String sql = "SELECT top 1 * FROM " + tableName +" where VehID="+newId+ " order by Time desc";
	   VehDataPart vehDataPart = DatabaseHelper.getData(sql);
	   //查询车辆行驶状态
	   
	    try {
	    	if(vehDataPart != null){
	    		
	    		if(null == vehDataPart.getVehID() ){
	    			vehDataPart = null; 
	    			return vehDataPart ;
	    		}
	    		
		    	if(vehDataPart.getAlarm() != null)
		    		if( vehDataPart.getAlarm() == 0){
		    			vehDataPart.setAlarmStatus("无");
		    		}
		    		if(vehDataPart.getAngle() != null){
				    	if(vehDataPart.getAngle() == 0 ||vehDataPart.getAngle() == 360 ){
				    		vehDataPart.setAngleText("正北");
				    	}else if(vehDataPart.getAngle() > 0 && vehDataPart.getAngle() < 90){
				    		vehDataPart.setAngleText("东北");
				    	}else if(vehDataPart.getAngle() == 90){
				    		vehDataPart.setAngleText("东");
				    	}else if(vehDataPart.getAngle() > 90 && vehDataPart.getAngle() < 180){
				    		vehDataPart.setAngleText("东南");
				    	}else if(vehDataPart.getAngle() == 180){
				    		vehDataPart.setAngleText("南");
				    	}else if(vehDataPart.getAngle() > 180 && vehDataPart.getAngle() < 270){
				    		vehDataPart.setAngleText("西南");
				    	}else if(vehDataPart.getAngle() == 270){
				    		vehDataPart.setAngleText("西");
				    	}else if(vehDataPart.getAngle() >270 && vehDataPart.getAngle() < 360){
				    		vehDataPart.setAngleText("西北");
				    	}
		    		}
		    		if(vehDataPart.getLatitude() != new BigDecimal(0) && vehDataPart.getLongitude() != new BigDecimal(0)){
		    			vehDataPart = bdEncrypt(vehDataPart) ;
		    		}
	    		}
		    } catch (Exception e) {
		      throw new ServiceException(e.getMessage(), e);
		    }
		    return vehDataPart;
	  }
    /**
     * 火星坐标系 (GCJ-02) 与百度坐标系 (BD-09) 的转换
    * @param lng
    * @param lat
    * @returns {*[]}
    */
   public VehDataPart gcj02tobd09(VehDataPart vehDataPart) {
	   double lat = vehDataPart.getLatitude().doubleValue();
	   double lng = vehDataPart.getLongitude().doubleValue();
       double z = Math.sqrt(lng * lng + lat * lat) + 0.00002 * Math.sin(lat * x_PI);
       double theta = Math.atan2(lat, lng) + 0.000003 * Math.cos(lng * x_PI);
       double bd_lng = z * Math.cos(theta) + 0.0065;
       double bd_lat = z * Math.sin(theta) + 0.006;
       vehDataPart.setLatitude(BigDecimal.valueOf(bd_lat));
       vehDataPart.setLongitude(BigDecimal.valueOf(bd_lng));
       return vehDataPart;
   }
   //高德转百度
    public static VehDataPart bdEncrypt(VehDataPart vehDataPart){
    	double y = vehDataPart.getLatitude().doubleValue();
 	    double x = vehDataPart.getLongitude().doubleValue();
        double z = Math.sqrt(x * x + y * y) + 0.00002 * Math.sin(y * x_PI);
        double theta = Math.atan2(y, x) + 0.000003 * Math.cos(x * x_PI);
        double bd_lon = z * Math.cos(theta) + 0.0065;
        double bd_lat = z * Math.sin(theta) + 0.006;
        vehDataPart.setLatitude(BigDecimal.valueOf(bd_lat));
        vehDataPart.setLongitude(BigDecimal.valueOf(bd_lon));
        return vehDataPart;
    }
}
