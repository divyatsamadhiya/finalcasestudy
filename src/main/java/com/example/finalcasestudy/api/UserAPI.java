package com.example.finalcasestudy.api;


//import java.util.HashMap;
import java.util.List;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//import com.example.finalcasestudy.model.User;
//import com.example.finalcasestudy.repo.UserRepository;


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
	
	@DeleteMapping("/users/{userID}")

	public @ResponseBody ResponseEntity<StringResponse> delete(@PathVariable("userID")int userID){
	userFacade.delete(userID);

	return new ResponseEntity<>(new StringResponse("Deleted Order "+userID), HttpStatus.OK);

	}
	
	@GetMapping("/users/find/{userID}")
	public ResponseEntity<List<UserDTO>> findById(@PathVariable("userID") int userID){

	return new ResponseEntity<>(userFacade.findById(userID), HttpStatus.OK);
	}

	
	//@RequestMapping(value="/users/{userId}", method =RequestMethod.PUT )
	//@PutMapping("/users/updateuser/{userID}")
	//public ResponseEntity<UserDTO> updateuser(@PathVariable("userID")int userId, @Valid User user){
		//List<User>users =UserService.findById(userID);
		//user.setAddress(user.getAddress());
		//user.setCity(user.getCity());
		//user.setCountry(user.getCountry());
		//user.setMobileNumber(user.getMobileNumber());
		//user.setPincode(user.getPincode());
		//user.setState(user.getState());
	   //return new ResponseEntity<>(userFacade.updateUser(userID),HttpStatus.OK);
		
	//}
	
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

