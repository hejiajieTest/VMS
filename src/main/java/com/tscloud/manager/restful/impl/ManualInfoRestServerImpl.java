package com.tscloud.manager.restful.impl;

import javax.annotation.Resource;
import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;

import com.tscloud.common.framework.rest.impl.BaseRestServerInterfaceImplNoDubbo;
import com.tscloud.common.framework.service.IBaseInterfaceService;
import com.tscloud.manager.entity.ManualInfo;
import com.tscloud.manager.restful.IManualInfoRestServer;
import com.tscloud.manager.service.IManualService;

@Controller
@Path(value = "/manualInfo")
public class ManualInfoRestServerImpl extends BaseRestServerInterfaceImplNoDubbo<ManualInfo> implements IManualInfoRestServer{
	@Resource
	private IManualService manualService ;
	
	@Override
	public IBaseInterfaceService<ManualInfo> getBaseInterface() {
		return manualService;
	}
	
}
