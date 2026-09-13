package com.tushar.javafoundations.inheritancecomposition.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PaymentComparisonTest {

    @Test
    void inheritanceAndCompositionShouldProduceEquivalentCardPaymentBehavior() {

        com.tushar.javafoundations.inheritancecomposition.inheritance.payment.PaymentMethod inheritancePayment =
                new com.tushar.javafoundations.inheritancecomposition.inheritance.payment.CardPayment(
                        "Tushar",
                        "1234567890123456"
                );

        com.tushar.javafoundations.inheritancecomposition.composition.payment.PaymentMethod compositionPayment =
                new com.tushar.javafoundations.inheritancecomposition.composition.payment.CardPayment(
                        "Tushar",
                        "1234567890123456"
                );

        String inheritanceResult =
                inheritancePayment.pay(1000);

        com.tushar.javafoundations.inheritancecomposition.composition.payment.PaymentProcessor processor =
                new com.tushar.javafoundations.inheritancecomposition.composition.payment.PaymentProcessor(
                        compositionPayment
                );

        String compositionResult =
                processor.processPayment(1000);

        assertEquals(inheritanceResult, compositionResult);
    }

    @Test
    void inheritanceAndCompositionShouldProduceEquivalentUpiPaymentBehavior() {

        com.tushar.javafoundations.inheritancecomposition.inheritance.payment.PaymentMethod inheritancePayment =
                new com.tushar.javafoundations.inheritancecomposition.inheritance.payment.UpiPayment(
                        "Tushar",
                        "tushar@upi"
                );

        com.tushar.javafoundations.inheritancecomposition.composition.payment.PaymentMethod compositionPayment =
                new com.tushar.javafoundations.inheritancecomposition.composition.payment.UpiPayment(
                        "Tushar",
                        "tushar@upi"
                );

        String inheritanceResult =
                inheritancePayment.pay(500);

        com.tushar.javafoundations.inheritancecomposition.composition.payment.PaymentProcessor processor =
                new com.tushar.javafoundations.inheritancecomposition.composition.payment.PaymentProcessor(
                        compositionPayment
                );

        String compositionResult =
                processor.processPayment(500);

        assertEquals(inheritanceResult, compositionResult);
    }

    @Test
    void inheritancePaymentShouldRejectInvalidAmount() {

        com.tushar.javafoundations.inheritancecomposition.inheritance.payment.PaymentMethod payment =
                new com.tushar.javafoundations.inheritancecomposition.inheritance.payment.CardPayment(
                        "Tushar",
                        "1234567890123456"
                );

        assertThrows(
                IllegalArgumentException.class,
                () -> payment.pay(-100)
        );
    }

    @Test
    void compositionPaymentShouldRejectInvalidAmount() {

        com.tushar.javafoundations.inheritancecomposition.composition.payment.PaymentMethod payment =
                new com.tushar.javafoundations.inheritancecomposition.composition.payment.CardPayment(
                        "Tushar",
                        "1234567890123456"
                );

        com.tushar.javafoundations.inheritancecomposition.composition.payment.PaymentProcessor processor =
                new com.tushar.javafoundations.inheritancecomposition.composition.payment.PaymentProcessor(
                        payment
                );

        assertThrows(
                IllegalArgumentException.class,
                () -> processor.processPayment(-100)
        );
    }

    @Test
    void compositionShouldAllowDifferentPaymentMethods() {

        com.tushar.javafoundations.inheritancecomposition.composition.payment.PaymentProcessor processor =
                new com.tushar.javafoundations.inheritancecomposition.composition.payment.PaymentProcessor(
                        new com.tushar.javafoundations.inheritancecomposition.composition.payment.UpiPayment(
                                "Tushar",
                                "tushar@upi"
                        )
                );

        assertEquals(
                "Paid ₹500.0 using UPI",
                processor.processPayment(500)
        );
    }
}