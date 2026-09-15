package com.tushar.javafoundations.oop.combined.notification;

public class NotificationService {

    public String sendNotification(Notification notification) {
        if (notification == null) {
            throw new IllegalArgumentException("Notification cannot be null");
        }

        return notification.send();
    }
}