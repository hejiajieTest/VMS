/**
 * IVehDataPartRestServer.java	  V1.0   2019年10月8日 下午5:28:16
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.restful.vehDataPart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.tscloud.common.framework.rest.BaseRestServerInterface;

public interface IVehDataPartRestServer extends BaseRestServerInterface{

	  @GET
	  @Path("getByVehId")
	  public String getByVehId(@QueryParam("id") String paramString);
	  
}
