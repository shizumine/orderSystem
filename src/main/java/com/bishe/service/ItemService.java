package com.bishe.service;

import java.util.List;

import com.bishe.pojo.ItemType;

public interface ItemService {
	/*
	 * 添加商品种类
	 */
	public void addItemType(ItemType itemType);
	/*
	 * 查找商品种类
	 */
	public List<ItemType> findAllItemType();
	/*
	 * 根据主键查找商品种类
	 */
	public ItemType findItemTypeByPrimaryKey(Integer id);
	/*
	 * 修改商品种类
	 */
	public void updateItemType(ItemType itemType);
	/*
	 * 根据主键删除商品种类
	 */
	public void deleteItemTypeByPrimary(Integer id);
}
