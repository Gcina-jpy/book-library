/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Gcina.Ngxowa
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;
    private HashMap<String, LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void registerMember(LibraryMember member) {
        members.put(member.memberId, member);
        System.out.println("Member registered: " + member.name);
    }

    public void borrowBook(String memberId, String bookTitle) {
        LibraryMember member = members.get(memberId);
        Book book = findBookByTitle(bookTitle);

        if (member != null && book != null) {
            member.borrowBook(book);
        } else {
            System.out.println("Member or Book not found.");
        }
    }

    public void returnBook(String memberId, String bookTitle) {
        LibraryMember member = members.get(memberId);
        Book book = findBookByTitle(bookTitle);

        if (member != null && book != null) {
            member.returnBook(book);
        } else {
            System.out.println("Member or Book not found.");
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding sample books and members
        library.addBook(new PhysicalBook("Java Programming", "John Doe", "123", "A1"));
        library.addBook(new EBook("Learn Python", "Jane Doe", "456", "www.downloadpython.com", 1.5));
        library.registerMember(new LibraryMember("M001", "Alice"));
        library.registerMember(new LibraryMember("M002", "Bob"));

        // Console interaction example
        System.out.println("Welcome to the Library Management System");
        System.out.println("Enter 1 to borrow a book, 2 to return a book, 3 to exit.");

        while (true) {
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Member ID: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();
                    library.borrowBook(memberId, bookTitle);
                    break;
                case 2:
                    System.out.print("Enter Member ID: ");
                    memberId = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    bookTitle = scanner.nextLine();
                    library.returnBook(memberId, bookTitle);
                    break;
                case 3:
                    System.out.println("Exiting system. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}