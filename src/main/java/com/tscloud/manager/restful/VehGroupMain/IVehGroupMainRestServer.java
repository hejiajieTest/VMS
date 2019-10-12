/**
 * IVehicleRestServer.java	  V1.0   2019年10月8日 上午11:38:55
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.restful.VehGroupMain;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.tscloud.common.framework.rest.BaseRestServerInterface;

public interface IVehGroupMainRestServer extends BaseRestServerInterface{

  @POST
  @Path("getZTree")
  @Consumes({"application/json"})
  @Produces({"application/json"})
  public List getZTree(String paramString) ;
  
  @POST
  @Path("getZTreeVehicle")
  @Consumes({"application/json"})
  @Produces({"application/json"})
  public List getZTreeVehicle(String paramString) ;
}
