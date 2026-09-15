package com.tushar.javafoundations.oop.combined.notification;

public abstract class Notification {

    private final String recipient;
    private final String message;

    protected Notification(String recipient, String message) {
        if (recipient == null || recipient.isBlank()) {
            throw new IllegalArgumentException("Recipient cannot be empty");
        }

        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }

        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public abstract String send();
}