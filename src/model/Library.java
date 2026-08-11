package model;
import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	private List<Member> members;
	
	public Library() {
		this.books = new ArrayList<>();
		this.members = new ArrayList<>();
	}
	public void addBook(Book book) {
		books.add(book);
	}
	public void addMember(Member member) {
		members.add(member);
	}
	public List<Book> getBooks(){
		return books;
	}
	public List<Member> getMembers(){
		return members;
	}
	
	public boolean borrowBook(Member member , Book book ) {
		if(book.isBorrowed()) {
			System.out.println(book.getTitle() + "is already borrowed");
			return false;
		}
		book.setBorrowed(true);
		member.addBorrowedBook(book);
		System.out.println(member.getName() + "has not borrowed this book");
		return false;
	}
	
	public boolean returnBook(Member member, Book book) {
		if(!member.getBorrowedBooks().contains(book)) {
			System.out.println(member.getName() + " has not borrowed this book.");
			return false;
		}
		book.setBorrowed(false);
		member.removeBorrowedBook(book);
		System.out.println(member.getName() + "returned" + book.getTitle() + ".");
		return true;
	}


}
