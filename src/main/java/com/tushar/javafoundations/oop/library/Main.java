package com.tushar.javafoundations.oop.library;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<LibraryItem> items = List.of(
                new Book("Java Basics", 101, "James Gosling"),
                new DVD("Inception", 102, 148),
                new Magazine("Tech Monthly", 103, 25)
        );

        System.out.println("Library Items");
        System.out.println("-------------");

        for (LibraryItem item : items) {
            displayItem(item);
        }
    }

    private static void displayItem(LibraryItem item) {
        System.out.println(
                item.getItemType()
                        + " | ID: " + item.getItemId()
                        + " | Title: " + item.getTitle()
                        + " | Loan Period: " + item.getLoanPeriodDays() + " days"
        );
    }
}