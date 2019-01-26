// Friday Assignment 
// 1. Write a program to read an input and determine if a string has all unique characters.
//
// 3. Write a program to reverse a word. 
//    e.g., input "Java" output "avaJ".
//
// 4. Write a program to remove the middle character of a string. 
//    e.g., input "stack" output:"stck", input "banana" output: "bana" 
//
// 5. Write a program to determine if a string is a palindrome. 
//    e.g.,  
//   	refer
//  	deed
//
// 6. Write a program to count all the vowels in a string.  
//    e.g., input"banana" output:3

package fridayAssignment;

import java.util.Scanner;

public class FridayAssignment {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(allUniqueCharacterString(input));
		
		System.out.println(evenUpperCaseOddLowerCase(input));
		
		System.out.println(reverseWord(input));
		
		System.out.println(removeMiddleOfString(input));
		
		System.out.println(isPalindromeString(input));
		
		System.out.println(vowelCounter(input));
		
		input.close();

	}
	
	public static boolean allUniqueCharacterString(Scanner input) {
		
		boolean isUnique = true;
		
		System.out.println("This program determines if a String is made up entirely of unique characters.");
		System.out.println("If the String you enter is made up of entirely unique characters, the program returns true.");
		System.out.println("If the String you enter is not, the program returns false.");
		System.out.println();
		System.out.println("Please enter a String: ");
		System.out.println();
		
		String enteredString = input.nextLine();
		
		System.out.println();
		
		int stringLength = enteredString.length();
		
		for(int i = 0; i < stringLength; i++) {
		
			char outerLetter = enteredString.charAt(i);
				
			for(int j = i + 1; j < stringLength; j++) {
				
				char innerLetter = enteredString.charAt(j);
				
				if(outerLetter == innerLetter) {
					
					isUnique = false;
					
					System.out.println("The String you entered is not made up entirely of unique characters.");
					System.out.print("As a result, the function testing the String you entered returned ");
					
					break;
					
				}
				
			}

		}
		
		if(isUnique == true) {
			
			System.out.println("The String you entered is made up entirely of unique characters.");
			System.out.print("As a result, the function testing the String you entered returned ");
			
		}

		return isUnique;
		
	}
	
	public static String evenUpperCaseOddLowerCase(Scanner input) {
		
		System.out.println();
		System.out.println("This program will convert a String you enter.");
		System.out.println("It will convert odd numbered characters in the String to lower-case characters.");
	    System.out.println("It will also convert even numbered characters in the String to upper-case letters.");
	    System.out.println();
	    System.out.println("Enter a string: ");
		System.out.println();
		
		String returnString = "",
		       enteredString = input.nextLine();
		
		System.out.println();
		
		for(int i = 0; i < enteredString.length(); i++) {
			
			if(i % 2 == 0) { 
				
				returnString += enteredString.toUpperCase().charAt(i);
				
			} else {
				
				returnString += enteredString.toLowerCase().charAt(i);
				
			}
			
		}
		
		System.out.print("The result of the String you entered is: ");
		
		return returnString;
		
	}
	
	public static String reverseWord(Scanner input) {
		
		System.out.println();
		System.out.println("This program takes a String as input and reverses the String.");
		System.out.println("Once it has done so, it displays the reversed String on the console.");
		System.out.println();
		System.out.println("Please enter a String to be reversed: ");
		System.out.println();
		
		String reversedString = "",
			   enteredString = input.nextLine();
		
		System.out.println();
		
		int stringLength = enteredString.length();
		
		for(int i = 0; i < stringLength; i++) {
			
			reversedString = enteredString.charAt(i) + reversedString;
			
		}
		
		System.out.print("The reverse of the String you entered is: ");
		
		return reversedString;
		
	}
	
	public static String removeMiddleOfString(Scanner input) {
		
		System.out.println();
		System.out.println("This program will return the String you enter without a middle character or without its middle two characters.");
		System.out.println("The String that gets returned will depend on whether or not the String contains an even or odd number of characters.");
		System.out.println();
		System.out.println("Enter a String: ");
		System.out.println();
		
		String returnString = "";
		
		String enteredString = input.nextLine();
		
		System.out.println();
		
		int stringLength = enteredString.length();
		
		for(int i = 0; i < stringLength; i++) {
			
			char character = enteredString.charAt(i);
			
			if(stringLength % 2 == 0) {
				
				if((i == (stringLength / 2)) || (i == ((stringLength / 2) -1 ))) {
					
					continue;
					
				} else {
					
					returnString += character;
					
				}
				
			} else {
				
				if(i == (stringLength / 2)) {
					
					continue;
					
				} else {
					
					returnString += character;
					
				}
					
			}
			
		}
		
		System.out.print("The result of the String you entered is: ");
		
		return returnString;
		
	}
	
	public static boolean isPalindromeString(Scanner input) {
		
		boolean isPalindrome = false;
		
		System.out.println();
		System.out.println("This program determines if a String you enter is a palindrome or not.");
		System.out.println("A palindrome is defined as any word or number that is the same written backwards as it is written forwards.");
		System.out.println();
		System.out.println("Please enter a String: ");
		System.out.println();
		
		String enteredString = input.nextLine(),
			   reversedString = "";
		
		System.out.println();
		
		int stringLength = enteredString.length();
		
		for(int i = 0; i < stringLength; i++) {

			reversedString = enteredString.charAt(i) + reversedString;
			
		}
		
		if(reversedString.equals(enteredString)) {
			
			System.out.print("The String you entered is a palindrome so the program returned a boolean value of ");
			
			isPalindrome = true;
			
		} else {
			
			System.out.print("The String you entered is not a palindrome so the program returned a boolean value of ");
			
			isPalindrome = false;
			
		}
		
		return isPalindrome;
		
	}
	
	
	public static int vowelCounter(Scanner input) {
		
		int numberOfVowels = 0;
		
		System.out.println();
		System.out.println("This program takes a String and counts the number of vowels in it");
		System.out.println("It then returns the number of vowels and displays that number on the console");
		System.out.println();
		System.out.println("Please enter a String: ");
		System.out.println();
		
		String enteredString = input.nextLine();
		
		System.out.println();
		
		int lengthOfString = enteredString.length();
		
		for(int i = 0; i < lengthOfString; i++) {
			
			if(enteredString.charAt(i) == 'a' || (enteredString.charAt(i) == 'A')) {
				
				numberOfVowels++;
				
			} else if(enteredString.charAt(i) == 'e' || (enteredString.charAt(i) == 'E')) {
				
				numberOfVowels++;
				
			} else if (enteredString.charAt(i) == 'i' || (enteredString.charAt(i) == 'I')) {
				
				numberOfVowels++;
				
			} else if (enteredString.charAt(i) == 'o' || (enteredString.charAt(i) == 'O')) {
				
				numberOfVowels++;
				
			} else if ((enteredString.charAt(i) == 'u') || (enteredString.charAt(i) == 'U')) {
				
				numberOfVowels++;
				
			} else {
				
				continue;
				
			}
			
		}
		
		System.out.print("The number of vowels in the String \"" + enteredString + "\" is ");
		
		return numberOfVowels;
		
	}

}