package com.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ADDRESS database table.
 * 
 */
@Entity
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ADDRESS_ID")
	private long addressId;

	private String city;

	@Column(name="\"STATE\"")
	private String state;

	private String street;

	private String zipcode;

	//bi-directional one-to-one association to Stud
	@OneToOne(mappedBy="address", cascade={CascadeType.ALL})
	private Stud stud;

	public Address() {
	}

	public long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Stud getStud() {
		return this.stud;
	}

	public void setStud(Stud stud) {
		this.stud = stud;
	}

}