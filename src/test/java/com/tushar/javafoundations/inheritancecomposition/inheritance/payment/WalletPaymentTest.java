package com.tushar.javafoundations.inheritancecomposition.inheritance.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WalletPaymentTest {

    @Test
    void shouldProcessWalletPayment() {

        PaymentMethod payment =
                new WalletPayment("Tushar");

        String result = payment.pay(500);

        assertEquals(
                "Paid ₹500.0 using Wallet",
                result
        );
    }

    @Test
    void shouldRejectInvalidPaymentAmount() {

        PaymentMethod payment =
                new WalletPayment("Tushar");

        assertThrows(
                IllegalArgumentException.class,
                () -> payment.pay(0)
        );
    }

    @Test
    void shouldRejectNegativePaymentAmount() {

        PaymentMethod payment =
                new WalletPayment("Tushar");

        assertThrows(
                IllegalArgumentException.class,
                () -> payment.pay(-100)
        );
    }

    @Test
    void shouldPreserveAccountHolder() {

        PaymentMethod payment =
                new WalletPayment("Tushar");

        assertEquals(
                "Tushar",
                payment.getAccountHolder()
        );
    }
}