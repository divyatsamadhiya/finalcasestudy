package com.example.finalcasestudy.api;

public class UserDTO {
	
	private String fullName;
	private String email;
	private String password;
	private String gender;
	private String dob;
	
	public String getFullName() {
		return this.fullName;
	}
	public void setFullname(String fullname) {
		this.fullName = fullname;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getDob() {
		return this.dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
