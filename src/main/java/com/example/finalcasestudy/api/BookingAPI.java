package com.example.finalcasestudy.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.finalcasestudy.model.BookingModel;
import com.example.finalcasestudy.model.FlightModel;
import com.example.finalcasestudy.model.User;
import com.example.finalcasestudy.repo.BookingRepository;
import com.example.finalcasestudy.repo.FlightRepository;
import com.example.finalcasestudy.repo.UserRepository;

@RestController
public class BookingAPI {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private BookingFacade bookingFacade;
	
	@Autowired
	private FlightFacade flightFacade;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@PostMapping("/booking/{flightNumber}")
	public ResponseEntity<BookingDTO> booking(@RequestBody BookingDTO bookingDTO, @PathVariable("flightNumber") Integer flightNumber) {
		if(flightFacade.findByFlightNumber(flightNumber).size()==1) {
			FlightModel flight=flightRepository.findById(bookingDTO.getFlightId()).get();
			User user=userRepository.findById(bookingDTO.getUserId()).get();
			BookingModel newbooking = new BookingModel();
			newbooking.setFlight(flight);
			newbooking.setUser(user);
			
			bookingService.bookTicket(newbooking);
			bookingFacade.booking(bookingDTO);
		}
		logger.info("booking ticket");
		return ResponseEntity.ok(bookingDTO);
	}
	
	@GetMapping("/booking/{id}")
	public ResponseEntity<BookingModel> findBooking(@PathVariable("id")int id){
		return ResponseEntity.ok(bookingRepository.findById(id).get());
		
	}
	
	

}