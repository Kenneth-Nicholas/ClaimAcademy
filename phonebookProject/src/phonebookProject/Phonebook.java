package phonebookProject;

public class Phonebook {
    private Person[] personArray;

    public Phonebook() {
    }

    public Phonebook(Person[] personArray) {
        this.personArray = personArray;
    }

    public Person[] getPersonArray() {
        return personArray;
    }

    public void setPersonArray(Person[] personArray) {
        this.personArray = personArray;
    }

    public Person[] addFirstPerson(Person person) {
        Person[] newPersonArray = new Person[1];
        newPersonArray[0] = person;
        newPersonArray[0].setFirstName(person.getFirstName());
        newPersonArray[0].setMiddleName(person.getMiddleName());
        newPersonArray[0].setLastName(person.getLastName());
        newPersonArray[0].setAddress(person.getAddress());
        newPersonArray[0].setPhoneNumber(person.getPhoneNumber());
        return newPersonArray;
    }

    public Person[] addPerson(Person person, Person[] personArray) {
            Person[] newPersonArray = new Person[personArray.length + 1];
            for(int i = 0; i < newPersonArray.length; i++) {
            	Person newPerson = new Person();
            	newPersonArray[i] = newPerson;
            }
            for (int i = 0; i < personArray.length; i++) {
                newPersonArray[i].setFirstName(personArray[i].getFirstName());
                newPersonArray[i].setMiddleName(personArray[i].getMiddleName());
                newPersonArray[i].setLastName(personArray[i].getLastName());
                String streetAddress = personArray[i].getAddress().getStreetAddress();
                String city = personArray[i].getAddress().getCity();
                String state = personArray[i].getAddress().getState();
                String zipCode = personArray[i].getAddress().getZipCode();
                String country = personArray[i].getAddress().getCountry();
                Address newAddress = new Address(streetAddress, city, state, zipCode, country);
                newPersonArray[i].setAddress(newAddress);;
                newPersonArray[i].setPhoneNumber(personArray[i].getPhoneNumber());
            }
            newPersonArray[personArray.length].setFirstName(person.getFirstName());
            newPersonArray[personArray.length].setMiddleName(person.getMiddleName());
            newPersonArray[personArray.length].setLastName(person.getLastName());
            newPersonArray[personArray.length].setAddress(person.getAddress());
            newPersonArray[personArray.length].setPhoneNumber(person.getPhoneNumber());
            return newPersonArray;
    }

    public void removeLastPerson(Person person, Person[] personArray) {
        if((person.getFirstName().equals(personArray[0].getFirstName())) &&
                (person.getMiddleName().equals(personArray[0].getMiddleName())) &&
                (person.getLastName().equals(personArray[0].getLastName())) &&
                (person.getAddress().getStreetAddress().equals(personArray[0].getAddress().getStreetAddress())) &&
                (person.getAddress().getCity().equals(personArray[0].getAddress().getCity())) &&
                (person.getAddress().getState().equals(personArray[0].getAddress().getState())) &&
                (person.getAddress().getZipCode().equals(personArray[0].getAddress().getZipCode())) &&
                (person.getAddress().getCountry().equals(personArray[0].getAddress().getCountry())) &&
                (person.getPhoneNumber().equals(personArray[0].getPhoneNumber()))) {
            System.out.println("The array containing the last phone book record has successfully been replaced by an");
            System.out.println("array containing a single element which is currently empty.\n");
        } else {
            System.out.println("The requested record could not be found.");
        }
    }

    public Person[] removePerson(Person person, Person[] personArray) {
        int indexMarker = -1;
        Person[] newPersonArray = new Person[personArray.length];
        for(int i = 0; i < newPersonArray.length; i++) {
        	Person newPerson = new Person();
        	newPersonArray[i] = newPerson;
        }
        for(int i = 0; i < personArray.length; i++) {
            if((person.getFirstName().equals(personArray[i].getFirstName())) &&
                    (person.getMiddleName().equals(personArray[i].getMiddleName())) &&
                    (person.getLastName().equals(personArray[i].getLastName())) &&
                    (person.getPhoneNumber().equals(personArray[i].getPhoneNumber()))) {
                indexMarker = i;
            }
        }
        if(indexMarker == -1) {
            System.out.println("The requested record could not be found.");
            return personArray;
        }
        if(indexMarker != -1) {
            for(int i = 0; i < personArray.length; i++) {
                if(i == indexMarker){
                    continue;
                } else {
                    newPersonArray[i].setFirstName(personArray[i].getFirstName());
                    newPersonArray[i].setMiddleName(personArray[i].getMiddleName());
                    newPersonArray[i].setLastName(personArray[i].getLastName());
                    newPersonArray[i].setAddress(personArray[i].getAddress());
                    newPersonArray[i].setPhoneNumber(personArray[i].getPhoneNumber());
                }
            }
        }
        System.out.println("You have successfully removed a record \n");
        return newPersonArray;
    }
    
    public void findRecordsByPhoneNumber(Person[] newPersonArray, String phoneNumber) {
    	boolean foundRecord = false;
    	for(int i = 0; i < newPersonArray.length; i++) {
    		if(phoneNumber.equals(newPersonArray[i].getPhoneNumber())) {
    			System.out.print(newPersonArray[i].getFirstName() + " ");
    			System.out.print(newPersonArray[i].getMiddleName() + " ");
    			System.out.print(newPersonArray[i].getLastName() + ", ");
    			System.out.print(newPersonArray[i].getAddress() + ", ");
    			System.out.print(newPersonArray[i].getPhoneNumber() + "\n\n");
    			foundRecord = true;
    		} 
    	}
    	if(!foundRecord) {
    		System.out.println("The phone number you entered did not match any records.");
    	}
    	
    }
    
    public void findRecordsByFirstName(Person[] newPersonArray, String firstName) {
    	boolean foundRecord = false;
    	for(int i = 0; i < newPersonArray.length; i++) {
    		if(firstName.equals(newPersonArray[i].getFirstName())) {
    			System.out.print(newPersonArray[i].getFirstName() + " ");
    			System.out.print(newPersonArray[i].getMiddleName() + " ");
    			System.out.print(newPersonArray[i].getLastName() + " ");
    			System.out.print(newPersonArray[i].getAddress() + " ");
    			System.out.print(newPersonArray[i].getPhoneNumber() + "\n\n");
    			foundRecord = true;
    		} 
    	}
    	if(!foundRecord) {
    		System.out.println("The phone number you entered did not match any records.");
    	}
    }
    
    public void findRecordsByLastName(Person[] newPersonArray, String lastName) {
    	boolean foundRecord = false;
    	for(int i = 0; i < newPersonArray.length; i++) {
    		if(lastName.equals(newPersonArray[i].getLastName())) {
    			System.out.print(newPersonArray[i].getFirstName() + " ");
    			System.out.print(newPersonArray[i].getMiddleName() + " ");
    			System.out.print(newPersonArray[i].getLastName() + " ");
    			System.out.print(newPersonArray[i].getAddress() + " ");
    			System.out.print(newPersonArray[i].getPhoneNumber() + "\n\n");
    			foundRecord = true;
    		} 
    	}
    	if(!foundRecord) {
    		System.out.println("The phone number you entered did not match any records.");
    	}
    }
}
