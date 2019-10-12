/**
 * VehGroupMain.java	  V1.0   2019年10月9日 下午5:22:15
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.entity.vehGroupMain;

import java.util.Date;

import com.tscloud.common.framework.domain.TrackableEntity;

public class VehGroupMain extends TrackableEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -486347029623400476L;

	private Integer vehGroupID ;
	
	private String vehGroupName ;
	
	private String contact ;
	
	private String sTel1 ;
	
	private String sTel2 ;
	
	private String address ;
	
	private Integer delFlag ;
	
	private Date createTime ;
	
	private Date updateTime ;
	
	private Integer isStore ;

	private String id;
	private String pId;
	private String parentName;
	private String childName;
	private Integer num ;
	private Integer num1 ;
	private Integer num2 ;
	private String type ;
	private String userID ;
	public Integer getVehGroupID() {
		return vehGroupID;
	}
	public String getVehGroupName() {
		return vehGroupName;
	}
	public String getContact() {
		return contact;
	}
	public String getsTel1() {
		return sTel1;
	}
	public String getsTel2() {
		return sTel2;
	}
	public String getAddress() {
		return address;
	}
	public Integer getDelFlag() {
		return delFlag;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public Integer getIsStore() {
		return isStore;
	}
	public String getId() {
		return id;
	}
	public String getpId() {
		return pId;
	}
	public String getParentName() {
		return parentName;
	}
	public String getChildName() {
		return childName;
	}
	public Integer getNum() {
		return num;
	}
	public Integer getNum1() {
		return num1;
	}
	public Integer getNum2() {
		return num2;
	}
	public String getType() {
		return type;
	}
	public String getUserID() {
		return userID;
	}
	public void setVehGroupID(Integer vehGroupID) {
		this.vehGroupID = vehGroupID;
	}
	public void setVehGroupName(String vehGroupName) {
		this.vehGroupName = vehGroupName;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setsTel1(String sTel1) {
		this.sTel1 = sTel1;
	}
	public void setsTel2(String sTel2) {
		this.sTel2 = sTel2;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public void setIsStore(Integer isStore) {
		this.isStore = isStore;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
}
