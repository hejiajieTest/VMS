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

public class UserPermission extends TrackableEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5676917694904268813L;

	private Integer userID ;
	
	private String funcID ;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getFuncID() {
		return funcID;
	}

	public void setFuncID(String funcID) {
		this.funcID = funcID;
	}

}
