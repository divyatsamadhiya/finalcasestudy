package com.example.finalcasestudy.api;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.finalcasestudy.model.User;

@Component
public class UserFacade {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<UserDTO> findAll(){
		return convertToUserDto(userService.findAll());
	}
	
	public void save(UserDTO userDTO) {
		userService.save(convertToEntity(userDTO));
	}
	
	public void update(UserDTO userDTO, Integer userID) {
		userService.updateUser(convertToEntity(userDTO),userID);
	}
	
	public List<UserDTO> findByUserName(String name){
		return convertToUserDto(userService.findByUserName(name));
	}
	
	public List<UserDTO> findByPassword(String password){
		return convertToUserDto(userService.findByPassword(password));
	}
	
	public List<UserDTO> findById(int userID){
		return convertToUserDto( userService.findById(userID));
	}

	
	public void delete(int userID) {
		userService.delete(userID);
	}
	
//	public List<UserDTO> login(String emailId, String password){
//		return convertToUserDto(userService.login(emailId,password));
//		}
	
	private List<UserDTO> convertToUserDto(List<User> users) {
		return modelMapper.map(users,new TypeToken<List<UserDTO>>(){}.getType());
	}

	private User convertToEntity(UserDTO userDTO) {
		return modelMapper.map(userDTO,new TypeToken<User>(){}.getType());
	}

}