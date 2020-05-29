package com.example.finalcasestudy.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Flights")

public class FlightModel {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		
		private Integer flightNumber;
		
	    private String flightName;
		
		private String airline;
		
		private String fromCity;
		
		private String toCity;
		
		private Double departureTime;
		
		private Double arrivalTime;
		
		private Double ticketPrice;
		
		private Double duration;
		
		private Integer seats;
				

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getFlightNumber() {
			return flightNumber;
		}

		public void setFlightNumber(Integer flightNumber) {
			this.flightNumber = flightNumber;
		}

		public String getFlightName() {
			return flightName;
		}

		public void setFlightName(String flightName) {
			this.flightName = flightName;
		}

		public String getAirline() {
			return airline;
		}

		public void setAirline(String airline) {
			this.airline = airline;
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

		public Double getTicketPrice() {
			return ticketPrice;
		}

		public void setTicketPrice(Double ticketPrice) {
			this.ticketPrice = ticketPrice;
		}

		public Double getDuration() {
			return duration;
		}

		public void setDuration(Double duration) {
			this.duration = duration;
		}

		public Integer getSeats() {
			return seats;
		}

		public void setSeats(Integer seats) {
			this.seats = seats;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("FlightModel [id=");
			builder.append(id);
			builder.append(", flightNumber=");
			builder.append(flightNumber);
			builder.append(", flightName=");
			builder.append(flightName);
			builder.append(", airline=");
			builder.append(airline);
			builder.append(", fromCity=");
			builder.append(fromCity);
			builder.append(", toCity=");
			builder.append(toCity);
			builder.append(", departureTime=");
			builder.append(departureTime);
			builder.append(", arrivalTime=");
			builder.append(arrivalTime);
			builder.append(", ticketPrice=");
			builder.append(ticketPrice);
			builder.append(", duration=");
			builder.append(duration);
			builder.append(", seats=");
			builder.append(seats);
			builder.append("]");
			return builder.toString();
		}
		
		
	

}