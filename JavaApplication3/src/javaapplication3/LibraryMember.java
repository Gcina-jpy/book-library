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

public class LibraryMember {
    String memberId;
    String name;
    private ArrayList<Book> borrowedBooks;

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        try {
            book.checkOut();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.title);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned " + book.title);
        } else {
            System.out.println("This book was not borrowed by " + name);
        }
    }
}