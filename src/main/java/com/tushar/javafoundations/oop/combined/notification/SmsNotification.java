package com.tushar.javafoundations.oop.combined.notification;

public class SmsNotification extends Notification {

    public SmsNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public String send() {
        return "SMS sent to "
                + getRecipient()
                + " with message: "
                + getMessage();
    }
}