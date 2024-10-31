/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Gcina.Ngxowa
 */
public class PhysicalBook extends Book {
    private String location;

    public PhysicalBook(String title, String author, String ISBN, String location) {
        super(title, author, ISBN);
        this.location = location;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Location: " + location);
    }
}

