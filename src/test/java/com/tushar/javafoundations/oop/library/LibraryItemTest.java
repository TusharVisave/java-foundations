package com.tushar.javafoundations.oop.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LibraryItemTest {

    @Test
    void bookShouldReturnCorrectTypeAndLoanPeriod() {
        LibraryItem book = new Book("Java Basics", 101, "James Gosling");

        assertEquals("Book", book.getItemType());
        assertEquals(21, book.getLoanPeriodDays());
    }

    @Test
    void dvdShouldReturnCorrectTypeAndLoanPeriod() {
        LibraryItem dvd = new DVD("Inception", 102, 148);

        assertEquals("DVD", dvd.getItemType());
        assertEquals(7, dvd.getLoanPeriodDays());
    }

    @Test
    void magazineShouldReturnCorrectTypeAndLoanPeriod() {
        LibraryItem magazine = new Magazine("Tech Monthly", 103, 25);

        assertEquals("Magazine", magazine.getItemType());
        assertEquals(14, magazine.getLoanPeriodDays());
    }

    @Test
    void invalidBookTitleShouldThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Book("", 104, "Author")
        );
    }

    @Test
    void invalidItemIdShouldThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new DVD("Inception", 0, 148)
        );
    }

    @Test
    void libraryItemShouldExposeStateThroughGetters() {
        LibraryItem book = new Book("Java Basics", 101, "James Gosling");

        assertEquals("Java Basics", book.getTitle());
        assertEquals(101, book.getItemId());
    }
}