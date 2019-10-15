/**
 * VehDataPart.java	  V1.0   2019年10月8日 下午5:07:57
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.entity.vehDataPart;

import java.math.BigDecimal;
import java.util.Date;

import com.tscloud.common.framework.domain.TrackableEntity;

public class VehDataPart extends TrackableEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 574979452751574860L;

	private Long gpsId ;
	
	private Integer vehID ;
	
	private String addressIp ;
	
	private Date time ;
	
	private Date receiveTime ;
	
	private BigDecimal longitude ;
	
	private BigDecimal latitude ;
	
	private BigDecimal oriLongitude ;
	
	private BigDecimal oriLatitude ;
	
	private Integer velocity ;
	
	private Integer angle ;
	
	private Integer Alarm ;
	
	private boolean Light ;
	
	private boolean Oil ;
	
	private boolean locate ;
	
	private Integer TaxiState ;
	
	private String m_OilScale ;
	
	private String m_OilNum ;
	
	private Integer runMile ;
	
	private String component ;
	
	private String senSor ;
	
	private boolean signin ;
	
	private String signno ;
	
	private Integer SenSor1 ;
	
	private Integer SenSor2 ;
	
	private Integer SenSor3 ;
	
	private BigDecimal temperature1 ;
	
	private BigDecimal Temperature2 ;
	
	private BigDecimal Temperature3 ;
	
	private BigDecimal Temperature4 ;
	
	private Integer commandID ;
	
	private String original ;
	
	private String mMCode ;
	
	private String lAC ;
	
	private String cellID ;
	
	private String xDYCanInfo ;
	
	private String alarmStatus ;
	
	private String oldData ;
	private String angleText ;

	private String tableName ;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getAngleText() {
		return angleText;
	}

	public void setAngleText(String angleText) {
		this.angleText = angleText;
	}

	public Long getGpsId() {
		return gpsId;
	}

	public Integer getVehID() {
		return vehID;
	}

	public String getAddressIp() {
		return addressIp;
	}

	public Date getTime() {
		return time;
	}

	public Date getReceiveTime() {
		return receiveTime;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public BigDecimal getOriLongitude() {
		return oriLongitude;
	}

	public BigDecimal getOriLatitude() {
		return oriLatitude;
	}

	public Integer getVelocity() {
		return velocity;
	}

	public Integer getAngle() {
		return angle;
	}

	public Integer getAlarm() {
		return Alarm;
	}

	public boolean isLight() {
		return Light;
	}

	public boolean isOil() {
		return Oil;
	}

	public boolean isLocate() {
		return locate;
	}

	public Integer getTaxiState() {
		return TaxiState;
	}

	public String getM_OilScale() {
		return m_OilScale;
	}

	public String getM_OilNum() {
		return m_OilNum;
	}

	public Integer getRunMile() {
		return runMile;
	}

	public String getComponent() {
		return component;
	}

	public String getSenSor() {
		return senSor;
	}

	public boolean isSignin() {
		return signin;
	}

	public String getSignno() {
		return signno;
	}

	public Integer getSenSor1() {
		return SenSor1;
	}

	public Integer getSenSor2() {
		return SenSor2;
	}

	public Integer getSenSor3() {
		return SenSor3;
	}

	public BigDecimal getTemperature1() {
		return temperature1;
	}

	public BigDecimal getTemperature2() {
		return Temperature2;
	}

	public BigDecimal getTemperature3() {
		return Temperature3;
	}

	public BigDecimal getTemperature4() {
		return Temperature4;
	}

	public Integer getCommandID() {
		return commandID;
	}

	public String getOriginal() {
		return original;
	}

	public String getmMCode() {
		return mMCode;
	}

	public String getlAC() {
		return lAC;
	}

	public String getCellID() {
		return cellID;
	}

	public String getxDYCanInfo() {
		return xDYCanInfo;
	}

	public String getAlarmStatus() {
		return alarmStatus;
	}

	public String getOldData() {
		return oldData;
	}

	public void setGpsId(Long gpsId) {
		this.gpsId = gpsId;
	}

	public void setVehID(Integer vehID) {
		this.vehID = vehID;
	}

	public void setAddressIp(String addressIp) {
		this.addressIp = addressIp;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public void setOriLongitude(BigDecimal oriLongitude) {
		this.oriLongitude = oriLongitude;
	}

	public void setOriLatitude(BigDecimal oriLatitude) {
		this.oriLatitude = oriLatitude;
	}

	public void setVelocity(Integer velocity) {
		this.velocity = velocity;
	}

	public void setAngle(Integer angle) {
		this.angle = angle;
	}

	public void setAlarm(Integer alarm) {
		Alarm = alarm;
	}

	public void setLight(boolean light) {
		Light = light;
	}

	public void setOil(boolean oil) {
		Oil = oil;
	}

	public void setLocate(boolean locate) {
		this.locate = locate;
	}

	public void setTaxiState(Integer taxiState) {
		TaxiState = taxiState;
	}

	public void setM_OilScale(String m_OilScale) {
		this.m_OilScale = m_OilScale;
	}

	public void setM_OilNum(String m_OilNum) {
		this.m_OilNum = m_OilNum;
	}

	public void setRunMile(Integer runMile) {
		this.runMile = runMile;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public void setSenSor(String senSor) {
		this.senSor = senSor;
	}

	public void setSignin(boolean signin) {
		this.signin = signin;
	}

	public void setSignno(String signno) {
		this.signno = signno;
	}

	public void setSenSor1(Integer senSor1) {
		SenSor1 = senSor1;
	}

	public void setSenSor2(Integer senSor2) {
		SenSor2 = senSor2;
	}

	public void setSenSor3(Integer senSor3) {
		SenSor3 = senSor3;
	}

	public void setTemperature1(BigDecimal temperature1) {
		this.temperature1 = temperature1;
	}

	public void setTemperature2(BigDecimal temperature2) {
		Temperature2 = temperature2;
	}

	public void setTemperature3(BigDecimal temperature3) {
		Temperature3 = temperature3;
	}

	public void setTemperature4(BigDecimal temperature4) {
		Temperature4 = temperature4;
	}

	public void setCommandID(Integer commandID) {
		this.commandID = commandID;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public void setmMCode(String mMCode) {
		this.mMCode = mMCode;
	}

	public void setlAC(String lAC) {
		this.lAC = lAC;
	}

	public void setCellID(String cellID) {
		this.cellID = cellID;
	}

	public void setxDYCanInfo(String xDYCanInfo) {
		this.xDYCanInfo = xDYCanInfo;
	}

	public void setAlarmStatus(String alarmStatus) {
		this.alarmStatus = alarmStatus;
	}

	public void setOldData(String oldData) {
		this.oldData = oldData;
	}
	
}

