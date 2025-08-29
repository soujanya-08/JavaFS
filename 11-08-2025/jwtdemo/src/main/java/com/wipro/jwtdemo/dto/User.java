package com.wipro.jwtdemo.dto;
public class User {

	private String username;
	private String token;

	public String getUser() {
		return username;
	}

	public void setUser(String user) {
		this.username = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}