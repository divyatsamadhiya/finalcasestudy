package com.example.finalcasestudy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.finalcasestudy.model.User;
import com.example.finalcasestudy.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
//	public List<User> login(String emailId, String password){
//		return userRepository.loginByEmailPassword(emailId,password);
//	}

}