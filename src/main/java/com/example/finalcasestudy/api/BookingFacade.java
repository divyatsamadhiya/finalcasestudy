package com.example.finalcasestudy.api;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookingFacade {
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private ModelMapper modelMapper;
}