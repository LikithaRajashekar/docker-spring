package com.springdockerapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerSpringApplication {
	
	@GetMapping("/welcome")
	public String getStatus() {
		return "application is running..!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerSpringApplication.class, args);
	}

}
