// Use the toString method when printing out the address of a person. Do so by writing
// System.out.println(newPersonArray[element].address);
// Java calls the toString method of the object class automatically whenever you print an object. You need to override
// the toString class in the class that has an object as an instance variable though so that you can print the address
// instead of having to call each getter in print statements.
//
// In order to compare the contents of two objects instead of their references, you must overload the comparator.
// Otherwise, using object.getThing().equals(objectArray[element].getThing()); will always return false because with
// objects, it ends up comparing references, not the contents of the objects themselves.
//
// Try to fix the find record selections by also successfully comparing the contents of the both of the person object's
// address instance variable
//
// Project 2 PhoneBook Application
// Write a program to simulate the actions of a phone book.
// Your program should be able to :
// Add new entries 
// Search for an existing entry
// Search by first name *
// Search by last name *
// Search by full name *note name is not unique therefore the result should be an array of Person Objects.
// Search by telephone number
// Search by city or state
// Delete a record for a given telephone number
// Update a record for a given telephone number
// Show all records in ascending order
// An option to exit the program 
// Your program should operate on the console. It should display all the choices when the program loads. E.g., 1. Add new record
// 2. Delete a record
// Etc.. where 1 representing the action for adding a record and 2 representing the action
// for deleting a record.
// Your program should run until the user selects the exit option. 
// Your program should have a minimum of 2 classes a Person class, an Address  class.
//
// Test case :
// John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
// John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
// John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
//
// Searching for John should return a list of all 3 records above, displaying the telephone number in this order (636)-453-8563.
//
// Optional add additional features to your program, for storing cell, home, work and fax numbers. 
// Also features for storing events like birthday, anniversary, email… etc   
//
// Problem with remove person - requested record could not be found when you add 2 or more people to array.
// Because the address of the second person is also being stored as the address for the first person.
//
//

package phonebookProject;

import phonebookProject.Address;
import phonebookProject.Person;
import phonebookProject.Phonebook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;
        boolean firstAddition = true;
        Phonebook phonebook = new Phonebook();
        Person[] newPersonArray = new Person[1];
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
                    System.out.println("Add a new record by entering a person's information in the following format: ");
                    System.out.println("FirstName MiddleName LastName, 1111 StreetName Drive, AmazingWeather City, CA, 77777, United States of America, 111-777-1111");
                    String recordHolder = input.nextLine();
                    String[] recordData = new String[7];
                    recordData = recordHolder.split(", ");
                    if(recordData[6] == null) {
                        System.out.println("Error, you did not enter the record correctly.");
                    }
                    String nameHolder = recordData[0];
                    String[] nameData = new String[3];
                    nameData = nameHolder.split(" ");
                    String firstName = nameData[0];
                    String middleName = nameData[1];
                    String lastName = nameData[2];
                    String streetAddress = recordData[1];
                    String city = recordData[2];
                    String state = recordData[3];
                    String zipCode = recordData[4];
                    String country = recordData[5];
                    String phoneNumber = recordData[6];
                    Address address = new Address(streetAddress, city, state, zipCode, country);
                    newPerson.setAddress(address);
                    newPerson = new Person(firstName, middleName, lastName, address, phoneNumber);
                    if(firstAddition) {
                    	newPersonArray = phonebook.addFirstPerson(newPerson);
                    } else {
                    	newPersonArray = phonebook.addPerson(newPerson, newPersonArray);
                    }
                System.out.println("You have successfully added a new record\n");
                firstAddition = false;
                break;
                case 2:
                    System.out.println("Remove a record by entering a person's information in the following format: ");
                    System.out.println("FirstName MiddleName LastName, 1111 StreetName Drive, AmazingWeather City, CA, 77777, United States of America, 111-777-1111");
                    String recordHolderForRemoval = input.nextLine();
                    String[] recordDataForRemoval = new String[7];
                    recordDataForRemoval = recordHolderForRemoval.split(", ");
                    if(recordDataForRemoval[6] == null) {
                        System.out.println("Error, you did not enter the record correctly.");
                    }
                    String nameHolderForRemoval = recordDataForRemoval[0];
                    String[] nameDataForRemoval = new String[3];
                    nameDataForRemoval = nameHolderForRemoval.split(" ");
                    String firstNameForRemoval = nameDataForRemoval[0];
                    String middleNameForRemoval = nameDataForRemoval[1];
                    String lastNameForRemoval = nameDataForRemoval[2];
                    String streetAddressForRemoval = recordDataForRemoval[1];
                    String cityForRemoval = recordDataForRemoval[2];
                    String stateForRemoval = recordDataForRemoval[3];
                    String zipCodeForRemoval = recordDataForRemoval[4];
                    String countryForRemoval = recordDataForRemoval[5];
                    String phoneNumberForRemoval = recordDataForRemoval[6];
                    Address addressForRemoval = new Address(streetAddressForRemoval, cityForRemoval, stateForRemoval, zipCodeForRemoval, countryForRemoval);
                    Person newPersonForRemoval = new Person(firstNameForRemoval, middleNameForRemoval, lastNameForRemoval, addressForRemoval, phoneNumberForRemoval);
                    if(newPersonArray.length == 1) {
                        phonebook.removeLastPerson(newPersonForRemoval, newPersonArray);
                    } else if (newPersonArray.length == 0) {
                        System.out.println("There are currently no records in the phone book, and therefore, it is impossible to remove a record.");
                    } else {
                        newPersonArray = phonebook.removePerson(newPersonForRemoval, newPersonArray);
                    }
                    break;
                case 3:
                	System.out.print("Enter a telephone to find a record: ");
                	phoneNumber = input.nextLine();
                	phonebook.findRecordsByPhoneNumber(newPersonArray, phoneNumber);
                    break;
                case 4:
                	System.out.print("Enter a first name to find a record: ");
                	firstName = input.nextLine();
                	phonebook.findRecordsByFirstName(newPersonArray, firstName);
                    break;
                case 5:
                	System.out.print("Enter a last name to find a record: ");
                	lastName = input.nextLine();
                	phonebook.findRecordsByLastName(newPersonArray, lastName);
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
