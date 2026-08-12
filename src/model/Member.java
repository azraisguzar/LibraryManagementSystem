package model;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String memberId;
	private String name;
	private List<Book> borrowedBooks;
	
	public Member(String memberId, String name) {
		this.memberId = memberId;
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId() {
		this.memberId = memberId;
		
	}
	public String getName() {
		return name;
		
	}
	public void setName() {
		this.name = name;
	}
	
	public List<Book> getBorrowedBooks(){
		return borrowedBooks;
	}
	public void addBorrowedBook(Book book) {
		borrowedBooks.add(book);
	}
	public void removeBorrowedBook(Book book) {
		borrowedBooks.remove(book);
	}
	
	@Override
	
	public String toString() {
		
	     return "Member: " + name + " (ID: " + memberId + ", Borrowed Books: " + borrowedBooks.size() + ")";
	}
	
	

}
