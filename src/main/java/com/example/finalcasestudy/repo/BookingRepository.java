package com.example.finalcasestudy.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finalcasestudy.model.BookingModel;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel, Integer>{
	
}