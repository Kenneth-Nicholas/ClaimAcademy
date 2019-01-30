package weekTwoTuesdayAssignment;

public class Staff {

	private String firstName;
	private String lastName;
	private String title;
	
	public Staff() {
		
		this.firstName = "";
		this.lastName = "";
		this.title = "";
		
	}
	
	public Staff(String firstName, String lastName, String title) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		
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
	
	public String getTitle() {
		
		return this.title;
		
	}
	
	public void setTitle(String title) {
		
		this.title = title;
		
	}
	
}
