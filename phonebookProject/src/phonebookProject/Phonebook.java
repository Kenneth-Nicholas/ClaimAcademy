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
        
        Person tempPerson = new Person();
        
        newPersonArray[0] = tempPerson;
        
        newPersonArray[0].setFirstName(person.getFirstName());
        newPersonArray[0].setMiddleName(person.getMiddleName());
        newPersonArray[0].setLastName(person.getLastName());
        
        String streetAddress = person.getAddress().getStreetAddress();
        String city = person.getAddress().getCity();
        String state = person.getAddress().getState();
        String zipCode = person.getAddress().getZipCode();
        
        Address address = new Address(streetAddress, city, state, zipCode);
        
        newPersonArray[0].setAddress(address);
        
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
                
                Address newAddress = new Address(streetAddress, city, state, zipCode);
                
                newPersonArray[i].setAddress(newAddress);;
                
                newPersonArray[i].setPhoneNumber(personArray[i].getPhoneNumber());
                
            }
            
            newPersonArray[personArray.length].setFirstName(person.getFirstName());
            newPersonArray[personArray.length].setMiddleName(person.getMiddleName());
            newPersonArray[personArray.length].setLastName(person.getLastName());
            
            String streetAddress = person.getAddress().getStreetAddress();
            String city = person.getAddress().getCity();
            String state = person.getAddress().getState();
            String zipCode = person.getAddress().getZipCode();
            
            Address address = new Address(streetAddress, city, state, zipCode);
            
            newPersonArray[personArray.length].setAddress(address);
            
            newPersonArray[personArray.length].setPhoneNumber(person.getPhoneNumber());
            
            return newPersonArray;
            
    }

    public void removeLastPerson(Person[] personArray, String phoneNumberForRemoval) {
    	
    	for(int i = 0; i < personArray.length; i++) {
    	
    		if(personArray[i].getPhoneNumber() == phoneNumberForRemoval) {
                System.out.println("The array containing the last phone book record has successfully been deleted");
    			continue;
    		} else {
    			System.out.println("The requested record could not be found.");
    		}
    		
    	}
   
    }

    public Person[] removePerson(Person[] personArray, String phoneNumberForRemoval) {
    	
        int indexMarker = -1;
        
        Person[] newPersonArray = new Person[personArray.length];
        
        for(int i = 0; i < newPersonArray.length; i++) {
        	
        	Person newPerson = new Person();
        	
        	newPersonArray[i] = newPerson;
        	
        }
        
        for(int i = 0; i < personArray.length; i++) {
        	
            if(personArray[i].getPhoneNumber() == phoneNumberForRemoval) {
            	
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
                    
                    String streetAddress = personArray[i].getAddress().getStreetAddress();
                    String city = personArray[i].getAddress().getCity();
                    String state = personArray[i].getAddress().getState();
                    String zipCode = personArray[i].getAddress().getZipCode();
                    
                    Address address = new Address(streetAddress, city, state, zipCode);
                    
                    newPersonArray[i].setAddress(address);
                    
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
    		
    		System.out.println("The first name you entered did not match any records.");
    		
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
    		
    		System.out.println("The last name you entered did not match any records.");
    		
    	}
    	
    }
    
    public void findRecordsByFullName(Person[] newPersonArray, String firstName, String middleName, String lastName) {
    	
    	boolean foundRecord = false;
    	
    	for(int i = 0; i < newPersonArray.length; i++) {
    		
    		if((firstName.equals(newPersonArray[i].getFirstName())) && 
    				(middleName.equals(newPersonArray[i].getMiddleName())) && 
    				(lastName.equals(newPersonArray[i].getLastName()))) {
    			
    			System.out.print(newPersonArray[i].getFirstName() + " ");
    			System.out.print(newPersonArray[i].getMiddleName() + " ");
    			System.out.print(newPersonArray[i].getLastName() + " ");
    			System.out.print(newPersonArray[i].getAddress() + " ");
    			System.out.print(newPersonArray[i].getPhoneNumber() + "\n\n");
    			
    			foundRecord = true;
    			
    		} 
    		
    	}
    	
    	if(!foundRecord) {
    		
    		System.out.println("The full name you entered did not match any records.");
    		
    	}
    	
    }
    
    public void findRecordsByCity(Person[] newPersonArray, String city) {
    	
    	boolean foundRecord = false;
    	
    	for(int i = 0; i < newPersonArray.length; i++) {
    		
    		if(newPersonArray[i].getAddress().getCity().equals(city)) {
    			
    			System.out.print(newPersonArray[i].getFirstName() + " ");
    			System.out.print(newPersonArray[i].getMiddleName() + " ");
    			System.out.print(newPersonArray[i].getLastName() + " ");
    			System.out.print(newPersonArray[i].getAddress() + " ");
    			System.out.print(newPersonArray[i].getPhoneNumber() + "\n\n");
    			
    			foundRecord = true;
    			
    		}
    		
    	}
    	
    	if(!foundRecord) {
    		
    		System.out.println("The city you entered did not match any records.");
    		
    	}
    
    }
    
    public void findRecordsByState(Person[] newPersonArray, String state) {
    	
    	boolean foundRecord = false;
    	
    	for(int i = 0; i < newPersonArray.length; i++) {
    		
    		if(newPersonArray[i].getAddress().getState().equals(state)) {
    			
    			System.out.print(newPersonArray[i].getFirstName() + " ");
    			System.out.print(newPersonArray[i].getMiddleName() + " ");
    			System.out.print(newPersonArray[i].getLastName() + " ");
    			System.out.print(newPersonArray[i].getAddress() + " ");
    			System.out.print(newPersonArray[i].getPhoneNumber() + "\n\n");
    			
    			foundRecord = true;
    			
    		}
    		
    	}
    	
    	if(!foundRecord) {
    		
    		System.out.println("The state you entered did not match any records.");
    		
    	}
    
    }
    
}
