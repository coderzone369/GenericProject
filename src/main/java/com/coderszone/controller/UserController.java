package com.coderszone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderszone.model.User;
import com.coderszone.request.body.UserRegisterLoginRequest;
import com.coderszone.response.body.UserLoginResponse;
import com.coderszone.response.body.UserRegisterLoginResponse;
import com.coderszone.service.UserService;
import com.coderszone.validator.UserLoginRegisterValidator;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserLoginRegisterValidator validator;
	
	@Autowired
	UserService userService;
	
	@PostMapping("/customer/signup")
	public UserRegisterLoginResponse reisterUser(@RequestBody UserRegisterLoginRequest userRegisterRequest) {
		validator.validateRegisterUser();
		return null;
	}

	@PostMapping("/customer/login/email")
	public UserLoginResponse loginUser(@RequestBody UserRegisterLoginRequest userRegisterRequest) {
		return null;
	}


}
