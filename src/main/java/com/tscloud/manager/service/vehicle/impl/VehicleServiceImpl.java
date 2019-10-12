/**
 * VehicleServiceImpl.java	  V1.0   2019年10月8日 上午11:42:34
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.service.vehicle.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tscloud.common.framework.mapper.BaseInterfaceMapper;
import com.tscloud.common.framework.service.impl.BaseInterfaceServiceImpl;
import com.tscloud.manager.entity.vehicle.Vehicle;
import com.tscloud.manager.mapper.vehicle.VehicleMapper;
import com.tscloud.manager.service.vehicle.IVehicleService;

@Service
public class VehicleServiceImpl extends BaseInterfaceServiceImpl<Vehicle> implements IVehicleService{

	@Resource
	private VehicleMapper vehicleMapper ;
	@Override
	public BaseInterfaceMapper<Vehicle> getBaseInterfaceMapper() {
		return vehicleMapper;
	}

}
