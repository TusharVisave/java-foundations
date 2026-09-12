package com.tushar.javafoundations.oop.library;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void libraryItemShouldExposeStateThroughGetters() {
        LibraryItem book = new Book("Java Basics", 101, "James Gosling");

        assertEquals("Java Basics", book.getTitle());
        assertEquals(101, book.getItemId());
    }

    @Test
    void bookShouldExposeAuthorThroughGetter() {
        Book book = new Book("Java Basics", 101, "James Gosling");

        assertEquals("James Gosling", book.getAuthor());
    }

    @Test
    void dvdShouldExposeDurationThroughGetter() {
        DVD dvd = new DVD("Inception", 102, 148);

        assertEquals(148, dvd.getDurationMinutes());
    }

    @Test
    void magazineShouldExposeIssueNumberThroughGetter() {
        Magazine magazine = new Magazine("Tech Monthly", 103, 25);

        assertEquals(25, magazine.getIssueNumber());
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
    void invalidBookAuthorShouldThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Book("Java Basics", 105, "")
        );
    }

    @Test
    void invalidDvdDurationShouldThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new DVD("Inception", 106, 0)
        );
    }

    @Test
    void invalidMagazineIssueNumberShouldThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Magazine("Tech Monthly", 107, 0)
        );
    }

    @Test
    void libraryItemsShouldDemonstratePolymorphism() {
        List<LibraryItem> items = List.of(
                new Book("Java Basics", 101, "James Gosling"),
                new DVD("Inception", 102, 148),
                new Magazine("Tech Monthly", 103, 25)
        );

        assertEquals("Book", items.get(0).getItemType());
        assertEquals(21, items.get(0).getLoanPeriodDays());

        assertEquals("DVD", items.get(1).getItemType());
        assertEquals(7, items.get(1).getLoanPeriodDays());

        assertEquals("Magazine", items.get(2).getItemType());
        assertEquals(14, items.get(2).getLoanPeriodDays());

        assertTrue(items.get(0) instanceof Book);
        assertTrue(items.get(1) instanceof DVD);
        assertTrue(items.get(2) instanceof Magazine);
    }

    @Test
    void toStringShouldReturnReadableLibraryItemDetails() {
        LibraryItem book = new Book("Java Basics", 101, "James Gosling");

        assertEquals(
                "Book | ID: 101 | Title: Java Basics | Loan Period: 21 days",
                book.toString()
        );
    }
}