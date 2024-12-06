package com.andressalocatelli.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andressalocatelli.course.entities.User;
import com.andressalocatelli.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		List<User> users = userRepository.findAll();
		return users;
	}

	public User findById(Long id) {
		User user = userRepository.findById(id).get(); 
		return user;
	}

}
