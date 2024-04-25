package com.coderszone.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.coderszone")
@EnableJpaRepositories("com.coderszone.repository")
@EntityScan("com.coderszone.model")
public class GenericProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenericProjectApplication.class, args);
	}

}
