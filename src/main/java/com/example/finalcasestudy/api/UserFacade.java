package com.example.finalcasestudy.api;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import com.example.finalcasestudy.model.User;

@Configuration
public class UserFacade {
	
	@Bean
	   public ModelMapper modelMapper() {
	      ModelMapper modelMapper = new ModelMapper();
	      return modelMapper;
	   }
	
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
