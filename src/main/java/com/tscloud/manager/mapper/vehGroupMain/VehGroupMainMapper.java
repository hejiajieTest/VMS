/**
 * VehGroupMainMapper.java	  V1.0   2019年10月9日 下午5:27:39
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.mapper.vehGroupMain;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tscloud.common.framework.mapper.BaseInterfaceMapper;
import com.tscloud.manager.entity.vehGroupMain.VehGroupMain;

@Repository
public interface VehGroupMainMapper extends BaseInterfaceMapper<VehGroupMain> {

	List<VehGroupMain> findByUserId(Map<String, Object> map);
	List<VehGroupMain> findGroupByUserId(Map<String, Object> map);
}
