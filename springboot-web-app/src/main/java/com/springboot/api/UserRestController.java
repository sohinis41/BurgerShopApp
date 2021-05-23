package com.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entities.User;
import com.springboot.services.UserService;

//returns xml content or json data
@RestController
public class UserRestController {

	@Autowired
	UserService userService;

	@PostMapping(path = "/user/login", consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<User> processLogin(@RequestBody User user) {

		user = userService.processLogin(user);
		if (user == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

	@PostMapping(path = "/user/signup", consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<User> addUser(@RequestBody User newUser) {
		newUser = userService.addUser(newUser);
		if (newUser == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(newUser, HttpStatus.OK);

	}

}
