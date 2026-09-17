package com.tushar.javafoundations.oop.combined.notification;

public class NotificationService {

    private final Notification notification;

    public NotificationService(Notification notification) {
        if (notification == null) {
            throw new IllegalArgumentException("Notification cannot be null");
        }

        this.notification = notification;
    }

    public String sendNotification() {
        return notification.send();
    }
}