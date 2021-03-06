package com;

import javax.persistence.Embeddable;
@Embeddable
public class Address{

	private String street;
	private String city;
	private String state;
	private int zipcode;

	public Address() {
		
	}

	public Address(String street, String city, String state, int zipcode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public int getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(int i) {
		this.zipcode = i;
	}

}
