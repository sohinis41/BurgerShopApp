package com.springboot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entities.Burger;
//import com.springboot.models.Burger;
import com.springboot.services.BurgerService;

//return xml content or json data
@RestController
public class BurgerRestController {
	@Autowired
	BurgerService burgerService;

	@GetMapping("/burgers")
	public List<Burger> getAllBurgers() {
		return burgerService.getAllBurgers();
	}

	@GetMapping("/burger/{id}")
	public ResponseEntity<Burger> getBurgers(@PathVariable("id") int burgerId) {
		Burger burger = burgerService.getBurgerById(burgerId);
		if (burger == null) {
			return new ResponseEntity<Burger>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Burger>(burger, HttpStatus.OK);

	}

	@PostMapping(path = "/burgers/add", consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Burger> addBurger(@RequestBody Burger newBurger) {
		Burger burger = burgerService.addBurger(newBurger);
		if (burger == null) {
			return new ResponseEntity<Burger>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Burger>(burger, HttpStatus.OK);

	}
	
	

}
