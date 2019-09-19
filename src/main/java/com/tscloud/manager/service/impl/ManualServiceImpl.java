package com.tscloud.manager.service.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tscloud.common.framework.mapper.BaseInterfaceMapper;
import com.tscloud.common.framework.service.impl.BaseInterfaceServiceImpl;
import com.tscloud.manager.entity.ManualInfo;
import com.tscloud.manager.mapper.ManualInfoMapper;
import com.tscloud.manager.service.IManualService;

@Service 
public class ManualServiceImpl extends BaseInterfaceServiceImpl<ManualInfo> implements IManualService{

    @Resource
	public ManualInfoMapper manualInfoMapper ;

	@Override
	public BaseInterfaceMapper<ManualInfo> getBaseInterfaceMapper() {
		return manualInfoMapper;
	}

}
