package com.tushar.javafoundations.oop.library;

public abstract class LibraryItem {

    private final String title;
    private final int itemId;

    protected LibraryItem(String title, int itemId) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }

        if (itemId <= 0) {
            throw new IllegalArgumentException("Item ID must be positive");
        }

        this.title = title;
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public int getItemId() {
        return itemId;
    }

    public abstract String getItemType();

    public abstract int getLoanPeriodDays();

    @Override
    public String toString() {
        return getItemType()
                + " | ID: " + itemId
                + " | Title: " + title
                + " | Loan Period: " + getLoanPeriodDays() + " days";
    }
}