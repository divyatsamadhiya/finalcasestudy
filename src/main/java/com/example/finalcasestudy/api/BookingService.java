package com.example.finalcasestudy.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finalcasestudy.model.BookingModel;
import com.example.finalcasestudy.repo.BookingRepository;

@Service
public class BookingService {
	
	
	@Autowired
	private BookingRepository bookingRepository;
	
	
	public BookingModel bookTicket(BookingModel booking) {
		return bookingRepository.save(booking);
	}
	

}