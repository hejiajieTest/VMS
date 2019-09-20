package com.tscloud.manager.restful.manualInfo.impl;

import javax.annotation.Resource;
import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;

import com.tscloud.common.framework.rest.impl.BaseRestServerInterfaceImplNoDubbo;
import com.tscloud.common.framework.service.IBaseInterfaceService;
import com.tscloud.manager.entity.manualInfo.ManualInfo;
import com.tscloud.manager.restful.manualInfo.IManualInfoRestServer;
import com.tscloud.manager.service.manualInfo.IManualService;
import com.tscloud.manager.util.ConstantsUtil;

@Controller
@Path(ConstantsUtil.RestPathPrefix.REST+"manualInfo")
public class ManualInfoRestServerImpl extends BaseRestServerInterfaceImplNoDubbo<ManualInfo> implements IManualInfoRestServer{
	@Resource
	private IManualService manualService ;
	
	@Override
	public IBaseInterfaceService<ManualInfo> getBaseInterface() {
		return manualService;
	}
	
}
