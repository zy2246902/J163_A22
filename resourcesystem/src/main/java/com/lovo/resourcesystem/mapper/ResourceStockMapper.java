package com.lovo.resourcesystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lovo.resourcesystem.entity.ResourceStockEntity;

/**
 * 车辆管理
 * @author admin
 *
 */
public interface ResourceStockMapper {
	/**
	 * 添加车辆
	 * @param resourceStock
	 */
	public void resourceStockAdd(ResourceStockEntity resourceStock);
	
	/**
	 * 根据ID删除车辆
	 * @param id
	 */
	public void resourceStockdelete(Integer id);
	
	/**
	 * 查询车辆 展示页面
	 * @return
	 */
	public List<ResourceStockEntity> ResourceStockFind();
	
	/**
	 * 根据车辆状态查询车辆
	 * @param state 状态
	 * @param index 起始索引
	 * @param currentPage 当前页面
	 * @return
	 */
	public List<ResourceStockEntity> resourceStockFind1(String state,int index,int currentPage);
	
	
	/**
	 * 根据ID修改状态
	 * @param id
	 */
	public void  resourceStockRevise(String state,Integer id);
	
	/**
     * 获取动态查询的总页数
     * @param state 状态
     * @return 总页数
     */
    public int getTotalPageByItem(String state);
}
