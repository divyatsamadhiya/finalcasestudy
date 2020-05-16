package com.example.finalcasestudy.api;

public class FlightDTO {
	
	private Integer flightId;
	
	private String filghtName;
	
	private String operatingAirlines;
	
	private String fromCity;
	
	private String toCity;
	
	private Double departureTime;
	
	private Double arrivalTime;
	
	private Double costperTicket;
	
	private Double totalDuration;
	
	private Integer numofSeats;

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getFilghtName() {
		return filghtName;
	}

	public void setFilghtName(String filghtName) {
		this.filghtName = filghtName;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

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

	public Double getCostperTicket() {
		return costperTicket;
	}

	public void setCostperTicket(Double costperTicket) {
		this.costperTicket = costperTicket;
	}

	public Double getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Double totalDuration) {
		this.totalDuration = totalDuration;
	}

	public Integer getNumofSeats() {
		return numofSeats;
	}

	public void setNumofSeats(Integer numofSeats) {
		this.numofSeats = numofSeats;
	}
	
	

	

}
