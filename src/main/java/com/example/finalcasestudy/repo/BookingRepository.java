package com.example.finalcasestudy.repo;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finalcasestudy.model.BookingModel;

public interface BookingRepository extends JpaRepository<BookingModel, Integer>{

}
=======

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finalcasestudy.model.BookingModel;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel, Integer>{
	
}
>>>>>>> 47645842d94968c9bc7ef3d6615d4c69bef24cc5
