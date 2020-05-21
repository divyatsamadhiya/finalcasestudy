package com.example.finalcasestudy.api;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.finalcasestudy.model.BookingModel;
import com.example.finalcasestudy.model.User;

@Component
public class BookingFacade {
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public void booking(BookingDTO bookingDTO) {
		bookingService.bookTicket(convertToEntity(bookingDTO));
	}
	
//	public List<BookingDTO> findById(int id){
//		return convertToBookingDto(bookingService.findById(id));
//	}
	
	private List<BookingDTO> convertToBookingDto(List<BookingModel> booking) {
		return modelMapper.map(booking,new TypeToken<List<BookingDTO>>(){}.getType());
	}

	private BookingModel convertToEntity(BookingDTO bookingDTO) {
		return modelMapper.map(bookingDTO,new TypeToken<BookingModel>(){}.getType());
	}
}