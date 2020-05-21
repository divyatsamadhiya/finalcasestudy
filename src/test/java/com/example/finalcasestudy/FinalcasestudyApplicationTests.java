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

	List<UserDTO> users = new ArrayList<>();
	users.add(new UserDTO());
	users.add(new UserDTO());
	

	when(userFacade.findAll()).thenReturn(users);
	List<UserDTO> result = userapi.findAll().getBody();
	assertThat(result.size()).isEqualTo(2);

	}
	@Test
	public void testFindByFlightNumber()
	{
	
	    List<FlightDTO> flights=new ArrayList<>();
	    flights.add(new FlightDTO());
	    when(flightFacade.findByFlightNumber(101)).thenReturn(flights);
	    
		List<FlightDTO> result = flightapi.findByFlightNumber(101).getBody();

		assertThat(result.size()).isEqualTo(1);
	}
	
	@Test
	public void testfindByFromCityAndToCityAndSeatsGreaterThanEqual()
	{

	    List<FlightDTO> flights=new ArrayList<>();
	    flights.add(new FlightDTO());
	    when(flightFacade.findAllByFromCityToCitySeats("Bangalore","Delhi",4)).thenReturn(flights);
	    
		// when
		List<FlightDTO> result = flightapi.findAllByFromCityToCitySeats("Bangalore","Delhi",4).getBody();

		// then
		assertThat(result.size()).isEqualTo(1);
	}
	
	@Test
	//user
	public void testfindbyId()
	{
		//given
		List<UserDTO> users = new ArrayList<>();
		users.add(new UserDTO());
		when(userFacade.findById(1)).thenReturn(users);
		//when
		List<UserDTO> result =userapi.findById(1).getBody();
		//then
		assertThat(result.size()).isEqualTo(1);
	}
	
	@Test
	//user
	public void testfindbyName()
	{
		//given
		List<UserDTO> users = new ArrayList<>();
		users.add(new UserDTO());
		when(userFacade.findByUserName("Divyat Samadhiya")).thenReturn(users);
		//when
		List<UserDTO> result =userapi.findByName("Divyat Samadhiya").getBody();
		//then
		assertThat(result.size()).isEqualTo(1);
	}
	
	@Test
//	//flight
	public void testflightfindbyId()
	{
		//given
		List<FlightDTO> flights = new ArrayList<>();
		flights.add(new FlightDTO());
		when(flightFacade.findById(1)).thenReturn(flights);
		//when
		List<FlightDTO> result =flightapi.findById(1).getBody();
		//then
		assertThat(result.size()).isEqualTo(1);
	}
	

	}


