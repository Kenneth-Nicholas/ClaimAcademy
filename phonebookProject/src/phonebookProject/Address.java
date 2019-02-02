package phonebookProject;

public class Address {
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	public Address() {
	}
	
	public Address(String streetAddress, String city, String state, String zipCode, String country) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.country = country;
	}
	
	public String getStreetAddress() {
		return this.streetAddress;
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipCode() {
		return this.zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return streetAddress + ", " + city + ", " + state + ", " + zipCode + ", " + country;
	}
}
