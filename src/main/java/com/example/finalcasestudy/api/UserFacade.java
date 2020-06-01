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
	
	public void update(UserDTO userDTO, int id) {
		userService.updateUser(convertToEntity(userDTO),id);
	}
	
	public List<UserDTO> findByUserName(String name){
		return convertToUserDto(userService.findByUserName(name));
	}
	
	public List<UserDTO> findByPassword(String password){
		return convertToUserDto(userService.findByPassword(password));
	}
	
	public List<UserDTO> findById(int id){
		return convertToUserDto(userService.findById(id));
	}

	
	public void delete(int id) {
		userService.delete(id);
	}
	
	
	private List<UserDTO> convertToUserDto(List<User> users) {
		return modelMapper.map(users,new TypeToken<List<UserDTO>>(){}.getType());
	}

	private User convertToEntity(UserDTO userDTO) {
		return modelMapper.map(userDTO,new TypeToken<User>(){}.getType());
	}

}
