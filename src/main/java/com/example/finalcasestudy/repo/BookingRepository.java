package com.example.finalcasestudy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finalcasestudy.model.BookingModel;

public interface BookingRepository extends JpaRepository<BookingModel, Integer>{

}