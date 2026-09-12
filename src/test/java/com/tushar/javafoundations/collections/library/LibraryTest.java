package com.tushar.javafoundations.collections.library;

import com.tushar.javafoundations.oop.library.Book;
import com.tushar.javafoundations.oop.library.DVD;
import com.tushar.javafoundations.oop.library.LibraryItem;
import com.tushar.javafoundations.oop.library.Magazine;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryTest {

    @Test
    void shouldAddAndFindLibraryItem() {

        Library library = new Library();

        Book book = new Book(
                "Java Basics",
                101,
                "James Gosling"
        );

        library.addItem(book);

        assertEquals(book, library.findById(101));
        assertEquals(1, library.size());
    }

    @Test
    void shouldRejectDuplicateItemId() {

        Library library = new Library();

        library.addItem(
                new Book("Java Basics", 101, "James Gosling")
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> library.addItem(
                        new DVD("Inception", 101, 148)
                )
        );
    }

    @Test
    void shouldRemoveItem() {

        Library library = new Library();

        library.addItem(
                new Book("Java Basics", 101, "James Gosling")
        );

        assertTrue(library.removeItem(101));
        assertEquals(0, library.size());
        assertNull(library.findById(101));
        assertFalse(library.containsItem(101));
    }

    @Test
    void shouldReturnFalseWhenRemovingMissingItem() {

        Library library = new Library();

        assertFalse(library.removeItem(999));
    }

    @Test
    void shouldReturnUnmodifiableItemList() {

        Library library = new Library();

        library.addItem(
                new Book("Java Basics", 101, "James Gosling")
        );

        List<LibraryItem> items = library.getAllItems();

        assertThrows(
                UnsupportedOperationException.class,
                () -> items.clear()
        );
    }

    @Test
    void shouldFilterItemsByType() {

        Library library = new Library();

        library.addItem(
                new Book("Java Basics", 101, "James Gosling")
        );

        library.addItem(
                new DVD("Inception", 102, 148)
        );

        library.addItem(
                new Book("Clean Code", 103, "Robert C. Martin")
        );

        List<LibraryItem> books =
                LibraryUtils.filterByType(
                        library.getAllItems(),
                        "Book"
                );

        assertEquals(2, books.size());
        assertEquals("Book", books.get(0).getItemType());
        assertEquals("Book", books.get(1).getItemType());
    }

    @Test
    void shouldSortItemsByTitle() {

        Library library = new Library();

        library.addItem(
                new Book("Spring Boot", 101, "Author")
        );

        library.addItem(
                new Book("Java Basics", 102, "Author")
        );

        library.addItem(
                new Book("Clean Code", 103, "Author")
        );

        List<LibraryItem> sorted =
                LibraryUtils.sortByTitle(
                        library.getAllItems()
                );

        assertEquals("Clean Code", sorted.get(0).getTitle());
        assertEquals("Java Basics", sorted.get(1).getTitle());
        assertEquals("Spring Boot", sorted.get(2).getTitle());
    }

    @Test
    void shouldSortItemsById() {

        Library library = new Library();

        library.addItem(
                new Book("Book C", 103, "Author")
        );

        library.addItem(
                new Book("Book A", 101, "Author")
        );

        library.addItem(
                new Book("Book B", 102, "Author")
        );

        List<LibraryItem> sorted =
                LibraryUtils.sortById(
                        library.getAllItems()
                );

        assertEquals(101, sorted.get(0).getItemId());
        assertEquals(102, sorted.get(1).getItemId());
        assertEquals(103, sorted.get(2).getItemId());
    }

    @Test
    void bookShouldHaveNaturalOrderingByTitle() {

        Book first = new Book(
                "Java Basics",
                101,
                "James Gosling"
        );

        Book second = new Book(
                "Spring Boot",
                102,
                "Author"
        );

        assertTrue(first.compareTo(second) < 0);
    }

    @Test
    void genericMethodShouldCreateTypedList() {

        List<String> values =
                LibraryUtils.createList(
                        "Java",
                        "SQL",
                        "Spring"
                );

        assertEquals(
                List.of("Java", "SQL", "Spring"),
                values
        );
    }
}