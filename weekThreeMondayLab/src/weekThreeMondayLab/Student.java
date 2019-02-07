package weekThreeMondayLab;

public class Student extends Person implements Bills {

	@Override
	public double taxes(double amount) {
		
		return amount * 0.02d;
		
	}

	@Override
	public double calculateTelephoneBill(double amount) {
		
		return this.taxes(amount) + amount;
		
	}

	@Override
	public double calculateAllOtherBills(double amount) {
		
		return this.taxes(amount) + amount;
		
	}

	@Override
	public String toString() {
		
		return this.firstName + " " + this.lastName;
		
	}

	@Override
	public double gasBill(double amount) {
		
		return this.taxes(amount) + amount;
		
	}

	@Override
	public double carInsurance(double amount) {
		
		return this.taxes(amount) + amount;
		
	}

}
