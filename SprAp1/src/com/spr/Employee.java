package com.spr;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String ename;
	@Autowired
	private Address empAddress;
	
	public String getEname() {
		return ename;
	}
	public Address getEmpAddress() {
		return empAddress;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	
	
}
