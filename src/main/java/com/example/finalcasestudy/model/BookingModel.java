package com.example.finalcasestudy.model;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.Id;
=======
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
>>>>>>> 47645842d94968c9bc7ef3d6615d4c69bef24cc5
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class BookingModel {
	
	@Id
<<<<<<< HEAD
	private Integer id;
	private String fromCity;
	private String toCity;
	private Integer seats;
	
	private Double dateOfTravel;
	private Integer flightNumber;
	private String airline;
	private Double departureTime;
	
	private Double arrivalTime;
	private Double duration;
	
	private Double ticketPrice;
	private Double dateOfBooking;
	private String userName;
	private String gender;
	private String emailId;
	private Integer MobileNumber;
	private Integer alternateContactNumber;
	
	private String dateOfBirth;
	private String address;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private Integer pincode;

	
=======
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Date bookingDate;
	
	private Date travelDate;
	
	
	@OneToOne
    private User user;
    
    @OneToOne
    private FlightModel flight;
>>>>>>> 47645842d94968c9bc7ef3d6615d4c69bef24cc5

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

<<<<<<< HEAD
	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Double getDateOfTravel() {
		return dateOfTravel;
	}

	public void setDateOfTravel(Double dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}

	public Integer getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public Double getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Double departureTime) {
		this.departureTime = departureTime;
	}

	public Double getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Double arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Double getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(Double dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		MobileNumber = mobileNumber;
	}
	
	

	public Integer getAlternateContactNumber() {
		return alternateContactNumber;
	}

	public void setAlternateContactNumber(Integer alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	

	

=======
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

>>>>>>> 47645842d94968c9bc7ef3d6615d4c69bef24cc5
}