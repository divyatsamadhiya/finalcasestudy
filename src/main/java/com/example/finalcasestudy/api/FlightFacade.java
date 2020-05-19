package com.example.finalcasestudy.api;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.finalcasestudy.model.FlightModel;



@Component
public class FlightFacade {
	
@Autowired
private FlightService flightService;

@Autowired
private ModelMapper modelMapper;


public List<FlightDTO> findAll(){
return convertToProductDto(flightService.findAll());
}

public void save(FlightDTO flightDTO) {
flightService.save(convertToEntity(flightDTO));
}

public List<FlightDTO> findAllByFromCityToCitySeats(String fromCity, String toCity, Integer seats) {
	return convertToProductDto(flightService.findAllByFromCityToCitySeats(fromCity, toCity, seats));
}

public void delete(int flightId) {
flightService.delete(flightId);
}


private List<FlightDTO> convertToProductDto(List<FlightModel> flights) {
return modelMapper.map(flights,new TypeToken<List<FlightDTO>>(){}.getType());

}

private FlightModel convertToEntity(FlightDTO flightDTO) {
return modelMapper.map(flightDTO,new TypeToken<FlightModel>(){}.getType());

}
}