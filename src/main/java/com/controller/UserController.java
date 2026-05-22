package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UserDTO.UserDto;
import com.entity.User;
import com.service.UserService;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService service;
	
	//register
	@PostMapping("/register")
	public String register(@RequestBody User u)
	{
		return service.userregister(u);
	}
	
	//login
	@PostMapping("/login")
	public User login(@RequestBody UserDto user)
	{
		return service.loginuser(user);
	}

}
