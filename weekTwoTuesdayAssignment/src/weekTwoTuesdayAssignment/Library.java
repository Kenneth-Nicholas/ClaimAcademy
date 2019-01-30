package weekTwoTuesdayAssignment;

public class Library {
	
	private int numberOfBooks;
	private Book[] books;
	private Customer[] customers;
	private Branch branch;
	private int customerArrayIndex;
	private int bookArrayIndex;
	
	
	public Library() {
		
		this.numberOfBooks = 0;
		this.books = null;
		this.branch = null;
		this.customers = null;
		this.customerArrayIndex = 0;
		this.bookArrayIndex = 0;
		
	}
	
	public Library(int numberOfBooks, Book[] books, Branch branch, Customer[] customers, int customerArrayIndex, int bookArrayIndex) {
		
		this.numberOfBooks = numberOfBooks;
		this.books = books;
		this.branch = branch;
		this.customers = customers;
		this.customerArrayIndex = customerArrayIndex;
		this.bookArrayIndex = bookArrayIndex;
		
	}

	public int getNumberOfBooks() {
		
		return this.numberOfBooks;
		
	}
	
	public void setNumberOfBooks(int numberOfBooks) {
		
		this.numberOfBooks = numberOfBooks;
		
	}
	
	public Book[] getBooks() {
		
		return this.books;
		
	}
	
	public void setBooks(Book[] books) {
		
		this.books = books;
		
	}
	
	public Branch getBranch() {
		
		return this.branch;
		
	}
	
	public void setBranch(Branch branch) {
		
		this.branch = branch;
		
	}
	
	public Customer[] getCustomer() {
		
		return this.customers;
		
	}
	
	public void setCustomer(Customer[] customers) {
		
		this.customers = customers;
		
	}
	
	public int getCustomerArrayIndex() {
		
		return this.customerArrayIndex;
		
	}
	
	public void setCustomerArrayIndex(int customerArrayIndex) {
		
		this.customerArrayIndex = customerArrayIndex;
		
	}
	
	public int getBookArrayIndex() {
		
		return this.bookArrayIndex;
		
	}
	
	public void setBookArrayIndex(int bookArrayIndex) {
		
		this.bookArrayIndex = bookArrayIndex;
		
	}
	
	public int countNumberOfCustomers(Customer[] customer) {
		
		int sizeOfCustomerArray = customer.length;
		
		return sizeOfCustomerArray;
		
	}
	
	public int countNumberOfBooks(Book[] books) {
		
		int sizeOfBookArray = books.length;

		return sizeOfBookArray;
		
	}
	
	public Customer[] addCustomer(Customer[] customer, int customerArrayIndex, String firstName, String lastName, Address address, long phoneNumber, String emailAddress) {
		
		customer[customerArrayIndex].setFirstName(firstName);
		customer[customerArrayIndex].setLastName(lastName);
		customer[customerArrayIndex].setAddress(address);
		customer[customerArrayIndex].setPhoneNumber(phoneNumber);
		customer[customerArrayIndex].setEmailAddress(emailAddress);
		
		customerArrayIndex++;
		
		return customer;
		
	}
	
	public Book[] addBook(Book[] books, int bookArrayIndex, String author, int isbn, String title, int numberOfPages) {
		
		books[bookArrayIndex].setAuthor(author);
		books[bookArrayIndex].setIsbn(isbn);
		books[bookArrayIndex].setTitle(title);
		books[bookArrayIndex].setNumberOfPages(numberOfPages);
		
		bookArrayIndex++;
		
		return books;
		
	}
	
}
