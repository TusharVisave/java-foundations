package com.tushar.javafoundations.solid.isp.notification;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IspViolationTest {

    @Test
    void smsNotificationShouldOnlyDependOnSender() {

        NotificationSender notification =
                new SmsNotification("9876543210", "Hello");

        assertEquals(
                "SMS sent to 9876543210: Hello",
                notification.send()
        );
    }

    @Test
    void emailNotificationCanUseSeparateCapabilities() {

        EmailNotification notification =
                new EmailNotification("tushar@example.com", "Hello");

        assertEquals(
                "Email sent to tushar@example.com: Hello",
                notification.send()
        );

        assertEquals(
                "Email scheduled for tushar@example.com",
                notification.schedule()
        );

        assertEquals(
                "Email retry policy: 3 attempts",
                notification.retryPolicy()
        );
    }
}