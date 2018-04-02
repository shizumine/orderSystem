package com.bishe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bishe.mapper.UserMapper;
import com.bishe.pojo.User;
import com.bishe.pojo.UserExample;
import com.bishe.service.UserService;
import com.bishe.util.MD5ConvertUtil;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User login(String username, String password){
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(MD5ConvertUtil.convert(password));
		List<User> list = userMapper.selectByExample(example);
		
		User user = new User();
		if(list.size()>0){
			user = list.get(0);
		}
		return user;
	}

}
