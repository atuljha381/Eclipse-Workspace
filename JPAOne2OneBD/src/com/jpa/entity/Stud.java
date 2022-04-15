package com.jpa.entity;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the STUDS database table.
 * 
 */
@Entity
@Table(name="STUDS")
@NamedQuery(name="Stud.findAll", query="SELECT s FROM Stud s")
@Cacheable
public class Stud implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	
	@Column(name = "ID")
	private long id;
	
	@Column(name="sname")
	private String sname;

	//bi-directional one-to-one association to Address
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="ADDRESS_ID")
	private Address address;

	public Stud() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}