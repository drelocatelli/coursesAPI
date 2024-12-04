package com.andressalocatelli.course.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.andressalocatelli.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(null, "Maria", "maria@gmail.com", "phone", "password");
		return ResponseEntity.ok().body(user);
	}
	
}
