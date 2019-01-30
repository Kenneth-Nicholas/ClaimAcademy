// 1. Write a method to remove a given character from a String.
//    E.g., remove all 'a' from Average should return verge.
//
// 2. Write a method to remove duplicate characters from a String.
//
// 3. Write a program to count the number of vowels and consonants in a String. 
//    E.g., if the input is Java the result should be 2 vowels and 2 consonants.
// 
// 4. Write a program to display first non-repeated character of a String then the repeating characters.
//    E.g., input morning should display morignn.
// 
// 5. Write a method to count the number of occurrences of the letter 'a' in a char array.
//
// 6. Write a method to remove all white spaces from a char array.
// 
// 7. Write a method to find duplicate characters in a char array.
//
// 8. Write a method to display the words in reverse order. 
//    "How are you" should be displayed "you are How"

package weekTwoMondayLab;

import java.util.Scanner;

public class WeekTwoMondayLab {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
// 1.		
		System.out.println("This program removes all 'a' characters in a String. Please enter a string: ");
		
		String originalString = input.nextLine();
		
		System.out.println(removeACharacters(originalString) + "\n");
		
		
		
		
//		System.out.println("This program removes all 'a' characters in the character array \"Average\"");
//		
//		char[] word = {'A','v','e','r','a','g','e'};
//		
//		System.out.println(removeCharFromArray(word, 'a'));
		
		
// 2.		
		System.out.println("This program removes all duplicate characters in a String. Please enter a string: ");
		
		originalString = input.nextLine();
		
		System.out.println(removeDuplicateCharacters(originalString) + "\n");
		
		
// 3.		
		System.out.println("This program counts the number of vowel and consonant characters in a String. Please enter a string: ");
		
		originalString = input.nextLine();
		
		countVowelsAndConsonants(originalString);
		
		
// 4.		
		System.out.println("This program takes an entered String and prints only the characters that are not duplicated.");
		System.out.println("The duplicated characters are appended onto the end of the String");		
		System.out.println("Please enter a string: ");
		
		originalString = input.nextLine();
		
		System.out.println(displayNonDuplicateCharactersBeforeDuplicates(originalString) + "\n");
		
		
// 5.		
		System.out.println("This program takes an entered String and counts the number of a characters in it.");
		
		originalString = input.nextLine();
		
		char[] characterArray = originalString.toCharArray();
		
		System.out.println(aCharactersInCharacterArray(characterArray) + " a characters in the string \"" + originalString + "\"\n");
		
		
// 6.		
		System.out.println("This program takes an entered String and removes all the spaces from it.");
		
		originalString = input.nextLine();
		
		char[] characterArrayTwo = originalString.toCharArray();
		
		System.out.println(removeSpaceCharactersFromCharacterArray(characterArrayTwo) + "\n");
		
		
// 7.		
		System.out.println("This program takes an entered character array and displays only the characters that are duplicated throught the array.");
		System.out.println("Please enter a character array (a character array is equivalent to entereing a String): ");
		
		originalString = input.nextLine();
		
		char[] characterArrayThree = originalString.toCharArray();
		
		findDuplicateCharactersInCharArray(characterArrayThree);
		
		System.out.println();
		
		
// 8.		
		System.out.println("This program takes an entered String, reverses it, and then prints the resulting reversed String.");
		System.out.println("Please enter a String: ");
		
		originalString = input.nextLine();
		
		System.out.println(displayWordsInReverseOrder(originalString));

		
		
		input.close();

	}
	
// 1.	
	public static String removeACharacters(String originalString) {
		
		int length = originalString.length();
		
		String returnString = "";
		
		for(int i = 0; i < length; i++) {
			
			if((originalString.charAt(i) == 'a') || (originalString.charAt(i) == 'A')) {
				
				continue;
				
			} else {
				
				returnString += originalString.charAt(i);
				
			}	
			
		}
		
		return returnString;
		
	}
	
//	public static char[] removeCharFromArray(char[] word, char letter) {
//		
//		letter = Character.toLowerCase(letter);
//		
//		String result = "";
//		
//		for(int i = 0; i < word.length; i++) {
//			
//			char lowerCaseLetter = Character.toLowerCase(word[i]);
//			
//			if(letter != lowerCaseLetter) {
//				
//				result += word[i];
//				
//			}
//			
//		}
//		
//		return result.toCharArray();
//		
//	}
	
// 2.	
	public static String removeDuplicateCharacters(String originalString) {
		
		String returnString = "";
		
		int length = originalString.length();
		
		for(int i = 0; i < length; i++) {
			
			int numberOfCharacter = 0;
			
			char temporaryCharacterHolder = originalString.charAt(i);
			
			for(int j = 0; j < length; j++) {
				
				if(temporaryCharacterHolder == originalString.charAt(j)) {
					
					numberOfCharacter++;
					
				}
				
			}
			
			if(numberOfCharacter == 1) {
				
				returnString += originalString.charAt(i);
				
			}
			
		}
		
		return returnString;
		
	}
	
// 3.	
	public static void countVowelsAndConsonants(String originalString) {
		
		int numberOfVowels = 0;
		int numberOfConsonants = 0;
		int length = originalString.length();
		
		for(int i = 0; i < length; i++) {
			
			switch (originalString.charAt(i)) {
			
			case 'A': 
				numberOfVowels++;
				break;
				
			case 'a':
				numberOfVowels++;
				break;
				
			case 'E':
				numberOfVowels++;
				break;
				
			case 'e':
				numberOfVowels++;
				break;
				
			case 'I':
				numberOfVowels++;
				break;
				
			case 'i':
				numberOfVowels++;
				break;
				
			case 'O':
				numberOfVowels++;
				break;
				
			case 'o':
				numberOfVowels++;
				break;
				
			case 'U':
				numberOfVowels++;
				break;
				
			case 'u':
				numberOfVowels++;
				break;
				
			default:
				numberOfConsonants++;
				break;
				
			}
				
		}
		
		System.out.println("There are " + numberOfVowels + " vowels in the String \"" + originalString + "\".");
		System.out.println("There are " + numberOfConsonants + " consonants in the String \"" + originalString + "\".\n");
		
	}
	
// 4.	
	public static String displayNonDuplicateCharactersBeforeDuplicates(String originalString) {
		
		String returnString = "";
		
		String endingString = "";
		
		int length = originalString.length();
		
		for(int i = 0; i < length; i++) {
			
			int numberOfCharacter = 0;
			
			char temporaryCharacterHolder = originalString.charAt(i);
			
			for(int j = 0; j < length; j++) {
				
				if(temporaryCharacterHolder == originalString.charAt(j)) {
					
					numberOfCharacter++;
					
				}
				
			}
			
			if(numberOfCharacter == 1) {
				
				returnString += originalString.charAt(i);
				
			} else if (numberOfCharacter >= 2) {
				
				endingString += originalString.charAt(i);
				
			}
			
		}
		
		return returnString + endingString;
		
	}
	
// 5.	
	public static int aCharactersInCharacterArray(char[] characterArray) {
		
		int length = characterArray.length;
		
		int aCharacters = 0;
		
		for(int i = 0; i < length; i++) {
			
			if((characterArray[i] == 'a') || (characterArray[i] == 'A')) {
				
				aCharacters++;
				
			}
			
		}
		
		System.out.print("There are ");
		
		return aCharacters;
		
	}
	
// 6.	
	public static String removeSpaceCharactersFromCharacterArray(char[] characterArray) {
		
		String result = "";
		
		int length = characterArray.length;

		for(int i = 0; i < length; i++) {
			
			if(characterArray[i] != ' ') {
				
				result += characterArray[i];
				
			} 
			
		}

		return result;
		
	}
	
// 7.	
	public static void findDuplicateCharactersInCharArray(char[] characterArrayThree) {

		int length = characterArrayThree.length;
		
		for(int i = 0; i < length; i++) {
			
			for(int j = i + 1; j < length; j++) {
				
				if(characterArrayThree[i] == characterArrayThree[j]) {
					
					System.out.println("The character " + characterArrayThree[i] + " is duplicated in the string you entered.");
					
				}
				
			}
			
		}
		
	}
	
// 8.	
	public static String displayWordsInReverseOrder(String originalString) {
		
		String reversedString = "";
		
		int length = originalString.length();
		
		String[] wordsOfOriginalString = originalString.split(" ");
		
		int numberOfWords = 0;
		
		for(int i = 0; i < wordsOfOriginalString.length; i++) {
			
			if(wordsOfOriginalString[i] != null) {
				
				numberOfWords++;
				
			} else {
				
				break;
				
			}
			
		}
		
		for(int i = numberOfWords; i > 0; i--) {

				reversedString += wordsOfOriginalString[i - 1] + " ";

		}
		
		return reversedString;
		
	}

}