package weekFourMondayLab;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age: \n");
		
		String inputValue = input.next();
		
		System.out.println();
			
		validateAge(inputValue);
		
	    input.close();

	}

	private static void validateAge(String inputValue) {
		
		try {
			
			int age = Integer.parseInt(inputValue); 
		
		} catch(NumberFormatException ex) {
			
			System.out.println("This is not a number: " + inputValue + " Please try again: \n");
			
			Scanner input = new Scanner(System.in);
			
			String value = input.next();
			
			System.out.println();
			
			validateAge(value);
			
			input.close();
			
		}
		
	}

}
