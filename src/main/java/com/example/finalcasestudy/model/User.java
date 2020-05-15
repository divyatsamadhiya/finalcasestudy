package com.example.finalcasestudy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="users")
public class User {
	@Id
	@Email
	private String fullName;
	private String email;
	private String password;
	private String gender;
	private String dob;
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullname(String fullname) {
		this.fullName = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	

}