package weekFourTuesdayLab;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Please enter a the information pertaining to a student in the following format: \n");
		System.out.println("FirstName, LastName, EmailAddress, Age, GPA, Street, City, State, ZipCode");
		
		Scanner input = new Scanner(System.in);
		
		String stringArray[] = new String[9];
		
		String inputHolder = input.nextLine();
		
		stringArray = inputHolder.split(", ");
		
		String firstName = stringArray[0];
		String lastName = stringArray[1];
		String emailAddress = stringArray[2];
		String age = stringArray[3];
		String gpa = stringArray[4];
		String street = stringArray[5];
		String city = stringArray[6];
		String state = stringArray[7];
		String zipCode = stringArray[8];
		
		int ageOfStudent = Integer.parseInt(age);
		double gpaOfStudent = Double.parseDouble(gpa);
		
		Address address = new Address(street, city, state, zipCode);
		
		Student student = new Student(firstName, lastName, emailAddress, ageOfStudent, gpaOfStudent, address);
		
		student.saveToFile();
		
		Student studentFromFile = Student.readFromFile(emailAddress);
		
		System.out.println(studentFromFile);
		
		input.close();
		
	}

}