package com.tushar.javafoundations.oop.library;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<LibraryItem> items = List.of(
                new Book("Java Basics", 101, "James Gosling"),
                new DVD("Inception", 102, 148),
                new Magazine("Tech Monthly", 103, 25)
        );

        for (LibraryItem item : items) {
            System.out.println(
                    item.getItemType()
                            + " | Title: " + item.getTitle()
                            + " | Loan Period: " + item.getLoanPeriodDays() + " days"
            );
        }
    }
}