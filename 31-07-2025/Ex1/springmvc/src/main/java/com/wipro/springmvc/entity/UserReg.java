package com.wipro.springmvc.entity;

public class UserReg {
	String name;
	String email;
	long number;
	
	@Override
	public String toString() {
		return "UserReg [name=" + name + ", email=" + email + ", number=" + number + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	

}
