package com.tscloud.manager.job;


import java.util.Date;
import java.util.List;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.tscloud.manager.entity.userPermission.UserPermission;
import com.tscloud.manager.entity.vehDataPart.VehDataPart;
import com.tscloud.manager.mapper.userPermission.UserPermissionMapper;
import com.tscloud.manager.mapper1.vehDataPart.VehDataPartMapper;
import com.tscloud.manager.util.SpringContextsUtil;
public class QuartzJobExample extends QuartzJobBean {
	UserPermissionMapper userPermissionService = (UserPermissionMapper) SpringContextsUtil.getBean("userPermissionMapper") ;
	VehDataPartMapper vehDataPartMapper = (VehDataPartMapper) SpringContextsUtil.getBean("vehDataPartMapper") ;
    /**
     * 要调度的具体任务
     */
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        // 获取参数
/*        JobDataMap mergedJobDataMap = context.getMergedJobDataMap();
        String name = (String) mergedJobDataMap.get("name");
        System.out.println(new Date().toLocaleString() + "定时任务执行中 ......" + "传递的参数为" + name);*/
      /*  List<VehDataPart> list = vehDataPartMapper.findAll() ;
        List<UserPermission> list1 = userPermissionService.findAll() ;
        System.out.println(list.size()) ;
        System.out.println(list1.size());*/
    }
}
