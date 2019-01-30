package weekTwoTuesdayAssignment;

public class Customer {
	
	private String firstName;
	private String lastName;
	private Address address;
	private long phoneNumber;
	private String emailAddress;
	
	public Customer() {
		
		this.firstName = "";
		this.lastName = "";
		this.address = null;
		this.phoneNumber = 0l;
		this.emailAddress = "";
		
	}
	
	public Customer(String firstName, String lastName, Address address, long phoneNumber, String emailAddress) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		
	}
	
	public String getFirstName() {
		
		return this.firstName;
		
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
		
	}
	
	public String getLastName() {
		
		return this.lastName;
		
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
		
	}
	
	public Address getAddress() {
		
		return this.address;
		
	}
	
	public void setAddress(Address address) {
		
		this.address = address;
		
	}
	
	public long getPhoneNumber() {
		
		return this.phoneNumber;
		
	}
	
	public void setPhoneNumber(long phoneNumber) {
		
		this.phoneNumber = phoneNumber;
		
	}
	
	public String getEmailAddress() {
		
		return this.emailAddress;
		
	}
	
	public void setEmailAddress(String emailAddress) {
		
		this.emailAddress = emailAddress;
		
	}
	
}
