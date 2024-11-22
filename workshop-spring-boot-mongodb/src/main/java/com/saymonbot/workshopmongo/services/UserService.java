package com.saymonbot.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saymonbot.workshopmongo.domain.User;
import com.saymonbot.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAl() {
		return repo.findAll();
	}
}