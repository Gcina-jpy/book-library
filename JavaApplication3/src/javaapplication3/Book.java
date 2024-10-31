/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Gcina.Ngxowa
 */
public class Book {
      protected String title;
    protected String author;
    protected String ISBN;
    protected boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public void checkOut() throws Exception {
        if (!isAvailable) {
            throw new Exception("Book is already checked out.");
        }
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}
