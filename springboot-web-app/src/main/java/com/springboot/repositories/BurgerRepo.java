package com.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entities.Burger;

@Repository
public interface BurgerRepo extends CrudRepository<Burger, Integer> {

}
