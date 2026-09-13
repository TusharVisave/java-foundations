package com.tushar.javafoundations.inheritancecomposition.polymorphism.payment;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PaymentPolymorphismTest {

    @Test
    void shouldCallCorrectPaymentImplementationThroughCommonInterface() {

        List<PaymentMethod> paymentMethods = List.of(
                new CardPayment("1234567890123456"),
                new UpiPayment("tushar@upi")
        );

        assertEquals(
                "Paid ₹1000.0 using Card",
                paymentMethods.get(0).pay(1000)
        );

        assertEquals(
                "Paid ₹1000.0 using UPI",
                paymentMethods.get(1).pay(1000)
        );
    }

    @Test
    void shouldCallCorrectPaymentCategoryThroughRuntimePolymorphism() {

        List<PaymentMethod> paymentMethods = List.of(
                new CardPayment("1234567890123456"),
                new UpiPayment("tushar@upi")
        );

        assertEquals(
                "Card Payment",
                paymentMethods.get(0).getPaymentCategory()
        );

        assertEquals(
                "UPI Payment",
                paymentMethods.get(1).getPaymentCategory()
        );
    }

    @Test
    void cardPaymentShouldRejectInvalidAmount() {

        PaymentMethod payment =
                new CardPayment("1234567890123456");

        assertThrows(
                IllegalArgumentException.class,
                () -> payment.pay(-100)
        );
    }

    @Test
    void upiPaymentShouldRejectInvalidAmount() {

        PaymentMethod payment =
                new UpiPayment("tushar@upi");

        assertThrows(
                IllegalArgumentException.class,
                () -> payment.pay(0)
        );
    }

    @Test
    void interfaceDefaultMethodShouldBeAvailable() {

        PaymentMethod payment =
                new CardPayment("1234567890123456");

        assertEquals(
                "Card Payment",
                payment.getPaymentCategory()
        );
    }

    @Test
    void overloadedMethodsShouldSupportDifferentNumericTypes() {

        PolymorphismMain.PaymentCalculator calculator =
                new PolymorphismMain.PaymentCalculator();

        assertEquals(
                1200,
                calculator.calculateTotal(1000, 200)
        );

        assertEquals(
                1200.75,
                calculator.calculateTotal(1000.50, 200.25)
        );
    }
}