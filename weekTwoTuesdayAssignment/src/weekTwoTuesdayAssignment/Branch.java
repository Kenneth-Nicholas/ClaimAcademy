package weekTwoTuesdayAssignment;

public class Branch {

	private String name;
	private Staff[] staff;
	private int arrayIndex;
	
	public Branch() {
		
		this.name = "";
		this.staff = null;
		this.arrayIndex = 0;
		
	}
	
	public Branch(String name, Staff[] staff, int arrayIndex) {
		
		this.name = name;
		this.staff = staff;
		this.arrayIndex = arrayIndex;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public Staff[] getStaff() {
		
		return this.staff;
		
	}
	
	public void setStaff(Staff[] staff) {
		
		this.staff = staff;
		
	}
	
	public int getArrayIndex() {
		
		return this.arrayIndex;
		
	}
	
	public void setArrayIndex(int arrayIndex) {
		
		this.arrayIndex = arrayIndex;
		
	}
	
	public Staff[] addStaffMember(Staff[] staff, int arrayIndex, String firstName, String lastName, String title) {
		
		staff[arrayIndex].setFirstName(firstName);
		staff[arrayIndex].setLastName(lastName);
		staff[arrayIndex].setTitle(title);
		
		arrayIndex++;
		
		return staff;
		
	}
	
}
