package com.yzt.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yzt.model.User;
import com.yzt.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/select")
	public void getUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
		User byUsername = userService.getByUsername("1");
		System.out.println(byUsername);
	}
	
}
