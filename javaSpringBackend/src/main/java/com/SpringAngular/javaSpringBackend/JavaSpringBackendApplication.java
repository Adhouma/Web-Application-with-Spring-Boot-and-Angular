package com.SpringAngular.javaSpringBackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.SpringAngular.javaSpringBackend.model.User;
import com.SpringAngular.javaSpringBackend.repositories.UserRepository;

@SpringBootApplication
public class JavaSpringBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBackendApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args ->{ 
			User user1 = new User("Amin", "amin.york@gmail.com");
			User user2 = new User("Inara", "inara.meyer@yahoo.fr");
			User user3 = new User("Kaydee", "kaydee.wagner@gmail.com");
			User user4 = new User("Abbie", "abbie.tierney@yahoo.fr");
			User user5 = new User("Austen", "austen.coles@gmail.com");
			
			userRepository.save(user1);
			userRepository.save(user2);
			userRepository.save(user3);
			userRepository.save(user4);
			userRepository.save(user5);
			
			System.out.println("id:" + user1.getId() + ", Name: " + user1.getName() + ", email: " + user1.getEmail());
			System.out.println("id:" + user2.getId() + ", Name: " + user2.getName() + ", email: " + user2.getEmail());
			System.out.println("id:" + user3.getId() + ", Name: " + user3.getName() + ", email: " + user3.getEmail());
			System.out.println("id:" + user4.getId() + ", Name: " + user4.getName() + ", email: " + user4.getEmail());
			System.out.println("id:" + user5.getId() + ", Name: " + user5.getName() + ", email: " + user5.getEmail());
		};	
	}
}
