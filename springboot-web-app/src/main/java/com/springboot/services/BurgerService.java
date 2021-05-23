package com.springboot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.Burger;
//import com.springboot.models.Burger;
import com.springboot.repositories.BurgerRepo;

@Service
public class BurgerService {

	@Autowired
	BurgerRepo burgerRepo;

	public List<Burger> getAllBurgers() {
		List<Burger> allBurgers = new ArrayList<>();
		burgerRepo.findAll().forEach(allBurgers::add);
		return allBurgers;
	}

	public Burger getBurgerById(int id) {
		Optional<Burger> burger = burgerRepo.findById(id);
		return burger.get();
	}

	public Burger filterBurgers(Predicate<Burger> strategy) {
		// TODO Auto-generated method stub
		return getAllBurgers().stream().filter(strategy).findFirst().orElse(null);
	}

	@Transactional
	public Burger addBurger(Burger newBurger) {
		newBurger = burgerRepo.save(newBurger);
		return newBurger;
	}

}
