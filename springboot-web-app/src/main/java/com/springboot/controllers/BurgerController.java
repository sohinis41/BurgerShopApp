package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.entities.Burger;
//import com.springboot.models.Burger;
import com.springboot.services.BurgerService;

@Controller
@RequestMapping("/burgers")
public class BurgerController {
	@Autowired
	private BurgerService burgerService;

	@GetMapping("/all")
	public String getAllBurgers(Model model) {

		model.addAttribute("burgers", burgerService.getAllBurgers());
		return "burger_all";
	}

	@GetMapping("/{burgerId}")
	public String getBurgerById(Model model, @PathVariable("burgerId") int burgerId) {

		model.addAttribute("burger", burgerService.getBurgerById(burgerId));

		return "burger";

	}

	@GetMapping("/add")
	public String add(Model model) {
		Burger burger = new Burger();
		model.addAttribute("add", burger);
		return "add_burger";
	}

	
	@PostMapping("/add")
	public String processAdd(@ModelAttribute("add") Burger burger, Errors errors, Model model) {
		model.addAttribute("add", burgerService.addBurger(burger));
		if (errors.hasErrors()) {
			return "add_burger";
		}
		return "redirect:/";
	}

}
