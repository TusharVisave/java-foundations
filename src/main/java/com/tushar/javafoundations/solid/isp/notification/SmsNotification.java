package com.tushar.javafoundations.solid.isp.notification;

public class SmsNotification implements NotificationSender {

    private final String phoneNumber;
    private final String message;

    public SmsNotification(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    @Override
    public String send() {
        return "SMS sent to "
                + phoneNumber
                + ": "
                + message;
    }
}