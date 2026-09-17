package com.tushar.javafoundations.oop.combined.notification;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NotificationServiceTest {

    @Test
    void shouldSendEmailNotificationThroughBaseType() {

        Notification notification =
                new EmailNotification(
                        "tushar@example.com",
                        "Welcome",
                        "Welcome to the platform"
                );

        NotificationService notificationService =
                new NotificationService(notification);

        String result =
                notificationService.sendNotification();

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

        NotificationService notificationService =
                new NotificationService(notification);

        String result =
                notificationService.sendNotification();

        assertEquals(
                "SMS sent to 9876543210 with message: Your OTP is 1234",
                result
        );
    }

    @Test
    void shouldRejectNullNotificationDependency() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new NotificationService(null)
        );
    }

    @Test
    void shouldWorkWithFakeNotificationWithoutRealImplementation() {

        Notification fakeNotification =
                new Notification("fake-recipient", "fake-message") {

                    @Override
                    public String send() {
                        return "Fake notification sent";
                    }
                };

        NotificationService notificationService =
                new NotificationService(fakeNotification);

        String result =
                notificationService.sendNotification();

        assertEquals(
                "Fake notification sent",
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
}