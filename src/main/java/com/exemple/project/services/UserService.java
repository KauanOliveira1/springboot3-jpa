package com.exemple.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.project.entities.User;
import com.exemple.project.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository; 
	
	public List<User> findAll(){
		return repository.findAll();
	}
}
