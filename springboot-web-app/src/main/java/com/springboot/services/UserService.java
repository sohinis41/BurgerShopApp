package com.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.User;
import com.springboot.repositories.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	// login
	public User processLogin(User user) {
		User userDetail = userRepo.findByEmail(user.getUsername(), user.getPassword());
		return userDetail;
	}

	// sign up
	public User addUser(User newUser) {
		User newUserDetail = newUser = userRepo.save(newUser);
		return newUserDetail;
	}

}
