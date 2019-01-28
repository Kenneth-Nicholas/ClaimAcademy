package changeMaker;

import java.util.Scanner;

public class ChangeMaker {
		
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("This program determines the amount of quarters, dimes, nickles, and pennies that will be returned to a");
			System.out.println("customer after a customer makes a purchase.");
			System.out.println();
			System.out.println("Please enter the change due to the customer (Please note, change should be written with a decimal point e.g., .99 cents) : ");
			System.out.println();
			
			double totalChangeDue = input.nextDouble();
			
			System.out.println();
			
			int calculatedNumberOfQuarters = calculateNumberOfQuarters(totalChangeDue);
			int calculatedNumberOfDimes = calculateNumberOfDimes(totalChangeDue, calculatedNumberOfQuarters);
			int calculatedNumberOfNickels = calculateNumberOfNickels(totalChangeDue, calculatedNumberOfQuarters, calculatedNumberOfDimes);
			int calculatedNumberOfPennies = calculateNumberOfPennies(totalChangeDue, calculatedNumberOfQuarters, calculatedNumberOfDimes, calculatedNumberOfNickels);
			
			System.out.println("Quarters: " + calculatedNumberOfQuarters);
			System.out.println("Dimes: " + calculatedNumberOfDimes);
			System.out.println("Nickels: " + calculatedNumberOfNickels);
			System.out.println("Pennies: " + calculatedNumberOfPennies);
			
			input.close();
			
		}
		
		private static int calculateNumberOfQuarters(double totalChangeDue) {
			
			final int valueOfQuarter = 25;
			
			int calculatedNumberOfQuarters = (int) ((totalChangeDue * 100) / valueOfQuarter);
			
			return calculatedNumberOfQuarters;
			
		}
		
		private static int calculateNumberOfDimes(double totalChangeDue, int calculatedNumberOfQuarters) {
			
			final int valueOfQuarter = 25;
			final int valueOfDime = 10;
			
			int calculatedNumberOfDimes = (int) (((totalChangeDue * 100) - (calculatedNumberOfQuarters * valueOfQuarter)) / valueOfDime);
			
			return calculatedNumberOfDimes;
			
		}

		private static int calculateNumberOfNickels(double totalChangeDue, int calculatedNumberOfQuarters, int calculatedNumberOfDimes) {
			
			final int valueOfQuarter = 25;
			final int valueOfDime = 10;
			final int valueOfNickel = 5;
			
			int calculatedNumberOfNickels = (int) (((totalChangeDue * 100) - (calculatedNumberOfQuarters * valueOfQuarter) - (calculatedNumberOfDimes * valueOfDime)) / valueOfNickel);
			
			return calculatedNumberOfNickels;
			
		}

		private static int calculateNumberOfPennies(double totalChangeDue, int calculatedNumberOfQuarters, int calculatedNumberOfDimes, int calculatedNumberOfNickels) {
			
			final int valueOfQuarter = 25;
			final int valueOfDime = 10;
			final int valueOfNickel = 5;
			final int valueOfPenny = 1;
			
			int calculatedNumberOfPennies = (int) (((totalChangeDue * 100) - (calculatedNumberOfQuarters * valueOfQuarter) - (calculatedNumberOfDimes * valueOfDime) - (calculatedNumberOfNickels * valueOfNickel)) / valueOfPenny);
			
			return calculatedNumberOfPennies;
			
		}

}


