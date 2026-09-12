package com.tushar.javafoundations.oop.library;

public class Book extends LibraryItem implements Comparable<Book> {

    private final String author;

    public Book(String title, int itemId, String author) {
        super(title, itemId);

        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be empty");
        }

        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public int getLoanPeriodDays() {
        return 21;
    }

    @Override
    public int compareTo(Book other) {
        return this.getTitle().compareToIgnoreCase(other.getTitle());
    }
}