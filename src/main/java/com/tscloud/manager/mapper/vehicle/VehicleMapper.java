/**
 * VehicleMapper.java	  V1.0   2019年10月8日 下午1:08:57
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.mapper.vehicle;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.tscloud.common.framework.mapper.BaseInterfaceMapper;
import com.tscloud.manager.entity.vehicle.Vehicle;

@Repository
public interface VehicleMapper extends BaseInterfaceMapper<Vehicle> {

	List<Vehicle> findByVehGroupID(Map<String, Object> map);

}
