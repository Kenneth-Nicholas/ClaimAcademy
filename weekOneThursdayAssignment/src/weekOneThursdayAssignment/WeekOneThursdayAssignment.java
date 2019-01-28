/* Thursday's Assignment

1. Write a method to prompt the user to enter the radius of the circle 
   then calculate the area and circumference of the circle.

2. Write a method to prompt the user for base-width and height of a triangle,
   then calculate the area of the Triangle.

3. Write a method to prompt the user for a number then display check if the number is Even or Odd.
   https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html  

4. Write a method to prompt the user for an Integer then display the same value with one decimal place. 
   e.g., user enter "15 " result is: "You entered 15, the new value is 15.0".

5. Write a method to prompt the user for a letter of the alphabet and display it's numerical value. 

6. Write a method to prompt the user for a double then display the value as a whole number. 
   e.g., user enter "15.8" result is:  "You entered 15.8, the new value is 16".
   e.g., user enter "15.4" result is:  "You entered 15.4, the new value is 15".

7. Write a method to prompt the user for 4 digits representing a year. 
   Then determine If Year Is a Leap Year. 
   https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html */

package weekOneThursdayAssignment;

import java.util.Scanner;

public class WeekOneThursdayAssignment {
	
	public static void main(String[] args) {
		
		final double PI = 3.14159;
		
		Scanner input = new Scanner(System.in);
		
		calculateAreaAndCircumferenceOfCircle(PI, input);
		
		calculateAreaOfTriangleFromBaseWidthAndHeight(input);
		
		evenOrOdd(input);
		
		castIntegerToDouble(input);
		
		displayCharactersCorrespondingNumber(input);
		
		displayDoubleAsWholeNumber(input);
		
		isLeapYear(input);

		input.close();
		
	}
	
	public static void calculateAreaAndCircumferenceOfCircle(final double PI, Scanner input) {
		
		System.out.println("Enter the radius of a circle that you would like to know the area, and circumference of: ");
		System.out.println();
		
		double radius = input.nextDouble();
		
		double area = PI * radius * radius;
		
		double circumference = 2.0d * PI * radius;
		
		System.out.println();
		System.out.println("The area of a circle with a radius of " + radius + " is " + area);
		System.out.println("The circumference of a circle with a radius of " + radius + " is " + circumference);
		System.out.println();
		
	}
	
	public static void calculateAreaOfTriangleFromBaseWidthAndHeight(Scanner input) {
		
		System.out.println("Enter the base-width and height of the triangle which you would like to know the area of: ");
		System.out.println();
		
		double baseWidth = input.nextDouble();
		double height = input.nextDouble();
		
		double area = (0.5d) * baseWidth * height;
		
		System.out.println();
		System.out.println("The area of a triangle of base-width " + baseWidth + " and heigh of " + height + " is " + area);
		System.out.println();
		
	}
	
	public static void evenOrOdd(Scanner input) {
		
		System.out.println("Enter an integer value: ");
		System.out.println();
		
		int number = input.nextInt();
		
		System.out.println();
		
		if(number % 2 == 0) {
			
			System.out.println("The number " + number + " is even.");
			
		} else {
			
			System.out.println("The number " + number + " is odd.");
			
		}
		
		System.out.println();
		
	}

	public static void castIntegerToDouble(Scanner input) {
		
		System.out.println("Enter an integer to be casted to a double value with one decimal point: ");
		System.out.println();
		
		int number = input.nextInt();
		
		double numberAfterCast = (double) number;
		
		System.out.println();
		System.out.println("The integer " + number + " is now " + numberAfterCast);
		
	}
	
	public static void displayCharactersCorrespondingNumber(Scanner input) {
		
		System.out.println();
		System.out.println("Enter a letter of the alphabet: ");
		System.out.println();
		
		char character = input.next().charAt(0);
		
		int charactersNumber = (int) character;
		
		System.out.println();
		System.out.println("The ASCII number corresponding to the character you entered is " + charactersNumber);
		System.out.println();
		
	}
	
	public static void displayDoubleAsWholeNumber(Scanner input) {
		
		System.out.println("Enter a double value to be rounded to a whole number: ");
		System.out.println();
		
		double number = input.nextDouble();
		
		int numberTruncated = (int) number;

		if(number - numberTruncated >= 0.5) {
			
			numberTruncated++;
			
		}
		
		System.out.println();	
		System.out.println("The double value " + number + " rounded to the nearest whole number is equal to " + numberTruncated);
		System.out.println();
		
	}
	
	public static void isLeapYear(Scanner input) {
		
		System.out.println("Enter a four digit whole number corresponding to a year: ");
		System.out.println();
		
		int year = input.nextInt();
		
		System.out.println();
		
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			
			System.out.println("The year " + year + " is a leap year.");
			
		} else {
			
			System.out.println("The year " + year + " is not a leap year.");
			
		}

	}
	
}
