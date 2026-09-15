package com.tushar.javafoundations.oop.combined.notification;

public class EmailNotification extends Notification {

    private final String subject;

    public EmailNotification(
            String recipient,
            String subject,
            String message
    ) {
        super(recipient, message);

        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("Subject cannot be empty");
        }

        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String send() {
        return "Email sent to " + getRecipient()
                + " with subject: " + subject
                + " and message: " + getMessage();
    }
}