package com.bishe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bishe.pojo.ItemType;
import com.bishe.service.ItemService;

@Controller
@RequestMapping("/manage")
public class ItemController {
	@Autowired
	private ItemService itemService;
	/*
	 * 添加商品种类
	 */
	@RequestMapping("/addItemType")
	public String addItemType(){
		return "manage/addItemType";
	}
	/*
	 * 添加商品种类提交
	 */
	@RequestMapping("/addItemTypeCommit")
	public String addItemTypeCommit(ItemType itemType){
		itemService.addItemType(itemType);
		return "redirect:/manage/findAllItemType";
	}
	/*
	 * 查询所有商品种类
	 */
	@RequestMapping("/findAllItemType")
	public String findItemType(Model model){
		List<ItemType> itemTypes = itemService.findAllItemType();
		model.addAttribute("itemTypes",itemTypes);
		return "manage/findItemType";
	}
	/*
	 * 修改商品种类名称
	 */
	@RequestMapping("/editItemType/{id}")
	public String editItemType(@PathVariable Integer id,Model model){
		ItemType itemType = itemService.findItemTypeByPrimaryKey(id);
		model.addAttribute("itemType",itemType);
		return "/manage/editItemType";
	}
	/*
	 * 修改商品种类提交
	 */
	@RequestMapping("/editItemTypeCommit")
	public String editItemTypeCommit(ItemType itemType){
		itemService.updateItemType(itemType);
		return "redirect:/manage/findAllItemType";
	}
	/*
	 * 根据主键删除商品种类
	 */
	@RequestMapping("/deleteItemType/{id}")
	public String deleteItemType(@PathVariable Integer id){
		itemService.deleteItemTypeByPrimary(id);
		return "redirect:/manage/findAllItemType";
	}
}
