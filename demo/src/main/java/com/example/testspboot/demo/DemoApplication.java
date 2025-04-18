package com.example.testspboot.demo;
import com.example.testspboot.demo.model.User;
import com.example.testspboot.demo.repository.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(UserRepository userRepository) {
		return args -> {
			userRepository.save(new User("Alice"));
			userRepository.save(new User("Bob"));
		};
	}
}

