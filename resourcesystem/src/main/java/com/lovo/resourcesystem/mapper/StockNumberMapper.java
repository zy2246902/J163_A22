package com.lovo.resourcesystem.mapper;

import java.util.List;

import com.lovo.resourcesystem.entity.StockNumberEntity;
/**
 * 资源详情
 * @author admin
 *
 */
public interface StockNumberMapper {

	/**
	 * 查询全部可用资源
	 * @return
	 */
	public List<StockNumberEntity> stockNumberFind();
}
