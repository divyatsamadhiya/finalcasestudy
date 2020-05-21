package com.example.finalcasestudy.api;


import java.util.List;
import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.finalcasestudy.repo.UserRepository;

@RestController
public class UserAPI {
	

	private final Logger logger = LoggerFactory.getLogger(getClass());

	
	@Autowired
	private UserFacade userFacade;
	
	@PostMapping("/usersregistration")
	public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO){
		userFacade.save(userDTO);
		logger.info("Processing save request");
		return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
	}
	
	@PutMapping("/users/update/{id}")
	public ResponseEntity<UserDTO> updateUsers(@RequestBody UserDTO userDTO, @PathVariable("id") int id) {
		if(userFacade.findById(id).size()==1) {
			userFacade.update(userDTO,id);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
	}
	
	
	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> findAll(){
		logger.info("Processing findAll request");
		return new ResponseEntity<>(userFacade.findAll(), HttpStatus.OK);
	}
	

	@GetMapping("/users/findByName/{name}")
	public ResponseEntity<List<UserDTO>> findByName(@PathVariable("name")String name){
		logger.info("Processing findByName request");
		return new ResponseEntity<>(userFacade.findByUserName(name), HttpStatus.OK);
	}
	
	@GetMapping("/users/findByPassword/{password}")
	public ResponseEntity<List<UserDTO>> findByUserPassword(@PathVariable("password")String password){
		logger.info("Processing findByPassword request");
		return new ResponseEntity<>(userFacade.findByPassword(password), HttpStatus.OK);
	}
	
	@DeleteMapping("/users/delete/{id}")
	public @ResponseBody ResponseEntity<StringResponse> delete(@PathVariable("id")int id){
		userFacade.delete(id);
		logger.info("Processing delete request");
		return new ResponseEntity<>(new StringResponse("Deleted User "+id), HttpStatus.OK);
	}
	
	@GetMapping("/users/findById/{id}")
	public ResponseEntity<List<UserDTO>> findById(@PathVariable("id") int id){
		logger.info("Processing findById request");
		return new ResponseEntity<>(userFacade.findById(id), HttpStatus.OK);
	}

}
