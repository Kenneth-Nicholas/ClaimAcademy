package weekThreeMondayLab;

public abstract class Person {
	
	protected String firstName;
	protected String lastName;
	
	public abstract double taxes(double amount);
	
	public abstract double calculateTelephoneBill(double amount);
	
	public abstract double calculateAllOtherBills(double amount);
	
	public abstract String toString();
	
}
