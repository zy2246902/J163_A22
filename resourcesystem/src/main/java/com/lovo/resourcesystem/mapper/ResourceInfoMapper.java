package com.lovo.resourcesystem.mapper;

import java.util.List;

import com.lovo.resourcesystem.entity.ResourceInfoEntity;

/**
 * 派遣资源操作
 * @author admin
 *
 */
public interface ResourceInfoMapper {

	/**
     * 添加资源派遣
     * @param resourceInfo
     */
	public void resourceInfoEntityAdd(ResourceInfoEntity resourceInfo);
	
	/**
	 * 派遣资源展示
	 * @return 事件编号 负责人  派遣时间  
	 */
	public List<ResourceInfoEntity> resourceInfoEntityFind();
}
