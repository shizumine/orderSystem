package com.bishe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 页面跳转Controller
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * @author	shizumine
 * @date	2018年3月13日下午1:22:05
 * @version 1.0
 */
@Controller
public class PageController {
	/*
	 * 打开首页
	 */
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	/*
	 * 展示前台页面
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	/*
	 * 展示后台页面
	 */
	@RequestMapping("/manage/{page}")
	public String showManagePage(@PathVariable String page){
		return "manage/"+page;
	}
}
