
package thursdayLab;

public class ThursdayLab {

	public static void main(String[] args) {
		
		System.out.println(sumLimit(2, 3));
		System.out.println(sumLimit(8, 3));
		System.out.println(sumLimit(8, 1));
		
		System.out.println(squirrelPlay(70, false));
		System.out.println(squirrelPlay(95, false));
		System.out.println(squirrelPlay(95, true));
		
		System.out.println(greenTicket(1, 2, 3));
		System.out.println(greenTicket(2, 2, 2));
		System.out.println(greenTicket(1, 1, 2));
		
		System.out.println(countXX("abcxx"));
		System.out.println(countXX("xxx"));
		System.out.println(countXX("xxxx"));
		
		System.out.println(stringTimes("Hi", 2));
		System.out.println(stringTimes("Hi", 3));
		System.out.println(stringTimes("Hi", 1));

	}

	public static int sumLimit(int a, int b) {
		
		int sumHolder = a + b;
		
		int sum;
		
		String aString = Integer.toString(a);
		
		String sumString = Integer.toString(sumHolder);
		
		if(aString.length() == sumString.length()) {
			
			sum = sumHolder;
			
		} else {
			
			sum = a;
			
		}
		
		return sum;
		
	}
	
	public static boolean squirrelPlay(int temperature, boolean isSummer) {
		
		boolean arePlaying;
		
		if(isSummer) {
			
			if(temperature >= 60 && temperature <= 100) {
				
				arePlaying = true;
				
			} else {
				
				arePlaying = false;
				
			}
			
		} else {
			
			if(temperature >= 60 && temperature <= 90) {
				
				arePlaying = true;
				
			} else {
				
				arePlaying = false;
				
			}
		}
		
		return arePlaying;
		
	}
	
	public static int greenTicket(int a, int b, int c) {
		
		int result;
		
		if((a == b) && (a == c)) {
			
			result = 20;
			
		} else if ((a == b) || (a == c) || (b == c)) {
			
			result = 10;
			
		} else {
			
			result = 0;
			
		}
		
		return result;
		
	}
	
	public static int countXX(String givenString) {
		
		int countXX = 0;
		
		int lengthOfGivenString = givenString.length();
		
		for(int i = 0; i < lengthOfGivenString - 1; i++) {
			
			if(givenString.substring(i, i + 2).equals("xx")) {
				
				countXX++;
				
			}
			
		}
		
		return countXX;
		
	}
	
	public static String stringTimes(String originalString, int times) {
		
		String returnString = "";
		
		for(int i = 1; i <= times; i++) {
			
			returnString += originalString;
			
		}
		
		return returnString;
		
	}

}
