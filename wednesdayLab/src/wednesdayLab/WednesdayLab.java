/* Wednesday Lab

1. Write a method called "max3" that computes the maximum value of THREE integers.

2. Write a method called "min3" that computes the minimum value of THREE Integers. 

3. Write a method called "median3" that computes the MEDIAN value of THREE integers. 
Hint: for the case of three numbers, the median is the value that is NOT the maximum NOR the minimum, 
so add the three values and subtract out the min and max, using the methods you wrote for problems #1 and #2.

4. Write a method called "xor" that takes two boolean values (either true or false), 
and returns a boolean value which is true if EITHER of the values is true BUT NOT BOTH of them. 
This is called the "xor" function, or "eXclusive OR" (where we are excluding the case where both values are true).

5. Write a method "isFactor" which takes two integers (k and n) and returns true iff ("if and only if") k is a factor of n.

6. Write a method "isPerfect" which takes an integer and returns true iff that integer is a perfect number  
Your method MUST call the "isFactor" method you wrote for problem #5.

7. Write a method "isPrime" which takes an integer and returns true iff it is a prime number. 
Your method MUST call the "isFactor" method you wrote for problem #5. */

package wednesdayLab;

import java.util.Scanner;

public class WednesdayLab {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter three numbers");
		System.out.println();
		
		int v1 = input.nextInt();
		int v2 = input.nextInt();
		int v3 = input.nextInt();
		
		int result = max3(v1, v2, v3);
		
		System.out.println();
		System.out.println("The max number is: " + result);
		
		result = min3(v1, v2, v3);
		
		System.out.println();
		System.out.println("The min number is: " + result);
		
		result = median3(v1, v2, v3);
		
		System.out.println();
		System.out.println("The median number is: " + result);
		
		System.out.println();
		System.out.println("Please enter true or false as a test condition two times");
		System.out.println();
		
		input.nextLine(); // handle new line character.
		
		boolean testConditionOne = input.nextBoolean();
		boolean testConditionTwo = input.nextBoolean();
		
		System.out.println();
		System.out.println("When passing these test conditions to the exclusive or function, "
				+ "the result returned by the function was " + xor(testConditionOne, testConditionTwo) + ".");
		
		System.out.println();
		System.out.println("Please enter two integer values.");
		System.out.println("Firstly, enter an integer value for the integer k.");
		System.out.println("Secondly, enter an integer value for the integer n.");
		System.out.println("The value you enter for integer k and integer n will be passed to the function isFactor.");
		System.out.println("The isFactor function will determine if the integer k is a factor of the integer n.");
		System.out.println();
		
		input.nextLine();
		
		int n = input.nextInt();
		int k = input.nextInt();
		
		System.out.println();
		System.out.println("The result of passing integer n and integer k to the function isFactor is "
				+ isFactor(n, k) + ".");
		System.out.println();
		
		if (isFactor(n, k)) {
			
			System.out.println("So the integer k is a factor of the integer n.");
			
		} else {
			
			System.out.println("So the integer k is not a factor of the integer n.");
			
		}
		
		System.out.println();
		System.out.println("Please enter an integer value to be stored in the variable x.");
		System.out.println("The variable x will be passed to a function called isPerfect, which will determine ");
		System.out.println("if the variable x is a perfect number. A perfect number is defined as a number whose sum ");
		System.out.println("of factors, not including the number itself, is equal to the number itself.");
		System.out.println();
		
		int x = input.nextInt();
		
		System.out.println();
		System.out.println("The result of passing the integer " + x + " to the function isPerfect is "
				+ isPerfect(x) + ".");
		
		if(isPerfect(x)) {
			
			System.out.println("So that means that " + x + " is a perfect number.");
			
		} else {
			
			System.out.println("So that means that " + x + " is not a perfect number.");
			
		}
		
		System.out.println();
		System.out.println("Please enter an integer value to be stored in the variable y.");
		System.out.println("The variable y will be passed to a function called isPrime, which will determine ");
		System.out.println("if the variable y is a prime number. A prime number is defined as a number, which, can only ");
		System.out.println("be divided evenly by the number one and the number itself.");
		System.out.println();
		
		int y = input.nextInt();
		
		System.out.println();
		System.out.println("The result of passing the integer " + y + " to the function isPrime is "
				+ isPrime(y) + ".");
		
		if(isPrime(y)) {
			
			System.out.println("As a result, we know that the number " + y + " is a prime number.");
			
		} else {
			
			System.out.println("As a result, we know that the number " + y + " is not a prime number.");
			
		}
		
		input.close();

	}
	
	public static int max3(int valueOne, int valueTwo, int valueThree) {
		
		int max = valueOne;
		
		if(valueTwo > max) {
			
			max = valueTwo;
			
		} 
		
		if (valueThree > max) {
			
			max = valueThree;
			
		}
		
		return max;
		
	}
	
	public static int min3(int valueOne, int valueTwo, int valueThree) {
		
		int min = valueOne;
		
		if(valueTwo < min) {
			
			min = valueTwo;
			
		}
		
		if(valueThree < min) {
			
			min = valueThree;
			
		}
		
		return min;
		
	}
	
	public static int median3(int valueOne, int valueTwo, int valueThree) {
		
		int median = (valueOne + valueTwo + valueThree) 
				- (max3(valueOne, valueTwo, valueThree)) 
				- (min3(valueOne, valueTwo, valueThree));
		
		return median;
		
	}
	
	public static boolean xor(boolean conditionOne, boolean conditionTwo) {
		
		boolean returnCondition;
		
		if((conditionOne == true) && (conditionTwo == true)) {
			
			returnCondition = false;
			
		} else if ((conditionOne == true) || (conditionTwo == true)) {
			
			returnCondition = true;
			
		} else {
			
			returnCondition = false;
			
		}
		
		return returnCondition;
		
	}
	
	public static boolean isFactor(int k, int n) {
		
		boolean isFactor;
		
		if(n %  k == 0) {
			
			isFactor = true;
			
		} else {
			
			isFactor = false;
			
		}
		
		return isFactor;
		
	}
	
	public static boolean isPerfect(int x) {
		
		boolean isPerfect;
		
        int sumOfDivisorsLessThanNumber = 0;

        if(x < 1) {

            isPerfect = false;

        } else {

            for(int i = 1; i < x; i++) {

                if(isFactor(i, x)) {
                	
                	sumOfDivisorsLessThanNumber += i;
                	
                }

            }

            if(sumOfDivisorsLessThanNumber == x) {

                isPerfect = true;

            } else {

                isPerfect = false;

            }

        }

        return isPerfect;

    }
	
	public static boolean isPrime(int y) {
		
		boolean isPrime = false;
  
		for (int i = 2; i < y; i++) {  
			
			if (isFactor(i, y)) {               
	                
				isPrime = false;
	    	
			} else {                               

				isPrime = true;
	        
			}
		
		}
		
		return isPrime;

	}
	
}