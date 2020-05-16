package com.example.finalcasestudy.api;


import java.util.List;

import javax.validation.Valid;

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

import com.example.finalcasestudy.model.User;
import com.example.finalcasestudy.repo.UserRepository;


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
	
	@DeleteMapping("/users/{userId}")

	public @ResponseBody ResponseEntity<StringResponse> delete(@PathVariable("userId")int userId){
	userFacade.delete(userId);

	return new ResponseEntity<>(new StringResponse("Deleted Order "+userId), HttpStatus.OK);

	}
	
	//@RequestMapping(value="/users/{userId}", method =RequestMethod.PUT )
	//@PutMapping("/users/updateuser/{userId}")
//	public ResponseEntity<UserDTO> updateuser(@PathVariable("userId")int userId, @Valid @ResponseBody User user){
	//	List<UserDTO>Existingusers =userService.findById(userId);
		//user.setAddress(user.getAddress());
		//user.setCity(user.getCity());
		//user.setCountry(user.getCountry());
		//user.setMobileNumber(user.getMobileNumber());
	//	user.setPincode(user.getPincode());
	//	user.setState(user.getState());
	 //  return new ResponseEntity<>(userFacade.updateUser(),HttpStatus.OK);
		
//	}
	
	
	
	  


	
//	@GetMapping("/login")
//	public ResponseEntity<List<UserDTO>> UserLogin(@PathVariable("emailId") String emailId,@PathVariable("password")String password){
//		if(emailId == findByEmail(email) && password==findByPassword(password)) {
//			
//		}
//		
//		return new ResponseEntity<>(productFacade.findByProductName(name), HttpStatus.OK);
//	}
}

