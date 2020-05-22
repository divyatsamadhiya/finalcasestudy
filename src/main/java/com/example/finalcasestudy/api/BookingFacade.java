package com.example.finalcasestudy.api;


import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.finalcasestudy.model.BookingModel;

@Component
public class BookingFacade {
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public void booking(BookingDTO bookingDTO) {
		bookingService.bookTicket(convertToEntity(bookingDTO));
	}
	

	private BookingModel convertToEntity(BookingDTO bookingDTO) {
		return modelMapper.map(bookingDTO,new TypeToken<BookingModel>(){}.getType());
	}
}