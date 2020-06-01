package com.example.finalcasestudy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

<<<<<<< HEAD
@SpringBootTest
class FinalcasestudyApplicationTests {
=======
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

>>>>>>> 47645842d94968c9bc7ef3d6615d4c69bef24cc5

	@Test
	void contextLoads() {
	}
<<<<<<< HEAD
=======
	
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

>>>>>>> 47645842d94968c9bc7ef3d6615d4c69bef24cc5

}
