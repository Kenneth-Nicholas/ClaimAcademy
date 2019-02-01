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

    public Person[] addPerson(Person person, Person[] personArray, boolean firstAddition, int length) {

        if(firstAddition) {
            Person[] newPersonArray = new Person[length];
            newPersonArray[length - 1] = person;
            newPersonArray[length - 1].setFirstName(person.getFirstName());
            newPersonArray[length - 1].setMiddleName(person.getMiddleName());
            newPersonArray[length - 1].setLastName(person.getLastName());
            newPersonArray[length - 1].setAddress(person.getAddress());
            newPersonArray[length - 1].setPhoneNumber(person.getPhoneNumber());
            firstAddition = false;
            return newPersonArray;
        } else {
            Person[] newPersonArray = new Person[length + 1];
            newPersonArray[length] = person;
            for (int i = 0; i < length; i++) {
                newPersonArray[i].setFirstName(personArray[i].getFirstName());
                newPersonArray[i].setMiddleName(personArray[i].getMiddleName());
                newPersonArray[i].setLastName(personArray[i].getLastName());
                newPersonArray[i].setAddress(personArray[i].getAddress());
                newPersonArray[i].setPhoneNumber(personArray[i].getPhoneNumber());
            }
            newPersonArray[length].setFirstName(person.getFirstName());
            newPersonArray[length].setMiddleName(person.getMiddleName());
            newPersonArray[length].setLastName(person.getLastName());
            newPersonArray[length].setAddress(person.getAddress());
            newPersonArray[length].setPhoneNumber(person.getPhoneNumber());
            length++;
            return newPersonArray;
        }

    }

    public Person[] removePerson(Person person, Person[] personArray, int length) {
        int indexMarker = -1;
        Person[] newPersonArray = new Person[length];
        newPersonArray[length - 1] = person;
        for(int i = 0; i < length; i++) {
            if((person.getFirstName().equals(personArray[i].getFirstName())) &&
                    (person.getMiddleName().equals(personArray[i].getMiddleName())) &&
                    (person.getLastName().equals(personArray[i].getLastName())) &&
                    (person.getAddress().equals(personArray[i].getAddress())) &&
                    (person.getPhoneNumber().equals(personArray[i].getPhoneNumber()))) {
                indexMarker = i;
            } else {
                continue;
            }
        }
        if(indexMarker == -1) {
            System.out.println("The requested record could not be found.");
        }
        if(indexMarker != -1) {
            for(int i = 0; i < length; i++) {
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
        length--;
        return newPersonArray;
    }

}
