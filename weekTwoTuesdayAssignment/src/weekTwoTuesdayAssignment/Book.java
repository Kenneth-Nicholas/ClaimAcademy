package weekTwoTuesdayAssignment;

public class Book {

	private String author;
	private int isbn;
	private String title;
	private int numberOfPages;
	
	public Book() {
		
		this.author = "";
		this.isbn = 0;
		this.title = "";
		this.numberOfPages = 0;
		
	}
	
	public Book(String author, int isbn, String title, int numberOfPages) {
		
		this.author = author;
		this.isbn = isbn;
		this.title = title;
		this.numberOfPages = numberOfPages;
		
	}
	
	public String getAuthor() {
		
		return this.author;
		
	}
	
	public void setAuthor(String author) {
		
		this.author = author;
		
	}
	
	public int getIsbn() {
		
		return this.isbn;
		
	}
	
	public void setIsbn(int isbn) {
		
		this.isbn = isbn;
		
	}
	
	public String getTitle() {
		
		return this.title;
		
	}
	
	public void setTitle(String title) {
		
		this.title = title;
		
	}
	
	public int getNumberOfPages() {
		
		return this.numberOfPages;
		
	}
	
	public void setNumberOfPages(int numberOfPages) {
		
		this.numberOfPages = numberOfPages;
		
	}
	
}
