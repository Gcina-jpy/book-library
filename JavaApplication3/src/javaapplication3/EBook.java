/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Gcina.Ngxowa
 */

public class EBook extends Book {
    private String downloadLink;
    private double fileSize;

    public EBook(String title, String author, String ISBN, String downloadLink, double fileSize) {
        super(title, author, ISBN);
        this.downloadLink = downloadLink;
        this.fileSize = fileSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Download Link: " + downloadLink + ", File Size: " + fileSize + " MB");
    }
}