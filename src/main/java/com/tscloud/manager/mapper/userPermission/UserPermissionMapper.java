/**
 * IUserPermissionMapper.java	  V1.0   2019年9月20日 下午2:49:46
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.mapper.userPermission;

import org.springframework.stereotype.Repository;

import com.tscloud.common.framework.mapper.BaseInterfaceMapper;
import com.tscloud.manager.entity.userPermission.UserPermission;

@Repository
public interface UserPermissionMapper extends BaseInterfaceMapper<UserPermission>{

}
