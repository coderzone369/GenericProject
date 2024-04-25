package com.coderszone.service;

import org.springframework.stereotype.Service;

import com.coderszone.model.User;

@Service
public interface  UserService {
	
	//User update(User user);

	 String createUser(User user);

	 String isLoginVaildUser(User user);

}
