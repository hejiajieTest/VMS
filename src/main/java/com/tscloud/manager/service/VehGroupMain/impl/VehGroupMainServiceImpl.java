/**
 * VehicleServiceImpl.java	  V1.0   2019年10月8日 上午11:42:34
 *
 * Copyright 2019 FUJIAN FUJITSU COMMUNICATION SOFTWARE CO., LTD. All rights reserved.
 *
 * Modification history(By    Time    Reason):
 * 
 * Description:
 */

package com.tscloud.manager.service.VehGroupMain.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tscloud.common.framework.mapper.BaseInterfaceMapper;
import com.tscloud.common.framework.service.impl.BaseInterfaceServiceImpl;
import com.tscloud.manager.entity.vehGroupMain.VehGroupMain;
import com.tscloud.manager.entity.vehicle.Vehicle;
import com.tscloud.manager.mapper.vehGroupMain.VehGroupMainMapper;
import com.tscloud.manager.mapper.vehicle.VehicleMapper;
import com.tscloud.manager.service.VehGroupMain.IVehGroupMainService;
import com.tscloud.manager.util.TreeNodeDto;

@Service
public class VehGroupMainServiceImpl extends BaseInterfaceServiceImpl<VehGroupMain> implements IVehGroupMainService{

	@Resource
	private VehGroupMainMapper vehGroupMainMapper ;
	
	@Resource
	private VehicleMapper vehicleMapper ;
	
	@Override
	public BaseInterfaceMapper<VehGroupMain> getBaseInterfaceMapper() {
		return vehGroupMainMapper;
	}
	@Override
	public List<TreeNodeDto> getZTree(String userId) {
		List<TreeNodeDto> nodes = new ArrayList<TreeNodeDto>();
		Map<String,Object> map = new HashMap<String,Object>() ;
		map.put("userId", userId) ;
		List<VehGroupMain> list1 = vehGroupMainMapper.findGroupByUserId(map);
		List<VehGroupMain> list = vehGroupMainMapper.findByUserId(map);
		for(VehGroupMain vehGroupMain : list1){
			//添加所有标签
			TreeNodeDto treeNodeDto1 = getTreeNode2(vehGroupMain) ;
			nodes.add(treeNodeDto1) ;
			
		}
		for(VehGroupMain vehGroupMain : list){
			//添加车辆
			TreeNodeDto treeNodeDto1 = getTreeNode3(vehGroupMain) ;
			nodes.add(treeNodeDto1) ;
			
		}
		return nodes;
	}
	private TreeNodeDto getTreeNode2(VehGroupMain vehGroupMain) {
		TreeNodeDto node = new TreeNodeDto();
		node.setId(vehGroupMain.getId());
		node.setpId(vehGroupMain.getpId());
		node.setName(vehGroupMain.getChildName());
		if(vehGroupMain.getNum1() == 0 && vehGroupMain.getNum() == 0){
			node.setIsParent("false");
		}
		node.setType("1");
		return node;
	}
	private TreeNodeDto getTreeNode3(VehGroupMain vehGroupMain) {
		TreeNodeDto node = new TreeNodeDto();
		node.setId(vehGroupMain.getId());
		node.setpId(vehGroupMain.getpId());
		node.setName(vehGroupMain.getChildName());
		node.setIsParent("false");
		node.setType("2");
		return node;
	}
	private TreeNodeDto getTreeNode1(Vehicle vehicle) {
		TreeNodeDto node = new TreeNodeDto();
		node.setId(vehicle.getId());
		node.setpId(vehicle.getpId());
		node.setName(vehicle.getChildName());
		node.setIsParent("false");
		return node;
		/*for(int i = 0 ; i < list.size() ; i++){
			for(int j = 0 ; j < lsit1.size() ; j++){
				if(list.get(i).getId().equals(lsit1.get(j).getpId())){
					lsit1.remove(j) ;
					j--;
				}
			}
		}*/
	}
	@Override
	public List<TreeNodeDto> getVehicleByParentId(String id) {
		List<TreeNodeDto> nodes = new ArrayList<TreeNodeDto>();
		//判断底下车组是否含有车辆
		Map<String,Object> vehGroupMap = new HashMap<String,Object>() ;
		vehGroupMap.put("vehGroupID", id);
		List<Vehicle> vehicleList= vehicleMapper.findByVehGroupID(vehGroupMap);
		for(Vehicle vehicle :vehicleList){
			TreeNodeDto treeNodeDto = getTreeNode1(vehicle) ;
			nodes.add(treeNodeDto) ;
		}
		return nodes;
	}
}
