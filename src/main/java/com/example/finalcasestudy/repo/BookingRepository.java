package com.example.finalcasestudy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.finalcasestudy.api.BookingDTO;
import com.example.finalcasestudy.model.BookingModel;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel, Integer>{
	
	//List<BookingModel> findById(int id);
}