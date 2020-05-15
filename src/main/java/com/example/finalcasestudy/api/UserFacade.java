package com.example.finalcasestudy.api;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.finalcasestudy.api.UserService;
//import com.example.finalcasestudy.api.UserDTO;
//import com.example.devopscasestudy.model.Product;
import com.example.finalcasestudy.api.UserDTO;
import com.example.finalcasestudy.model.User;

@Component
public class UserFacade {
	
	@Autowired
	private UserService userService;

	@Autowired
	private ModelMapper modelMapper;

	
	public void save(UserDTO userDTO) {
		userService.save(convertToEntity(userDTO));
		}
	private User convertToEntity(UserDTO userDTO) {
		return modelMapper.map(userDTO,new TypeToken<User>(){}.getType());
		
//	private List<UserDTO> convertToProductDto(List<User> users) {
//			return modelMapper.map(users,new TypeToken<List<UserDTO>>(){}.getType());
//
//			}

		
	}	


}
