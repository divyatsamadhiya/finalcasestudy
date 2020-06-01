package com.example.finalcasestudy.api;

<<<<<<< HEAD
public class BookingFacade {

}
=======

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
>>>>>>> 47645842d94968c9bc7ef3d6615d4c69bef24cc5
