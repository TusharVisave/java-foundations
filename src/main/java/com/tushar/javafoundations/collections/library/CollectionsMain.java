package com.tushar.javafoundations.collections.library;

import com.tushar.javafoundations.oop.library.Book;
import com.tushar.javafoundations.oop.library.DVD;
import com.tushar.javafoundations.oop.library.LibraryItem;
import com.tushar.javafoundations.oop.library.Magazine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionsMain {

    public static void main(String[] args) {

        Library library = new Library();

        library.addItem(
                new Book("Java Basics", 101, "James Gosling")
        );

        library.addItem(
                new DVD("Inception", 102, 148)
        );

        library.addItem(
                new Magazine("Tech Monthly", 103, 25)
        );

        library.addItem(
                new Book("Clean Code", 104, "Robert C. Martin")
        );

        System.out.println("ALL LIBRARY ITEMS");
        System.out.println("------------------");

        for (LibraryItem item : library.getAllItems()) {
            System.out.println(item);
        }

        System.out.println();

        System.out.println("SEARCH BY ID");
        System.out.println("------------");

        LibraryItem item = library.findById(102);

        if (item != null) {
            System.out.println(item);
        }

        System.out.println();

        System.out.println("BOOKS ONLY");
        System.out.println("----------");

        List<LibraryItem> books =
                LibraryUtils.filterByType(
                        library.getAllItems(),
                        "Book"
                );

        for (LibraryItem book : books) {
            System.out.println(book);
        }

        System.out.println();

        System.out.println("SORTED BY TITLE");
        System.out.println("---------------");

        List<LibraryItem> sortedByTitle =
                LibraryUtils.sortByTitle(
                        library.getAllItems()
                );

        for (LibraryItem libraryItem : sortedByTitle) {
            System.out.println(libraryItem);
        }

        System.out.println();

        System.out.println("SORTED BY LOAN PERIOD");
        System.out.println("---------------------");

        List<LibraryItem> sortedByLoanPeriod =
                new ArrayList<>(library.getAllItems());

        sortedByLoanPeriod.sort(
                Comparator.comparingInt(
                        LibraryItem::getLoanPeriodDays
                )
        );

        for (LibraryItem libraryItem : sortedByLoanPeriod) {
            System.out.println(libraryItem);
        }

        System.out.println();

        System.out.println("GENERIC LIST");
        System.out.println("------------");

        List<String> languages =
                LibraryUtils.createList(
                        "Java",
                        "SQL",
                        "Spring Boot"
                );

        for (String language : languages) {
            System.out.println(language);
        }

        System.out.println();

        System.out.println("LIBRARY STATISTICS");
        System.out.println("------------------");
        System.out.println("Total items: " + library.size());
        System.out.println(
                "Contains ID 101: " + library.containsItem(101)
        );
    }
}