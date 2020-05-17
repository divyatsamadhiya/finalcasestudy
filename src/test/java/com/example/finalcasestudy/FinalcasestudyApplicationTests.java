package com.example.finalcasestudy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.finalcasestudy.api.UserAPI;
import com.example.finalcasestudy.api.UserDTO;
import com.example.finalcasestudy.api.UserFacade;

@SpringBootTest
class FinalcasestudyApplicationTests {
	
	
	@InjectMocks
	UserAPI userapi;

	@Mock
	UserFacade productFacade;


	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void testFindAll()
	{
	// given


	List<UserDTO> users = new ArrayList<>();
	users.add(new UserDTO());
	users.add(new UserDTO());
	users.add(new UserDTO());
//	users.add(new UserDTO());
	

	when(productFacade.findAll()).thenReturn(users);



	// when
	List<UserDTO> result = userapi.findAll().getBody();

	// then
	assertThat(result.size()).isEqualTo(3);

	// assertThat(result.get(0).getFirstName())
	// .isEqualTo(employee1.getFirstName());
	//
	// assertThat(result.getEmployeeList().get(1).getFirstName())
	// .isEqualTo(employee2.getFirstName());
	}

	}
