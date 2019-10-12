/**
 * VehGroupMainRestServiceImpl.java	  V1.0   2019年10月9日 下午5:15:56
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.restful.VehGroupMain.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.tscloud.common.framework.rest.impl.BaseRestServerInterfaceImplNoDubbo;
import com.tscloud.common.framework.service.IBaseInterfaceService;
import com.tscloud.manager.entity.vehGroupMain.VehGroupMain;
import com.tscloud.manager.restful.VehGroupMain.IVehGroupMainRestServer;
import com.tscloud.manager.service.VehGroupMain.IVehGroupMainService;
import com.tscloud.manager.util.ConstantsUtil;
import com.tscloud.manager.util.TreeNodeDto;
@Controller
@Path(ConstantsUtil.RestPathPrefix.REST+"vehGroupMain")
public class VehGroupMainRestServiceImpl extends BaseRestServerInterfaceImplNoDubbo<VehGroupMain> implements IVehGroupMainRestServer{
	
	@Resource
	private IVehGroupMainService vehGroupMainService ;
    private List<TreeNodeDto> nodeList ;
	@Override
	public IBaseInterfaceService<VehGroupMain> getBaseInterface() {
		return vehGroupMainService;
	}
	
	
	@Override
	public List getZTree(String jsonStr) {
		//获取所有叶子
		VehGroupMain vehGroupMain = JSON.parseObject(jsonStr, this.getEntityClass());
		nodeList = vehGroupMainService.getZTree(vehGroupMain.getUserId()) ;
		return nodeList;
	}


	//获取叶子底下车辆
	@Override
	public List getZTreeVehicle(String jsonStr) {
		VehGroupMain vehGroupMain = JSON.parseObject(jsonStr, VehGroupMain.class);
		nodeList = vehGroupMainService.getVehicleByParentId(vehGroupMain.getId()) ;
		return nodeList;
	}

}
