package com.example.finalcasestudy.api;

<<<<<<< HEAD
public class BookingService {

}
=======

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
>>>>>>> 47645842d94968c9bc7ef3d6615d4c69bef24cc5
