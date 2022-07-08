package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzurespringbootApplication {
	@GetMapping("/message")
	public String message() {
		return "we want to deploy this app on azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzurespringbootApplication.class, args);
	}

}
