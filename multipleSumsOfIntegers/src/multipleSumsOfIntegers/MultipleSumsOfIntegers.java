package multipleSumsOfIntegers;

public class MultipleSumsOfIntegers {

	public static void main(String[] args) {
		
		System.out.println(sumOfNumbersInRange(1, 10));
		System.out.println(sumOfNumbersInRange(20, 30));
		System.out.println(sumOfNumbersInRange(35, 45));
		
	}
	
	public static int sumOfNumbersInRange(int startOfRange, int endOfRange) {
		
		int sum = 0;
		
		for(int i = startOfRange; i <= endOfRange; i++) {
			
			sum += i;
			
		}
		
		return sum;
		
	}

}
