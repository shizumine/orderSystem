package com.bishe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bishe.mapper.ItemItemMaterialMapper;
import com.bishe.mapper.ItemItemTypeMapper;
import com.bishe.mapper.ItemMapper;
import com.bishe.mapper.ItemMaterialMapper;
import com.bishe.mapper.ItemTypeMapper;
import com.bishe.pojo.Item;
import com.bishe.pojo.ItemItemMaterial;
import com.bishe.pojo.ItemItemType;
import com.bishe.pojo.ItemMaterial;
import com.bishe.pojo.ItemMaterialExample;
import com.bishe.pojo.ItemType;
import com.bishe.pojo.ItemTypeExample;
import com.bishe.service.ItemService;
import com.bishe.util.UUIDUtil;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemTypeMapper itemTypeMapper;
	@Autowired
	private ItemMaterialMapper itemMaterialMapper;
	@Autowired
	private ItemMapper itemMapper;
	@Autowired
	private ItemItemTypeMapper itemItemTypeMapper;
	@Autowired
	private ItemItemMaterialMapper itemItemMaterialMapper;
	
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

	public void addItem(Item item, Integer[] materialId, Integer itemTypeId,
			Integer[] materialNum) {
		//将数据存放到item表
		itemMapper.insert(item);
		//将数据存放到菜品菜品种类关联表中
		ItemItemType iit = new ItemItemType();
		iit.setItemid(item.getId());
		iit.setTypeid(itemTypeId);
		itemItemTypeMapper.insert(iit);
		//将数据存放菜品原料关联表当中
		for(int i=0;i<materialId.length;i++){
			ItemItemMaterial iim = new ItemItemMaterial();
			iim.setItemid(item.getId());
			iim.setMaterialid(materialId[i]);
			iim.setNum(materialNum[i]);
			itemItemMaterialMapper.insert(iim);
		}
	}
}
