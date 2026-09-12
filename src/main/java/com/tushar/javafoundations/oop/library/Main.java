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
            System.out.println(item);
        }
    }
}