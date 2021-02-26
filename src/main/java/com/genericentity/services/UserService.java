package com.genericentity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genericentity.entities.User;
import com.genericentity.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User findById(Long id) {
		return repository.findById(id).get();
	}

	public List<User> findAll() {
		return repository.findAll();
	}
}
