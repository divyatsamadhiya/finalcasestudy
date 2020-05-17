package com.example.finalcasestudy.api;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


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
	
	@DeleteMapping("/users/delete/{userID}")
	public @ResponseBody ResponseEntity<StringResponse> delete(@PathVariable("userID")int userID){
		userFacade.delete(userID);
		logger.info("Processing delete request");
		return new ResponseEntity<>(new StringResponse("Deleted User "+userID), HttpStatus.OK);

	}
	
	@GetMapping("/users/findById/{userID}")
	public ResponseEntity<List<UserDTO>> findById(@PathVariable("userID") int userID){
		logger.info("Processing findById request");
		return new ResponseEntity<>(userFacade.findById(userID), HttpStatus.OK);
	}
	
	//@RequestMapping(value="/users/{userId}", method =RequestMethod.PUT )
	//@PutMapping("/users/updateuser/{userID}")
	//public ResponseEntity<List<UserDTO>> updateuser(@PathVariable("userID")int userId, @RequestBody UserDTO userDTO){
	//	userDTO =userFacade.findById(userId);
	  // return new ResponseEntity<>(userFacade.save(userDTO),HttpStatus.OK);
		
//	}
	
	//@RequestMapping(value="/updateUserInfo", method=RequestMethod.POST)
	//public ResponseEntity profileInfo(
	  //          @RequestBody HashMap<String, Object> mapper
	    //    ) throws Exception{

	    //int userId = (Integer) mapper.get("userID");
	    //String emailId = (String) mapper.get("emailId");
	    //String gender = (String) mapper.get("gender");
	    //int dateofBirth = (Integer) mapper.get("dateofBirth");
	    //String fullName = (String) mapper.get("fullName");
	    
	    //User currentUser = UserService.findById(userID);
	    //if(currentUser == null) {
	      //  throw new Exception ("User not found");
	    //}
	    
	   // currentUser.setAddress(currentUser.getAddress());
		//currentUser.setCity(currentUser.getCity());
		//currentUser.setCountry(currentUser.getCountry());
		//currentUser.setMobileNumber(currentUser.getMobileNumber());
		//currentUser.setPincode(currentUser.getPincode());
		//currentUser.setState(currentUser.getState());


	    //UserService.save(currentUser);

	    //return new ResponseEntity("Update Success", HttpStatus.OK);
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

