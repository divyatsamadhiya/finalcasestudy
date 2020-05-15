package com.example.finalcasestudy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finalcasestudy.repo.UserRepository;
import com.example.finalcasestudy.model.User;
//import com.example.finalcasestudy.repo.UserRepository;
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	
	public User save(User user) {
		return userRepository.save(user);
		}


}
