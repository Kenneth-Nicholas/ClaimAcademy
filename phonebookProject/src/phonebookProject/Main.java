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
// Test case input for the application:
//
// John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
// John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
// John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
//
// Searching for John should return a list of all 3 records above, displaying the telephone number in this order (636)-453-8563.
// 
//
//
// Just need to fix sort algorithm so that it sorts records in ascending order by last name.


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
            System.out.println("1  - Add a new record");
            System.out.println("2  - Search for record by first name");
            System.out.println("3  - Search for record by last name");
            System.out.println("4  - Search for record by full name");
            System.out.println("5  - Search for record by phone number");
            System.out.println("6  - Search for record by city");
            System.out.println("7  - Search for record by state");
            System.out.println("8  - Delete a record for a given phone number");
            System.out.println("9  - Update a record for a given phone number");
            System.out.println("10 - Show all records in ascending order");
            System.out.println("11 - Exit\n");
            
            selection = input.nextInt();
            
            System.out.println();
            
            input.nextLine();
            
            switch(selection) {
            
                case 1:
                	
                	// 1 - Add a new record
                	
                    System.out.println("Add a new record by entering a person's information in the following format:");
                    System.out.println("FirstName MiddleName LastName, 1111 StreetName Drive, AmazingWeather City, CA, 77777, (111)-777-1111\n");
                    
                    String recordHolder = input.nextLine();
                    
                    System.out.println();
                    
                    String[] recordData = new String[6];
                    
                    recordData = recordHolder.split(", ");
                    
                    if(recordData[5] == null) {
                    	
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
                    
                    String phoneNumber = recordData[5];
                    
                    Address address = new Address(streetAddress, city, state, zipCode);
                    
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
                	
                    // 2  - Search for record by first name

                	System.out.println("Enter a first name to find a record:\n");
                	
                	firstName = input.nextLine();
                	
                	System.out.println();
                	
                	phonebook.findRecordsByFirstName(newPersonArray, firstName);
                	
                    break;
                    
                case 3:
                	
                    // 3  - Search for record by last name
                	
                	System.out.println("Enter a last name to find a record:\n");
                	
                	lastName = input.nextLine();
                	
                	System.out.println();
                	
                	phonebook.findRecordsByLastName(newPersonArray, lastName);
                	
                    break;
                    
                case 4:
                	
                	// 4  - Search for record by full name
                	
                	System.out.println("Enter a full name to find a record in the following format:");
                	System.out.println("\"Firstname Middlename Lastname\"\n");
                	
                	String fullNameForSearch = input.nextLine();
                	
                	System.out.println();
                	
                	String[] stringArrayForFullNameSearch = fullNameForSearch.split(" ");
                	
                	String firstNameForSearch = stringArrayForFullNameSearch[0];
                	
                	String middleNameForSearch = stringArrayForFullNameSearch[1];
                	
                	String lastNameForSearch = stringArrayForFullNameSearch[2];
                	
                	phonebook.findRecordsByFullName(newPersonArray, firstNameForSearch, middleNameForSearch, lastNameForSearch);
                	
                    break;
                    
                case 5:
                	
                	// 5  - Search for record by phone number
                	
                	System.out.println("Enter a telephone to find a record:\n");
                	
                	phoneNumber = input.nextLine();
                	
                	System.out.println();
                	
                	phonebook.findRecordsByPhoneNumber(newPersonArray, phoneNumber);
                	
                    break;
                    
                case 6:
                	
                	// 6  - Search for record by city
                	
                	System.out.println("Enter a city to find a record:\n");
                	
                	String cityForSearch = input.nextLine();
                	
                	System.out.println();
                	
                	phonebook.findRecordsByCity(newPersonArray, cityForSearch);
                	
                    break;
                    
                case 7:
                	
                	// 7  - Search for record by state
                	
                	System.out.println("Enter a state to find a record:\n");
                	
                	String stateForSearch = input.nextLine();
                	
                	System.out.println();
                	
                	phonebook.findRecordsByState(newPersonArray, stateForSearch);
                    
                    break;
                    
                case 8:
                	
                	// 8  - Delete a record for a given phone number
                	
                    System.out.println("Remove a record by entering a person's phone number in the following format: ");
                    System.out.println("(111)-777-1111\n");
                    
                    String phoneNumberHolderForRemoval = input.nextLine();
                    
                    System.out.println();
                    
                    if(newPersonArray.length == 1) {
                    	
                        phonebook.removeLastPerson(newPersonArray, phoneNumberHolderForRemoval);
                        
                    } else if (newPersonArray.length == 0) {
                    	
                        System.out.println("There are currently no records in the phone book, and therefore, it is impossible to remove a record.");
                    
                    } else {
                    	
                        newPersonArray = phonebook.removePerson(newPersonArray, phoneNumberHolderForRemoval);
                        
                    }
                    
                	break;

                case 9:
                	
                	// 9  - Update a record for a given phone number
                	
                	System.out.println("Enter a phone number in the following format in order to update a record \"(111)-333-7777\":\n");
                	
                	String phoneNumberForUpdating = input.nextLine();
                	
                	System.out.println();
                	System.out.println("Enter the information that you would like the record listed under the phone number: " + phoneNumberForUpdating + " to be updated to.");
                	System.out.println("\"FirstName MiddleName LastName, 1111 StreetName Drive, AmazingWeather City, CA, 77777, (111)-777-1111\"\n");
                	
                    String recordHolder2 = input.nextLine();
                    
                    System.out.println();
                    
                    String[] recordData2 = new String[6];
                    
                    recordData2 = recordHolder2.split(", ");
                    
                    if(recordData2[5] == null) {
                    	
                        System.out.println("Error, you did not enter the record correctly.");
                        
                    }
                    
                    String nameHolder2 = recordData2[0];
                    
                    String[] nameData2 = new String[3];
                    
                    nameData2 = nameHolder2.split(" ");
                    
                    String firstName2 = nameData2[0];
                    String middleName2 = nameData2[1];
                    String lastName2 = nameData2[2];
                    
                    String streetAddress2 = recordData2[1];
                    String city2 = recordData2[2];
                    String state2 = recordData2[3];
                    String zipCode2 = recordData2[4];
                    
                    String phoneNumber2 = recordData2[5];
                    
                    Address address2 = new Address(streetAddress2, city2, state2, zipCode2);
                    
                    Person personForUpdating = new Person(firstName2, middleName2, lastName2, address2, phoneNumber2);
                	
                	newPersonArray = phonebook.updateRecordByPhoneNumber(newPersonArray, phoneNumberForUpdating, personForUpdating);
                	
                	break;
                	
                case 10:
                	
                	// 10 - Show all records in ascending order
                	
                	// newPersonArray = phonebook.sortRecordsInAscendingOrderByLastName(newPersonArray);
                	
                	phonebook.displayAllRecords(newPersonArray);
                	
                	break;
                	
                case 11:
                	
                    System.out.println("Exiting program");
                    
                    break;
                    
                default:
                	
                    System.out.println("Error, invalid selection entry. Exiting program.");
                    
                    break;
                    
            }
            
        } while(selection != 11); 
        
        input.close();
        
    }
    
}