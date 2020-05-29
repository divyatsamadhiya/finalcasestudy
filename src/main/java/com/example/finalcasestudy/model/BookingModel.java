package com.example.finalcasestudy.model;

import java.sql.Date;

import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class BookingModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Date bookingDate;
	
	private Date travelDate;
	
	
	@OneToOne
    private User user;
    
    @OneToOne
    private FlightModel flight;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public FlightModel getFlight() {
		return flight;
	}

	public void setFlight(FlightModel flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookingModel [id=");
		builder.append(id);
		builder.append(", bookingDate=");
		builder.append(bookingDate);
		builder.append(", travelDate=");
		builder.append(travelDate);
		builder.append(", user=");
		builder.append(user);
		builder.append(", flight=");
		builder.append(flight);
		builder.append("]");
		return builder.toString();
	}

}