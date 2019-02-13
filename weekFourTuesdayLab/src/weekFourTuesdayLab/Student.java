package weekFourTuesdayLab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String emailAddress;
	private int age;
	private double gpa;
	private Address address;
	private static final String path = "C:\\Users\\KN\\Desktop\\Workspace\\weekFourTuesdayLab\\streams\\";
	
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
			
			String fileName = Student.path + this.emailAddress + ".txt";
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			
			bw.write(this.toString());
			
			bw.close();
			
		} catch(IOException ex) {
			
		}
		
	}
	
	public static Student readFromFile(String emailAddress) {
		
		Student student = new Student();
		
		String fileName = Student.path + emailAddress + ".txt";
		
		try {
			
			Scanner input = new Scanner(new File(fileName));
			
			while(input.hasNextLine()) {
				
				String line = input.nextLine();
				String[] parsedLine = line.split(", ");
				
				student.firstName = parsedLine[0];
				student.lastName = parsedLine[1];
				student.emailAddress = parsedLine[2];
				student.age = Integer.parseInt(parsedLine[3]);
				student.gpa = Double.parseDouble(parsedLine[4]);
				student.address = new Address(parsedLine[5], parsedLine[6], parsedLine[7], parsedLine[8]);
				
			}
			
			input.close();
			
		} catch (FileNotFoundException ex) {
			
		}
		
		return student;
		
	}
	
}