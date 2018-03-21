package com.bishe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bishe.mapper.ItemMaterialMapper;
import com.bishe.mapper.ItemTypeMapper;
import com.bishe.pojo.Item;
import com.bishe.pojo.ItemMaterial;
import com.bishe.pojo.ItemMaterialExample;
import com.bishe.pojo.ItemType;
import com.bishe.pojo.ItemTypeExample;
import com.bishe.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemTypeMapper itemTypeMapper;
	@Autowired
	private ItemMaterialMapper itemMaterialMapper;
	
	public void addItemType(ItemType itemType) {
		itemTypeMapper.insert(itemType);
	}

	public List<ItemType> findAllItemType() {
		ItemTypeExample example = new ItemTypeExample();
		List<ItemType> list = itemTypeMapper.selectByExample(example);
		return list;
	}
	
	public ItemType findItemTypeByPrimaryKey(Integer id) {
		return itemTypeMapper.selectByPrimaryKey(id);
	}

	public void updateItemType(ItemType itemType) {
		itemTypeMapper.updateByPrimaryKey(itemType);
	}

	public void deleteItemType(Integer id) {
		itemTypeMapper.deleteByPrimaryKey(id);
	}

	public void addItem(Item item) {
		//TODO sth
	}
	
	public void addItemMaterial(ItemMaterial itemMaterial) {
		itemMaterialMapper.insert(itemMaterial);
	}

	public List<ItemMaterial> findAllItemMaterial() {
		ItemMaterialExample example = new ItemMaterialExample();
		List<ItemMaterial> list = itemMaterialMapper.selectByExample(example);
		return list;
	}

	public void deleteItemMaterial(Integer id) {
		itemMaterialMapper.deleteByPrimaryKey(id);
	}

	public ItemMaterial findItemMaterialByPrimaryKey(Integer id) {
		return itemMaterialMapper.selectByPrimaryKey(id);
	}

	public void updateItemMaterial(ItemMaterial itemMaterial) {
		itemMaterialMapper.updateByPrimaryKey(itemMaterial);
	}
}
