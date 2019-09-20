/**
 * UserPermission.java	  V1.0   2019年9月20日 下午2:23:12
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.entity.userPermission;

import com.tscloud.common.framework.domain.TrackableEntity;

public class UserPermission extends TrackableEntity{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5676917694904268813L;

	private Integer UserID ;
	
	private String FuncID ;

	public Integer getUserID() {
		return UserID;
	}

	public void setUserID(Integer userID) {
		UserID = userID;
	}

	public String getFuncID() {
		return FuncID;
	}

	public void setFuncID(String funcID) {
		FuncID = funcID;
	}
	
	
}
