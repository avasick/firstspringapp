package com.example.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.firstspring.persistence.repo")
@EntityScan("com.example.firstspring.persistence.model")

@SpringBootApplication
public class FirstspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstspringApplication.class, args);
	}

}
