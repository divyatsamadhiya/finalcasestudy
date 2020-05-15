package com.example.finalcasestudy.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	private Integer userID;
	
	private String fullName;
	
	private String emailId;
	
	private String password;
	
	private String gender;
	
	private Integer dateOfBirth;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private Integer pincode;
	
	private Integer MobileNumber;
	
	public Integer getUserID() {
		return this.userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public Integer getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Integer dateOfBirth) {
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

	public Integer getMobileNumber() {
		return this.MobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.MobileNumber = mobileNumber;
	}
	
	
=======
public class User {


}
