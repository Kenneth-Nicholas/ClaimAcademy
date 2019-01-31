package phonebookProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int selection;

        do {
            System.out.println("Please make a selection below: /n");
            System.out.println("1. Add a new record");
            System.out.println("2. Delete a record");
            System.out.println("3. Find record by telephone number");
            System.out.println("4. Find record by first name");
            System.out.println("5. Find record by last name");
            System.out.println("6. Update a record");
            System.out.println("7. Exit");

            selection = input.nextInt();

            switch(selection) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Error, invalid selection entry. Exiting program.");
                    break;
            }

        } while((selection < 7) && (selection > 0));
    }
}
