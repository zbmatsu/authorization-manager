package com.zbmatsu.iam.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zbmatsu.iam.configuration.CustomConfigBean;
import com.zbmatsu.iam.model.User;

import io.swagger.annotations.ApiOperation;

@RestController
public class TestController {

	@Autowired
	protected CustomConfigBean customConfigBean;
	
	@ApiOperation(value="获取用户列表", notes="")
	@GetMapping("/test/{id}")
	public User getUser(@PathVariable int id){
		
		User user = new User();
		user.setId(id);
		user.setName(customConfigBean.getUsername());
		user.setDateTime(LocalDateTime.now());
		
		return user;
	}
}
