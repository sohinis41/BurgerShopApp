package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.*")
@EnableJpaRepositories("com.springboot.repositories")
@EntityScan("com.springboot.entities")
public class BurgerWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BurgerWebApplication.class, args);
	}

	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(BurgerWebApplication.class);
	  }
}
