package com.claim;

public class Address {

	private int number;
	private String streetName;
	private String city;
	private String state;
	private int zipCode;
	private String country;
	
	public Address() {
		
	}
	
	public Address(int number, String streetName, String city, String state, int zipCode, String country) {
		
		this.number = number;
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.country = country;
		
	}
	
	public int getNumber() {
		
		return this.number;
		
	}
	
	public void setNumber(int number) {
		
		this.number = number;
		
	}
	
	public String getStreetName() {
		
		return this.streetName;
		
	}
	
	public void setStreetName(String streetName) {
		
		this.streetName = streetName;
		
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
	
	public int getZipCode() {
		
		return this.zipCode;
		
	}
	
	public void setZipCode(int zipCode) {
		
		this.zipCode = zipCode;
		
	}
	
	public String getCountry() {
		
		return this.country;
		
	}
	
	public void setCountry(String country) {
		
		this.country = country;
		
	}
	
}
