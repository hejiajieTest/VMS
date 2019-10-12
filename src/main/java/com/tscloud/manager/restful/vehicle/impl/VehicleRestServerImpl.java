/**
 * VehicleRestServerImpl.java	  V1.0   2019年10月8日 上午11:40:10
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.restful.vehicle.impl;

import javax.annotation.Resource;
import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tscloud.common.framework.domain.TrackableEntity;
import com.tscloud.common.framework.rest.impl.BaseRestServerInterfaceImplNoDubbo;
import com.tscloud.common.framework.service.IBaseInterfaceService;
import com.tscloud.common.utils.StringUtils;
import com.tscloud.manager.entity.vehicle.Vehicle;
import com.tscloud.manager.restful.vehicle.IVehicleRestServer;
import com.tscloud.manager.service.vehicle.IVehicleService;
import com.tscloud.manager.util.ConstantsUtil;


@Controller
@Path(ConstantsUtil.RestPathPrefix.REST+"vehicle")
public class VehicleRestServerImpl extends BaseRestServerInterfaceImplNoDubbo<Vehicle> implements IVehicleRestServer{

	@Resource
	private IVehicleService vehicleService ;
	
	@Override
	public IBaseInterfaceService<Vehicle> getBaseInterface() {
		return vehicleService;
	}
	
}
