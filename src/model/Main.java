package model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Library library = new Library();
		int choice;

		do {
			System.out.println("\n===== LIBRARY MENU =====");
			System.out.println("1. Add Book");
			System.out.println("2. Add Member");
			System.out.println("3. Borrow Book");
			System.out.println("4. Return Book");
			System.out.println("5. List Books");
			System.out.println("6. List Members");
			System.out.println("0. Exit");
			System.out.print("Choice: ");
			choice = Integer.parseInt(scanner.nextLine());

			switch (choice) {
			case 1:
				System.out.print("Title: ");
				String title = scanner.nextLine();
				System.out.print("Author: ");
				String author = scanner.nextLine();
				System.out.print("ISBN: ");
				String isbn = scanner.nextLine();
				library.addBook(new Book(title, author, isbn));
				System.out.println("Book added.");
				break;

			case 2:
				System.out.print("Member ID: ");
				String memberId = scanner.nextLine();
				System.out.print("Name: ");
				String name = scanner.nextLine();
				library.addMember(new Member(memberId, name));
				System.out.println("Member added.");
				break;

			case 3:
				System.out.print("Member ID: ");
				String bId = scanner.nextLine();
				System.out.print("Book ISBN: ");
				String bIsbn = scanner.nextLine();
				Member bMember = findMember(library, bId);
				Book bBook = findBook(library, bIsbn);
				if (bMember != null && bBook != null) {
					library.borrowBook(bMember, bBook);
				} else {
					System.out.println("Member or Book not found.");
				}
				break;

			case 4:
				System.out.print("Member ID: ");
				String rId = scanner.nextLine();
				System.out.print("Book ISBN: ");
				String rIsbn = scanner.nextLine();
				Member rMember = findMember(library, rId);
				Book rBook = findBook(library, rIsbn);
				if (rMember != null && rBook != null) {
					library.returnBook(rMember, rBook);
				} else {
					System.out.println("Member or Book not found.");
				}
				break;

			case 5:
				System.out.println("---- Books ----");
				for (Book b : library.getBooks()) {
					System.out.println(b.getTitle() + " - Borrowed: " + b.isBorrowed());
				}
				break;

			case 6:
				System.out.println("---- Members ----");
				for (Member m : library.getMembers()) {
					System.out.println(m.getName() + " - Books: " + m.getBorrowedBooks().size());
				}
				break;

			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 0);

		scanner.close();
	}

	private static Member findMember(Library library, String id) {
		for (Member m : library.getMembers()) {
			if (m.getMemberId().equals(id)) {
				return m;
			}
		}
		return null;
	}

	private static Book findBook(Library library, String isbn) {
		for (Book b : library.getBooks()) {
			if (b.getIsbn().equals(isbn)) {
				return b;
			}
		}
		return null;
	}
}
