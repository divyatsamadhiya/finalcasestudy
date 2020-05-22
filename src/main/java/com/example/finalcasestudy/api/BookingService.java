package com.example.finalcasestudy.api;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.finalcasestudy.model.BookingModel;

import com.example.finalcasestudy.repo.BookingRepository;


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
	


}