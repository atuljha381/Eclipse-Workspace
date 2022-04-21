package com.db;

public class Login {
	private String username;
	private String password;
	private Integer phone;
	
	
	public Login(String username, String password, Integer phone) {
		super();
		this.username = username;
		this.password = password;
		this.phone = phone;
	}

	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Login(String password, Integer phone) {
		this.password = password;
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	
}
