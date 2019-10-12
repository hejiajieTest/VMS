/**
 * IVehicleService.java	  V1.0   2019年10月8日 上午11:41:38
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.service.VehGroupMain;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tscloud.common.framework.service.IBaseInterfaceService;
import com.tscloud.manager.entity.vehGroupMain.VehGroupMain;
import com.tscloud.manager.util.TreeNodeDto;

@Service
public interface IVehGroupMainService extends IBaseInterfaceService<VehGroupMain>{

	List<TreeNodeDto> getZTree(String userId);

	List<TreeNodeDto> getVehicleByParentId(String id);

}
