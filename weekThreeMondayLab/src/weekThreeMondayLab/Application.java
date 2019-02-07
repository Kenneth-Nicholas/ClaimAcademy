package weekThreeMondayLab;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Employee e1 = new Employee();
		
		System.out.println(s1.calculateTelephoneBill(120.5));
		System.out.println(e1.calculateTelephoneBill(120.5));
		
		Person p1 = new Student();
		Person p2 = new Employee();
		
		System.out.println(p1.calculateTelephoneBill(120.5));
		System.out.println(p2.calculateTelephoneBill(120.5));
		
		s1.firstName = "Kenneth";
		s1.lastName = "Nicholas";
		
		e1.firstName = "Windy";
		e1.lastName = "Schneidenbach";
		
		p1.firstName = "Guy";
		p1.lastName = "Person";
		
		p2.firstName = "Girl";
		p2.lastName = "Person";
		
		System.out.println(s1);
		System.out.println(e1);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(s1.taxes(77777.77));
		System.out.println(e1.taxes(77777.77));
		
		System.out.println(p1.taxes(1111.11));
		System.out.println(p2.taxes(1111.11));
		
		List<Student> studentArray = new ArrayList<Student>();
		
		studentArray.add(s1);
		
		studentArray.add((Student) p1);
		
		List<Employee> employeeArray = new ArrayList<Employee>();
		
		employeeArray.add(e1);
		
		employeeArray.add((Employee) p2);
		
		List<Person> personArray = new ArrayList<Person>();
		
		personArray.add(s1);
		personArray.add(e1);
		personArray.add(p1);
		personArray.add(p2);
		
		School school = new School();
		
		school.students = studentArray;
		
		school.employees = employeeArray;
		
	}

}
