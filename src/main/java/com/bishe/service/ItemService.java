package com.bishe.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.bishe.pojo.Item;
import com.bishe.pojo.ItemMaterial;
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
	public void deleteItemType(Integer id);
	/*
	 * 添加商品
	 */
	public void addItem(Item item,
						Integer[] materialId,
						Integer itemTypeId,
						Integer[] materialNum);
	/*
	 * 添加原料
	 */
	public void addItemMaterial(ItemMaterial itemMaterial);
	/*
	 * 查找所有原料
	 */
	public List<ItemMaterial> findAllItemMaterial();
	/*
	 * 删除原料
	 */
	public void deleteItemMaterial(Integer id);
	/*
	 * 根据主键查找原料
	 */
	public ItemMaterial findItemMaterialByPrimaryKey(Integer id);
	/*
	 * 修改原料
	 */
	public void updateItemMaterial(ItemMaterial itemMaterial);
}
