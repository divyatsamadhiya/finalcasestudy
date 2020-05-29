package com.example.finalcasestudy.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;


import javax.validation.constraints.NotNull;



@Entity
@Table(name="user")
public class User implements Serializable  {
	
	
	@Id
	private Integer id;

	@NotEmpty
	private String userName;
	
	@NotEmpty
	private String emailId;
	
	@NotEmpty
	private String password;
	
	private String gender;
	
	private Date dateOfBirth;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private Integer pincode;
	
	private Long MobileNumber;
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getPincode() {
		return this.pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Long getMobileNumber() {
		return this.MobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.MobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userID=");
		builder.append(id);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", emailId=");
		builder.append(emailId);
		builder.append(", password=");
		builder.append(password);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", address=");
		builder.append(address);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", country=");
		builder.append(country);
		builder.append(", pincode=");
		builder.append(pincode);
		builder.append(", MobileNumber=");
		builder.append(MobileNumber);
		builder.append("]");
		return builder.toString();
	}

	

}