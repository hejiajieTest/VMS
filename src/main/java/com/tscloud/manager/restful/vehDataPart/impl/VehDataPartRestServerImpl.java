/**
 * VehDataPartRestServerImpl.java	  V1.0   2019年10月8日 下午5:28:41
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.restful.vehDataPart.impl;

import javax.annotation.Resource;
import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tscloud.common.framework.domain.TrackableEntity;
import com.tscloud.common.framework.rest.impl.BaseRestServerInterfaceImplNoDubbo;
import com.tscloud.common.framework.service.IBaseInterfaceService;
import com.tscloud.common.utils.StringUtils;
import com.tscloud.manager.entity.vehDataPart.VehDataPart;
import com.tscloud.manager.restful.vehDataPart.IVehDataPartRestServer;
import com.tscloud.manager.service.vehDataPart.IVehDataPartService;
import com.tscloud.manager.util.ConstantsUtil;

@Controller
@Path(ConstantsUtil.RestPathPrefix.REST+"vehDataPart")
public class VehDataPartRestServerImpl extends BaseRestServerInterfaceImplNoDubbo<VehDataPart> implements IVehDataPartRestServer{

	@Resource
	private IVehDataPartService vehDataPartService ;
	
	@Override
	public IBaseInterfaceService<VehDataPart> getBaseInterface() {
		return vehDataPartService;
	}

	@Override
	public String getByVehId(String id) {
		{
		    String result = "";
		    try {
		      if (StringUtils.isNotBlank(new String[] { id })) {
		    	  VehDataPart entity = vehDataPartService.getByVehId(id);
		        if (entity != null) {
		          result = JSON.toJSONStringWithDateFormat(entity, "yyyy-MM-dd HH:mm:ss", new SerializerFeature[0]);
		        }
		        this.jsonView.successPack(result);
		      }
		    } catch (Exception e) {
		      this.jsonView.failPack(e);
		    }
		    result = JSON.toJSONString(this.jsonView);
		    return result;
		  }
	}

}
