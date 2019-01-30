package com.claim;

public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private long telephoneNumber;
	private double gradePointAverage;
	
	public Address address;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, int age, long telephoneNumber, double gradePointAverage, Address address) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.telephoneNumber = telephoneNumber;
		this.gradePointAverage = gradePointAverage;
		this.address = address;
		
	}
	
	public String getFirstName() {

		return this.firstName;
		
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
		
	}
	
	public String getLastName() {
		
		return this.lastName;
		
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
		
	}
	
	public int getAge() {
		
		return this.age;
		
	}
	
	public void setAge(int age) {
		
		this.age = age;
		
	}
	
	public long getTelephoneNumber() {
		
		return this.telephoneNumber;
		
	}
	
	public void setTelephoneNumber(long telephoneNumber) {
		
		this.telephoneNumber = telephoneNumber;
		
	}
	
	public double getGradePointAverage() {
		
		return this.gradePointAverage;
		
	}
	
	public void setGradePointAverage(double gradePointAverage) {
		
		this.gradePointAverage = gradePointAverage;
		
	}
	
	public Address getAddress() {
		
		return this.address;
		
	}
	
	public void setAddress(Address address) {
		
		this.address = address;
		
	}
	
}
