package com.bishe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bishe.mapper.ItemMapper;
import com.bishe.mapper.ItemMaterialMapper;
import com.bishe.mapper.ItemTypeMapper;
import com.bishe.pojo.ItemExample;
import com.bishe.pojo.ItemType;
import com.bishe.pojo.ItemTypeExample;
import com.bishe.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;
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

	public void deleteItemTypeByPrimary(Integer id) {
		itemTypeMapper.deleteByPrimaryKey(id);
	}
}
