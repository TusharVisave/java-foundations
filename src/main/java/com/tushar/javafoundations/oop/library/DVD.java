package com.tushar.javafoundations.oop.library;

public class DVD extends LibraryItem {

    private final int durationMinutes;

    public DVD(String title, int itemId, int durationMinutes) {
        super(title, itemId);

        if (durationMinutes <= 0) {
            throw new IllegalArgumentException("Duration must be positive");
        }

        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public int getLoanPeriodDays() {
        return 7;
    }
}