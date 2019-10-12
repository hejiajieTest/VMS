/**
 * UserPermissionServiceImpl.java	  V1.0   2019年9月20日 下午2:41:11
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.service.userPermission.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tscloud.common.framework.mapper.BaseInterfaceMapper;
import com.tscloud.common.framework.service.impl.BaseInterfaceServiceImpl;
import com.tscloud.manager.entity.userPermission.UserPermission;
import com.tscloud.manager.mapper.userPermission.UserPermissionMapper;
import com.tscloud.manager.service.userPermission.IUserPermissionService;

@Service
public class UserPermissionServiceImpl extends BaseInterfaceServiceImpl<UserPermission> implements IUserPermissionService{

	@Resource
	private UserPermissionMapper userPermissionMapper ;
	@Override
	public BaseInterfaceMapper<UserPermission> getBaseInterfaceMapper() {
		return userPermissionMapper;
	}
	@Override
	public void test() {
		System.out.println("定时任务执行成功！！！");
	}

	
}
