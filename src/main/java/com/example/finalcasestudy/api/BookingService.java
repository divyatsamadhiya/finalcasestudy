package com.example.finalcasestudy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.finalcasestudy.model.BookingModel;
import com.example.finalcasestudy.model.FlightModel;
import com.example.finalcasestudy.model.User;
import com.example.finalcasestudy.repo.BookingRepository;
import com.example.finalcasestudy.repo.FlightRepository;

@Service
public class BookingService {
	
	@Autowired
	private FlightFacade flightFacade;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private UserFacade userFacade;
	
	
	public BookingModel bookTicket(BookingModel booking) {
		return bookingRepository.save(booking);
	}
	
//	public List<BookingModel> findById(int id){
//		return bookingRepository.findById(id);
//	}
	
	

}