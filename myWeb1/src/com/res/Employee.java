package com.res;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
public class Employee {
	private String empNo;
	private String empName;
	private String position;
	public Employee() {}
	public Employee(String empNo, String empName, String position) {
		this.empNo = empNo;
		this.empName = empName;
		this.position = position;
	}
	public String getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public String getPosition() {
		return position;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	
	
}
