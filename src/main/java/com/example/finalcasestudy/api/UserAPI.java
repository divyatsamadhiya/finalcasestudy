package com.example.finalcasestudy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.finalcasestudy.repo.UserRepository;

@RestController
public class UserAPI {

	
	@Autowired
	 private UserRepository userRepository;
	
	@Autowired
	private UserFacade userFacade;

	
	
	// app.post('/user',(req,res)=>)
	@PostMapping("/user")
	public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO){


	userFacade.save(userDTO);

	return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
	}

}
