package com.springboot.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.entities.User;
import com.springboot.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String displayLogin(Model model) {

		User user = new User();
		model.addAttribute("user", user);
		return "user_login";
	}

	@PostMapping("/login")
	public String processLogin(@Valid @ModelAttribute("user") User user, Errors errors, Model model) {
		model.addAttribute("userReg", userService.processLogin(user));

		if (errors.hasErrors() || null == model.getAttribute("userReg")) {
			return "user_login";
		}
		return "login_success";
	}

	@GetMapping("/signup")
	public String displaySignUp(Model model) {
		User user = new User();
		model.addAttribute("userReg", user);
		return "user_signup";
	}

	@PostMapping("/signup")
	public String processSignUp(@Valid @ModelAttribute("userReg") User user, Errors errors, Model model) {
		model.addAttribute("userReg", userService.addUser(user));
		if (errors.hasErrors()) {
			return "user_signup";
		}
		return "redirect:/user/login";
	}
	
	@GetMapping("/update")
	public String displayUserUpdate(Model model) {
		User user = new User();
		model.addAttribute("userupdate", user);
		return "user_update";
	}
	//
	@PostMapping("/update")
	public String update(@Valid @ModelAttribute("userupdate") User user, Errors errors, Model model) {
		model.addAttribute("userupdate", userService.updateUser(user));
		if (errors.hasErrors()) {
			return "user_update";
		}
		return "redirect:/";
	}
	
	
	
}
