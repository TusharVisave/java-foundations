package com.tushar.javafoundations.oop.library;


public class Magazine extends LibraryItem {

    private final int issueNumber;

    public Magazine(String title, int itemId, int issueNumber) {
        super(title, itemId);

        if (issueNumber <= 0) {
            throw new IllegalArgumentException("Issue number must be positive");
        }

        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }

    @Override
    public int getLoanPeriodDays() {
        return 14;
    }
}