package model;

public class Book {
		
	private String title;
	private String author;
	private String isbn;
	private boolean borrowed;
	
	public Book(String title, String author,String isbn) {
		this.title = title;
        this.author = author;
        this.isbn = isbn;
	}
	  public String getTitle() {
	        return title;
	  }
	  
	  public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public void setIsbn(String isbn) {
	        this.isbn = isbn;
	    }
	    public boolean isBorrowed() {
	    	return borrowed;
	    }
	    public void setBorrowed(boolean borrowed) {
	    	this.borrowed =borrowed;
	    }
	    
	    @Override
	    public String toString() {
	        return "Book{" +
	                "title='" + title + '\'' +
	                ", author='" + author + '\'' +
	                ", isbn='" + isbn + '\'' +
	                '}';
	    }

}
