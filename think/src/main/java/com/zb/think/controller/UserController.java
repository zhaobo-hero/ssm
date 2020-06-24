package com.zb.think.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zb.think.entity.User;
import com.zb.think.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private  UserService userService;
	@RequestMapping("/getUser")
	public String getUser() {
		User user = userService.findById(1);
		System.out.println(user.getName());
		return "test";
	}
}
