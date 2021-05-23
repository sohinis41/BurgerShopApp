package com.springboot.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.springboot.entities.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.username = ?1 and u.password = ?2")
	public User findByEmail(@Param("username") String username, @Param("password") String password);
}
