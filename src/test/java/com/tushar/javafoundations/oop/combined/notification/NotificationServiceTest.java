package com.tushar.javafoundations.oop.combined.notification;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NotificationServiceTest {

    private final NotificationService notificationService =
            new NotificationService();

    @Test
    void shouldSendEmailNotificationThroughBaseType() {

        Notification notification =
                new EmailNotification(
                        "tushar@example.com",
                        "Welcome",
                        "Welcome to the platform"
                );

        String result =
                notificationService.sendNotification(notification);

        assertEquals(
                "Email sent to tushar@example.com with subject: Welcome and message: Welcome to the platform",
                result
        );
    }

    @Test
    void shouldSendSmsNotificationThroughBaseType() {

        Notification notification =
                new SmsNotification(
                        "9876543210",
                        "Your OTP is 1234"
                );

        String result =
                notificationService.sendNotification(notification);

        assertEquals(
                "SMS sent to 9876543210 with message: Your OTP is 1234",
                result
        );
    }

    @Test
    void shouldRejectEmptyRecipient() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new SmsNotification(
                        "",
                        "Hello"
                )
        );
    }

    @Test
    void shouldRejectEmptyMessage() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new SmsNotification(
                        "9876543210",
                        ""
                )
        );
    }

    @Test
    void shouldRejectEmptyEmailSubject() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new EmailNotification(
                        "tushar@example.com",
                        "",
                        "Hello"
                )
        );
    }

    @Test
    void shouldRejectNullNotification() {

        assertThrows(
                IllegalArgumentException.class,
                () -> notificationService.sendNotification(null)
        );
    }
}