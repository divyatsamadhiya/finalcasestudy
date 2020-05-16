package com.example.finalcasestudy.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserAPI {
	
	@Autowired
	private UserFacade userFacade;
	
	@PostMapping("/usersregistration")
	public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO){
		userFacade.save(userDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> findAll(){
		return new ResponseEntity<>(userFacade.findAll(), HttpStatus.OK);
	}
	
	
	@GetMapping("/products/find/{name}")
	public ResponseEntity<List<UserDTO>> findByName(@PathVariable("name")String name){

		return new ResponseEntity<>(userFacade.findByUserName(name), HttpStatus.OK);
	}
	
	
	@GetMapping("/products/find/{password}")
	public ResponseEntity<List<UserDTO>> findByUserPassword(@PathVariable("password")String password){

		return new ResponseEntity<>(userFacade.findByPassword(password), HttpStatus.OK);
	}
	
//	@GetMapping("/login")
//	public ResponseEntity<List<UserDTO>> UserLogin(@PathVariable("emailId") String emailId,@PathVariable("password")String password){
//		if(emailId == findByEmail(email) && password==findByPassword(password)) {
//			
//		}
//		
//		return new ResponseEntity<>(productFacade.findByProductName(name), HttpStatus.OK);
//	}
}