/**
 * IUserPermissionRestServerImpl.java	  V1.0   2019年9月20日 下午2:25:17
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.restful.userPermission.impl;

import javax.annotation.Resource;
import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;

import com.tscloud.common.framework.rest.impl.BaseRestServerInterfaceImplNoDubbo;
import com.tscloud.common.framework.service.IBaseInterfaceService;
import com.tscloud.manager.entity.userPermission.UserPermission;
import com.tscloud.manager.restful.userPermission.IUserPermissionRestServer;
import com.tscloud.manager.service.userPermission.IUserPermissionService;
import com.tscloud.manager.util.ConstantsUtil;

@Controller
@Path(ConstantsUtil.RestPathPrefix.REST+"userPermission")
public class UserPermissionRestServerImpl extends BaseRestServerInterfaceImplNoDubbo<UserPermission> implements IUserPermissionRestServer{

	@Resource
	private IUserPermissionService userPermissionService ;
	
	@Override
	public IBaseInterfaceService<UserPermission> getBaseInterface() {
		return userPermissionService;
	}

}
