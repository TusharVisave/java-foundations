package com.tushar.javafoundations.solid.isp.notification;

public class EmailNotification
        implements NotificationSender,
        NotificationScheduler,
        RetryPolicy {

    private final String recipient;
    private final String message;

    public EmailNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    @Override
    public String send() {
        return "Email sent to " + recipient
                + ": " + message;
    }

    @Override
    public String schedule() {
        return "Email scheduled for " + recipient;
    }

    @Override
    public String retryPolicy() {
        return "Email retry policy: 3 attempts";
    }
}