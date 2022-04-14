package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity
@NamedQueries(
		{
			@NamedQuery(name="byJob",query="select p from Person p where p.pjob=:job"),
			@NamedQuery(name="byId",query="select p from Person p where p.pid=:id")
		})
@Table(name="Person")
public class Person implements Serializable {
	
	@Id
	@Column(name = "PID")
	private Integer pid;   
	
	@Column(name = "PNAME")
	private String pname;   
	
	@Column(name = "PJOB")
	private String pjob;
	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}   
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
   
}
