package com.SpringAngular.javaSpringBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringAngular.javaSpringBackend.model.User;
import com.SpringAngular.javaSpringBackend.repositories.UserRepository;

@RestController
/*
 * the annotation enables Cross-Origin Resource Sharing (CORS) on the server
 * This step isn't always necessary. 
 * Since we are deploying our Angular Front-end to http://localhost:4200 
 * and our Boot Back-end to http://localhost:8080, 
 * the browser would otherwise deny requests from one to the other */
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	// Get userRepo
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}
}
