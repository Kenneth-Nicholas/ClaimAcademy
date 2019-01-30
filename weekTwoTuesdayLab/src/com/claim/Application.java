// Lab - Creating classes
// Creating classes 
//
// 1. Create a new project.
// 2. Create a new class called Application => add the main method to this class => add 
//    Package -> com.claim.
// 3. Right click on package com.claim -> new class -> Student.
// 4. Add instance variables -> private String firstName; private String lastName;
// 5. Add a default constructor public Student() {}
// 6. Add a parameterized constructor ->   public Student (String firstName, String lastName) {
//                                            this.firstName = firstName;
//                                            this.lastName = lastName;
//                                         } 
//
// 7. Add getters / setters : 
//                                         public String getFirstName(){
//                                            Return this.firstName;
//                                         }
//
//                                         public void setFirstName(String firstName) {
//                                            this.firstName = firstName;
//                                         }
//
//                                         public String getLastName(){
//                                            Return this.lastName;
//                                         }
//
//                                         public void setLastName(String lastName) {
//                                            this.lastName = lastName;
//                                         }
//
// 8. In the application class inside main create a new Student object.
//
//                                         Student student1 = new Student();
//                                         Student student2 = new Student(“add first name here”, “add last name here”);
// 9. Print student2 name :
//                                         System.out.println(student2.getFirstName() + “ ”+ student2.getLastName());
// 10. Call the set method for student1 and add firstName and lastName;
// 11. Print student1’s name;
// 12. Add more data field to the student class e.g.,: age, telephone, GPA, ***address
// 13. Add accessor methods to the student class.


package com.claim;

public class Application {

	public static void main(String[] args) {
		
		Address address1 = new Address();
		Student student1 = new Student();
		
		student1.setFirstName("Windy");
		student1.setLastName("Schneidenbach");
		student1.setAge(27);
		student1.setTelephoneNumber(3148221234l);
		student1.setGradePointAverage(4.0d);
		address1.setNumber(123); 
		address1.setStreetName("South Geyer Road");
		address1.setCity("Kirkwood");
		address1.setState("MO");
		address1.setZipCode(63122);
		address1.setCountry("United States of America");
		
		System.out.println("student1's first name is: " + student1.getFirstName());
		System.out.println("student1's last name is: " + student1.getLastName());
		System.out.println("student1's age is: " + student1.getAge());
		System.out.println("student1's telephone number is is: " + student1.getTelephoneNumber());
		System.out.println("student1's grade point average is: " + student1.getGradePointAverage());
		System.out.println("student1's street number is: " + address1.getNumber());
		System.out.println("student1's street name is: " + address1.getStreetName());
		System.out.println("student1's city is: " + address1.getCity());
		System.out.println("student1's state is: " + address1.getState());
		System.out.println("student1's zip code is: " + address1.getZipCode());
		System.out.println("student1's country is: " + address1.getCountry() + "\n");
		
		Address address2 = new Address(456, "East Meadow Lane", "Ellisville", "MO", 63021, "United States of America");
		Student student2 = new Student("Kenneth", "Nicholas", 27, 3145265678l, 4.0d, address2);
		
		System.out.println("student2's first name is: " + student2.getFirstName());
		System.out.println("student2's last name is: " + student2.getLastName());
		System.out.println("student2's age is: " + student2.getAge());
		System.out.println("student2's telephone number is is: " + student2.getTelephoneNumber());
		System.out.println("student2's grade point average is: " + student2.getGradePointAverage());
		System.out.println("student2's street number is: " + student2.address.getNumber());
		System.out.println("student2's street name is: " + student2.address.getStreetName());
		System.out.println("student2's city is: " + student2.address.getCity());
		System.out.println("student2's state is: " + student2.address.getState());
		System.out.println("student2's zip code is: " + student2.address.getZipCode());
		System.out.println("student2's country is: " + student2.address.getCountry() + "\n");
		
	}

}
