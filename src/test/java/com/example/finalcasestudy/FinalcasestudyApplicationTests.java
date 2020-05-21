package com.example.finalcasestudy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.finalcasestudy.api.FlightAPI;
import com.example.finalcasestudy.api.FlightDTO;
import com.example.finalcasestudy.api.FlightFacade;
import com.example.finalcasestudy.api.StringResponse;
import com.example.finalcasestudy.api.UserAPI;
import com.example.finalcasestudy.api.UserDTO;
import com.example.finalcasestudy.api.UserFacade;


@SpringBootTest
class FinalcasestudyApplicationTests {
	
	

	@InjectMocks
	UserAPI userapi;

	@Mock
	UserFacade userFacade;

	
	@InjectMocks
	FlightAPI flightapi;

	@Mock
	FlightFacade flightFacade;



	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void testFindAll()
	{
	// given





	List<UserDTO> users = new ArrayList<>();
	users.add(new UserDTO());
//	users.add(new UserDTO());
//	users.add(new UserDTO());
//	users.add(new UserDTO());
	

	when(userFacade.findAll()).thenReturn(users);



	// when
	List<UserDTO> result = userapi.findAll().getBody();

	// then
	assertThat(result.size()).isEqualTo(1);

	// assertThat(result.get(0).getFirstName())
	// .isEqualTo(employee1.getFirstName());
	//
	// assertThat(result.getEmployeeList().get(1).getFirstName())
	// .isEqualTo(employee2.getFirstName());
	}
	
	
	
	@Test
	public void testFindByFlightNumber()
	{
	
	    List<FlightDTO> flights=new ArrayList<>();
	    flights.add(new FlightDTO());
	    when(flightFacade.findByFlightNumber(12345)).thenReturn(flights);
	    
		// when
		List<FlightDTO> result = flightapi.findByFlightNumber(12345 ).getBody();

		// then
		assertThat(result.size()).isEqualTo(1);
	}
	
}

