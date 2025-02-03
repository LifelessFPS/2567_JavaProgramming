
public class Book {
	private String title;
	private Author author; //composition
	private int pages;
	
	public Book(String title,Author author,int pages) {
		this.title =title;
		this.author = author;
		this.pages = pages;
	}
	
	public Book(String title,Author author) {
		this.title =title;
		this.author = author;
		this.pages = 0;
	}
	
	public Book() {
		this.title =null;
		this.author = null;
		this.pages = 0;
	}
	
	String getTitle() {
		return this.title;
	}
	Author getAuthor() {
		return this.author;
	}
	public void setPages(int pages) {
	    this.pages = pages;
	}
	int getPages() {
		return this.pages;
	}
	
	public String toString() {
		return getTitle()+" has "+getPages()+" pages write by " + author;
	}

}
