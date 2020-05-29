package com.example.finalcasestudy.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.finalcasestudy.model.FlightModel;
import com.example.finalcasestudy.model.User;


@Repository
public interface FlightRepository extends JpaRepository<FlightModel,Integer>{
	
	@Query("from FlightModel where fromCity=:fromCity and toCity=:toCity and seats=:seats")
	List<FlightModel> findByFromCityAndToCityAndSeatsGreaterThanEqual(@Param("fromCity") String from, @Param("toCity") String to, @Param("seats") Integer seats);
	
	List<FlightModel> findById(int id);
	
	List<FlightModel> findByFlightNumber(Integer flightNumber);

}



