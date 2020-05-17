package com.example.finalcasestudy.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class FlightAPI {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	
@Autowired
private FlightFacade flightFacade;

@GetMapping("/flights")
public ResponseEntity<List<FlightDTO>> findAll(){
logger.info("Processing findAll request");
return new ResponseEntity<>(flightFacade.findAll(), HttpStatus.OK);
}


@PostMapping("/flights")
public ResponseEntity<FlightDTO> save(@RequestBody FlightDTO flightDTO){
flightFacade.save(flightDTO);
return ResponseEntity.status(HttpStatus.CREATED).body(flightDTO);
}


@GetMapping("/flights/available/{fromCity}/{toCity}/{seats}")
public ResponseEntity<List<FlightDTO>> findAllByFromCityToCitySeats(@PathVariable("fromCity")String fromCity, @PathVariable("toCity")String toCity, @PathVariable("seats")Integer seats) {
	logger.info("Processing findAll request based on User query");
	return new ResponseEntity<>(flightFacade.findAllByFromCityToCitySeats(fromCity, toCity, seats), HttpStatus.OK);
}

@DeleteMapping("/flights/delete/{flightId}")
public @ResponseBody ResponseEntity<StringResponse> delete(@PathVariable("flightId")int flightId){
flightFacade.delete(flightId);
return new ResponseEntity<>(new StringResponse("Deleted flightId= "+flightId), HttpStatus.OK);
}
}