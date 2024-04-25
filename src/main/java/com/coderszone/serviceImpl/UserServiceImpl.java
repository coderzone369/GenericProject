package com.coderszone.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderszone.model.User;
import com.coderszone.repository.UserRepository;
import com.coderszone.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;


	@Override
	public String isLoginVaildUser(User user) {
		if (userRepository.isEmailUserExists(user.geteMailId()) > 0 || userRepository.isMobileNumberExists(user.getMobileNo()) > 0) {
			userRepository.save(user);
			return "Welcome";
		} else
			return "This id not available";

	}

	@Override
	public String createUser(User user) {
		if (userRepository.isEmailUserExists(user.geteMailId()) == 0 && userRepository.isMobileNumberExists(user.getMobileNo()) == 0) {
			userRepository.save(user);
			return "Loging Sucessfully";
		} else
			return "This Email Already Exist";
	}
}
