package com.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

/**
 * ID class for entity: Person
 *
 */ 
public class PersonPK  implements Serializable {   
   
	         
	private Integer pid;         
	private String pname;         
	private String pjob;
	private static final long serialVersionUID = 1L;

	public PersonPK() {}

	

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}
	

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	

	public String getPjob() {
		return this.pjob;
	}

	public void setPjob(String pjob) {
		this.pjob = pjob;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof PersonPK)) {
			return false;
		}
		PersonPK other = (PersonPK) o;
		return true
			&& (getPid() == null ? other.getPid() == null : getPid().equals(other.getPid()))
			&& (getPname() == null ? other.getPname() == null : getPname().equals(other.getPname()))
			&& (getPjob() == null ? other.getPjob() == null : getPjob().equals(other.getPjob()));
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (getPid() == null ? 0 : getPid().hashCode());
		result = prime * result + (getPname() == null ? 0 : getPname().hashCode());
		result = prime * result + (getPjob() == null ? 0 : getPjob().hashCode());
		return result;
	}
   
   
}
