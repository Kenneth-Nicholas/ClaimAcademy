package phonebookProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;
        boolean firstAddition = true;
        int length = 1;
        Phonebook phonebook = new Phonebook();
        Person[] newPersonArray = new Person[length];
        Person newPerson = new Person();
        newPersonArray[0] = newPerson;

        do {
            System.out.println("Please make a selection below by entering one of the following numbers: \n");
            System.out.println("1 - Add a new record");
            System.out.println("2 - Delete a record");
            System.out.println("3 - Find record by telephone number");
            System.out.println("4 - Find record by first name");
            System.out.println("5 - Find record by last name");
            System.out.println("6 - Update a record");
            System.out.println("7 - Exit");
            selection = input.nextInt();
            System.out.println();
            input.nextLine();
            switch(selection) {
                case 1:
                    System.out.print("Enter the person's first name: ");
                    String firstName = input.nextLine();
                    System.out.print("Enter the person's middle name: ");
                    String middleName = input.nextLine();
                    System.out.print("Enter the person's last name: ");
                    String lastName = input.nextLine();
                    System.out.print("Enter the person's street address: ");
                    String streetAddress = input.nextLine();
                    System.out.print("Enter the person's city: ");
                    String city = input.nextLine();
                    System.out.print("Enter the person's state: ");
                    String state = input.nextLine();
                    System.out.print("Enter the person's zip code: ");
                    String zipCode = input.nextLine();
                    System.out.print("Enter the person's country: ");
                    String country = input.nextLine();
                    Address address = new Address(streetAddress, city, state, zipCode, country);
                    System.out.print("Enter the person's phone number: ");
                    String phoneNumber = input.nextLine();
                    newPerson = new Person(firstName, middleName, lastName, address, phoneNumber);
                    newPersonArray = phonebook.addPerson(newPerson, newPersonArray, firstAddition, length);
                    System.out.println("You have successfully added a new record");
                    length++;
                    break;
                case 2:
                    System.out.print("Enter the first name of the person whose record you would like to remove: ");
                    String firstNameForRemoval = input.nextLine();
                    System.out.print("Enter the middle name of the person whose record you would like to remove: ");
                    String middleNameForRemoval = input.nextLine();
                    System.out.print("Enter the last name of the person whose record you would like to remove: ");
                    String lastNameForRemoval = input.nextLine();
                    System.out.print("Enter the street address of the person whose record you would like to remove: ");
                    String streetAddressForRemoval = input.nextLine();
                    System.out.print("Enter the city of the person whose record you would like to remove: ");
                    String cityForRemoval = input.nextLine();
                    System.out.print("Enter the state of the person whose record you would like to remove: ");
                    String stateForRemoval = input.nextLine();
                    System.out.print("Enter the zip code of the person whose record you would like to remove: ");
                    String zipCodeForRemoval = input.nextLine();
                    System.out.print("Enter the country of the person whose record you would like to remove: ");
                    String countryForRemoval = input.nextLine();
                    Address addressForRemoval = new Address(streetAddressForRemoval, cityForRemoval, stateForRemoval, zipCodeForRemoval, countryForRemoval);
                    System.out.print("Enter the phone number of the person whose record you would like to remove: ");
                    String phoneNumberForRemoval = input.nextLine();
                    Person newPersonForRemoval = new Person(firstNameForRemoval, middleNameForRemoval, lastNameForRemoval, addressForRemoval, phoneNumberForRemoval);
                    newPersonArray = phonebook.removePerson(newPersonForRemoval, newPersonArray, length);
                    // if size of array is one less, length--;
                    break;
                case 3:
                	System.out.print("Enter a telephone to find a record: ");
                	phoneNumber = input.nextLine();
                	phonebook.findRecordsByPhoneNumber(newPersonArray, phoneNumber, length);
                	// Find records by telephone number
                    break;
                case 4:
                	System.out.print("Enter a first name to find a record: ");
                	firstName = input.nextLine();
                	phonebook.findRecordsByFirstName(newPersonArray, firstName, length);
                	// Find records by first name
                    break;
                case 5:
                	System.out.print("Enter a last name to find a record: ");
                	lastName = input.nextLine();
                	phonebook.findRecordsByLastName(newPersonArray, lastName, length);
                	// Find records by last name
                    break;
                case 6:
                	// Update a record
                    break;
                case 7:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Error, invalid selection entry. Exiting program.");
                    break;
            }
        } while((selection < 7) && (selection > 0));      
        input.close();
    }
}
