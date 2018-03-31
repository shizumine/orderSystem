package com.bishe.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bishe.pojo.User;
import com.bishe.service.UserService;

@Controller
@RequestMapping("/admin")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/loginCommit")
	@ResponseBody
	public Integer loginCommit(String username,String password,HttpSession session,Model model) throws Exception{
		Integer errorNum ;
		if(username.equals("")||password.equals("")){
			errorNum = -1;
			return errorNum;
		}
		//获取user
		User user = userService.login(username,password);
		
		if(user.getId()==null){
			errorNum = -2;
			return errorNum;
		}
		
		session.setAttribute("user",user);
		return null;
	}
}
