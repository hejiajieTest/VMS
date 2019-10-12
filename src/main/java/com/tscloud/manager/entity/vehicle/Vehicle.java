/**
 * UserGroupDetail.java	  V1.0   2019年10月8日 上午10:19:41
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.entity.vehicle;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.tscloud.common.framework.domain.TrackableEntity;

public class Vehicle extends TrackableEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private Integer ID ;
	
	private String deviceid ;
	
	private String ipAddress ;
	
	private String cph ;
	
	private String deCph ;
	
	private String ownerName ;
	
	private String type ;
	
	private String ownNo ;
	
	private String contact1 ;
	
	private String contact2 ;
	
	private String alarmLinkTel ;

	private String linkTel2 ;
	
	private String taxiNo ;
	
	private String yyZh ;
	
	private String zyZh ;
	
	private String districtCode ;
	
	private String frameNo ;
	
	private String engineNo ;
	
	private String vehicleType ;
	
	private String brand ;
	
	private String color ;
	
	private Date purchaseDate ;
	
	private BigDecimal purchaseSum ;
	
	private String seller ;
	
	private Date enrolDate ;
	
	private Integer logOut ;
	
	private String logOutCause ;
	
	private Date logOutDate ;
	
	private String yhRzMm ;
	
	private String byZd ;
	
	private Date insertTime ;
	
	private Integer drvID ;
	
	private Integer iAccStatues ;
	
	private Integer iDBType ;
	
	private String webPass ;
	
	private String productCode ;
	
	private String installPerson ;
	
	private String installAddress ;
	
	private String recordPerson ;
	
	private String businessPerson ;
	
	private String marks ;
	
	private String setMarks ;
	
	private Date serverEndTime ;
	
	private BigDecimal serverMoney ;
	
	private String contact3 ;
	
	private String contactPhone3 ;
	
	private String baseInfoMark ;
	
	private String centerNumber ;
	
	private String huiYuan ;
	
	private String cSBrand ;
	
	private String customNo ;
	
	private Integer delFlag ;
	
	private Integer state ;
	
	private Date createTime ;
	
	private Date updateTime ;
	
	private Date repairTime ;
	
	private Date insuranceTime ;

    private String videoChanel ;
    
    private String videoID ;
    
    private String oiPrices ;
    
    private String FuelConsumption ;
    
    private Integer IsEnable ;
    
    private String  operatingLicense ;
    
    private String record ;
    
    private String sbNumber ;
    
    private Integer reg ;
    
    private Date certificatetime ;
    
    private String createdBy ;
    
    private Date trantime ;
    
    private String license ;
    
    private Date licenseTime ;
    
    private Date examined ;
    
    private Integer isStore ;
    
    private Integer storeUserID ;

    private Integer vehGroupID ;
    
	private String id;
	private String pId;
	private String childName;
	
	public String getId() {
		return id;
	}

	public String getpId() {
		return pId;
	}

	public String getChildName() {
		return childName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public Integer getVehGroupID() {
		return vehGroupID;
	}

	public void setVehGroupID(Integer vehGroupID) {
		this.vehGroupID = vehGroupID;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getCph() {
		return cph;
	}

	public void setCph(String cph) {
		this.cph = cph;
	}

	public String getDeCph() {
		return deCph;
	}

	public void setDeCph(String deCph) {
		this.deCph = deCph;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwnNo() {
		return ownNo;
	}

	public void setOwnNo(String ownNo) {
		this.ownNo = ownNo;
	}

	public String getContact1() {
		return contact1;
	}

	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}

	public String getContact2() {
		return contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	public String getAlarmLinkTel() {
		return alarmLinkTel;
	}

	public void setAlarmLinkTel(String alarmLinkTel) {
		this.alarmLinkTel = alarmLinkTel;
	}

	public String getLinkTel2() {
		return linkTel2;
	}

	public void setLinkTel2(String linkTel2) {
		this.linkTel2 = linkTel2;
	}

	public String getTaxiNo() {
		return taxiNo;
	}

	public void setTaxiNo(String taxiNo) {
		this.taxiNo = taxiNo;
	}

	public String getYyZh() {
		return yyZh;
	}

	public void setYyZh(String yyZh) {
		this.yyZh = yyZh;
	}

	public String getZyZh() {
		return zyZh;
	}

	public void setZyZh(String zyZh) {
		this.zyZh = zyZh;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getFrameNo() {
		return frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public BigDecimal getPurchaseSum() {
		return purchaseSum;
	}

	public void setPurchaseSum(BigDecimal purchaseSum) {
		this.purchaseSum = purchaseSum;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public Date getEnrolDate() {
		return enrolDate;
	}

	public void setEnrolDate(Date enrolDate) {
		this.enrolDate = enrolDate;
	}

	public Integer getLogOut() {
		return logOut;
	}

	public void setLogOut(Integer logOut) {
		this.logOut = logOut;
	}

	public String getLogOutCause() {
		return logOutCause;
	}

	public void setLogOutCause(String logOutCause) {
		this.logOutCause = logOutCause;
	}

	public Date getLogOutDate() {
		return logOutDate;
	}

	public void setLogOutDate(Date logOutDate) {
		this.logOutDate = logOutDate;
	}

	public String getYhRzMm() {
		return yhRzMm;
	}

	public void setYhRzMm(String yhRzMm) {
		this.yhRzMm = yhRzMm;
	}

	public String getByZd() {
		return byZd;
	}

	public void setByZd(String byZd) {
		this.byZd = byZd;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public Integer getDrvID() {
		return drvID;
	}

	public void setDrvID(Integer drvID) {
		this.drvID = drvID;
	}

	public Integer getiAccStatues() {
		return iAccStatues;
	}

	public void setiAccStatues(Integer iAccStatues) {
		this.iAccStatues = iAccStatues;
	}

	public Integer getiDBType() {
		return iDBType;
	}

	public void setiDBType(Integer iDBType) {
		this.iDBType = iDBType;
	}

	public String getWebPass() {
		return webPass;
	}

	public void setWebPass(String webPass) {
		this.webPass = webPass;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getInstallPerson() {
		return installPerson;
	}

	public void setInstallPerson(String installPerson) {
		this.installPerson = installPerson;
	}

	public String getInstallAddress() {
		return installAddress;
	}

	public void setInstallAddress(String installAddress) {
		this.installAddress = installAddress;
	}

	public String getRecordPerson() {
		return recordPerson;
	}

	public void setRecordPerson(String recordPerson) {
		this.recordPerson = recordPerson;
	}

	public String getBusinessPerson() {
		return businessPerson;
	}

	public void setBusinessPerson(String businessPerson) {
		this.businessPerson = businessPerson;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getSetMarks() {
		return setMarks;
	}

	public void setSetMarks(String setMarks) {
		this.setMarks = setMarks;
	}

	public Date getServerEndTime() {
		return serverEndTime;
	}

	public void setServerEndTime(Date serverEndTime) {
		this.serverEndTime = serverEndTime;
	}

	public BigDecimal getServerMoney() {
		return serverMoney;
	}

	public void setServerMoney(BigDecimal serverMoney) {
		this.serverMoney = serverMoney;
	}

	public String getContact3() {
		return contact3;
	}

	public void setContact3(String contact3) {
		this.contact3 = contact3;
	}

	public String getContactPhone3() {
		return contactPhone3;
	}

	public void setContactPhone3(String contactPhone3) {
		this.contactPhone3 = contactPhone3;
	}

	public String getBaseInfoMark() {
		return baseInfoMark;
	}

	public void setBaseInfoMark(String baseInfoMark) {
		this.baseInfoMark = baseInfoMark;
	}

	public String getCenterNumber() {
		return centerNumber;
	}

	public void setCenterNumber(String centerNumber) {
		this.centerNumber = centerNumber;
	}

	public String getHuiYuan() {
		return huiYuan;
	}

	public void setHuiYuan(String huiYuan) {
		this.huiYuan = huiYuan;
	}

	public String getcSBrand() {
		return cSBrand;
	}

	public void setcSBrand(String cSBrand) {
		this.cSBrand = cSBrand;
	}

	public String getCustomNo() {
		return customNo;
	}

	public void setCustomNo(String customNo) {
		this.customNo = customNo;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getRepairTime() {
		return repairTime;
	}

	public void setRepairTime(Date repairTime) {
		this.repairTime = repairTime;
	}

	public Date getInsuranceTime() {
		return insuranceTime;
	}

	public void setInsuranceTime(Date insuranceTime) {
		this.insuranceTime = insuranceTime;
	}

	public String getVideoChanel() {
		return videoChanel;
	}

	public void setVideoChanel(String videoChanel) {
		this.videoChanel = videoChanel;
	}

	public String getVideoID() {
		return videoID;
	}

	public void setVideoID(String videoID) {
		this.videoID = videoID;
	}

	public String getOiPrices() {
		return oiPrices;
	}

	public void setOiPrices(String oiPrices) {
		this.oiPrices = oiPrices;
	}

	public String getFuelConsumption() {
		return FuelConsumption;
	}

	public void setFuelConsumption(String fuelConsumption) {
		FuelConsumption = fuelConsumption;
	}

	public Integer getIsEnable() {
		return IsEnable;
	}

	public void setIsEnable(Integer isEnable) {
		IsEnable = isEnable;
	}

	public String getOperatingLicense() {
		return operatingLicense;
	}

	public void setOperatingLicense(String operatingLicense) {
		this.operatingLicense = operatingLicense;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public String getSbNumber() {
		return sbNumber;
	}

	public void setSbNumber(String sbNumber) {
		this.sbNumber = sbNumber;
	}

	public Integer getReg() {
		return reg;
	}

	public void setReg(Integer reg) {
		this.reg = reg;
	}

	public Date getCertificatetime() {
		return certificatetime;
	}

	public void setCertificatetime(Date certificatetime) {
		this.certificatetime = certificatetime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getTrantime() {
		return trantime;
	}

	public void setTrantime(Date trantime) {
		this.trantime = trantime;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Date getLicenseTime() {
		return licenseTime;
	}

	public void setLicenseTime(Date licenseTime) {
		this.licenseTime = licenseTime;
	}

	public Date getExamined() {
		return examined;
	}

	public void setExamined(Date examined) {
		this.examined = examined;
	}

	public Integer getIsStore() {
		return isStore;
	}

	public void setIsStore(Integer isStore) {
		this.isStore = isStore;
	}

	public Integer getStoreUserID() {
		return storeUserID;
	}

	public void setStoreUserID(Integer storeUserID) {
		this.storeUserID = storeUserID;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

}
