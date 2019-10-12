/**
 * IVehicleRestServer.java	  V1.0   2019年10月8日 上午11:38:55
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.service.vehDataPart;

import com.tscloud.common.framework.Exception.ServiceException;
import com.tscloud.common.framework.service.IBaseInterfaceService;
import com.tscloud.manager.entity.vehDataPart.VehDataPart;

public interface IVehDataPartService extends IBaseInterfaceService<VehDataPart>{

	public VehDataPart getByVehId(String id) throws ServiceException;

}
