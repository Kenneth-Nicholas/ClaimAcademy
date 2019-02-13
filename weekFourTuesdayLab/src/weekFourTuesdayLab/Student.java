package weekFourTuesdayLab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Student {

	private String firstName;
	private String lastName;
	private String emailAddress;
	private int age;
	private double gpa;
	private Address address;
	private String path = "C:\\Users\\KN\\Desktop\\Workspace\\weekFourTuesdayLab\\streams\\";
	
	public Student() {
		
		super();
		
	}
	
	public Student(String firstName, String lastName, String emailAddress, int age, double gpa, Address address) {
		
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.age = age;
		this.gpa = gpa;
		this.address = address;
		
	}

	public String getFirstName() {
		
		return firstName;
		
	}

	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
		
	}

	public String getLastName() {
		
		return lastName;
		
	}

	public void setLastName(String lastName) {
		
		this.lastName = lastName;
		
	}

	public String getEmailAddress() {
		
		return emailAddress;
		
	}

	public void setEmailAddress(String emailAddress) {
		
		this.emailAddress = emailAddress;
		
	}

	public int getAge() {
		
		return age;
		
	}

	public void setAge(int age) {
		
		this.age = age;
		
	}

	public double getGpa() {
		
		return gpa;
		
	}

	public void setGpa(double gpa) {
		
		this.gpa = gpa;
		
	}

	public Address getAddress() {
		
		return address;
		
	}

	public void setAddress(Address address) {
		
		this.address = address;
		
	}

	@Override
	public String toString() {
		
		return this.firstName + ", " + this.lastName + ", " + this.emailAddress + ", " + this.age + ", " + this.gpa + ", " + this.address.toString();
		
	}
	
	public void saveToFile() {
		
		try {
			
			String fileName = this.path + this.emailAddress + ".txt";
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			
			bw.write(this.toString());
			
			bw.close();
			
		} catch(IOException ex) {
			
		}
		
	}
	
}
