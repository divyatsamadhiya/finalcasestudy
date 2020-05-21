package com.example.finalcasestudy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.finalcasestudy.model.FlightModel;
import com.example.finalcasestudy.model.User;
import com.example.finalcasestudy.repo.FlightRepository;

@Service
public class FlightService {
	
@Autowired
private FlightRepository flightRepository;

public List<FlightModel> findAll(){
return flightRepository.findAll();
}

public FlightModel save(FlightModel flight) {
return flightRepository.save(flight);
}

public List<FlightModel> findByFlightNumber(Integer number){
	return flightRepository.findByFlightNumber(number);
}


public List<FlightModel> findAllByFromCityToCitySeats(String fromCity, String toCity, Integer seats) {
	return flightRepository.findByFromCityAndToCityAndSeatsGreaterThanEqual(fromCity, toCity, seats);
}

public void delete(int flightId) {
flightRepository.deleteById(flightId);
}

public List<FlightModel> findById(int id){
	return flightRepository.findById(id);
}
	

}
