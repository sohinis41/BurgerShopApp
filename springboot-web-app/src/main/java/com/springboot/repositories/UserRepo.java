package com.springboot.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.springboot.entities.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.username = ?1 and u.password = ?2")
	public User findByUserDetails(@Param("username") String username, @Param("password") String password);
	
	@Modifying
	@Query(value = "UPDATE User u SET u.email = ?1 WHERE u.username = ?2 and u.password = ?3",nativeQuery=true)
	public int userUpdate(@Param("email") String email, @Param("username") String username, @Param("password") String password);
	
	
}
