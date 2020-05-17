package com.example.finalcasestudy.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finalcasestudy.model.FlightModel;

@Repository
public interface FlightRepository extends JpaRepository<FlightModel,Integer>{

	List<FlightModel> findByFromCityAndToCityAndSeatsGreaterThanEqual(String fromCity, String toCity, Integer seats);
	
}