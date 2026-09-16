package com.tushar.javafoundations.solid.lsp.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LspViolationTest {

    @Test
    void refundablePaymentShouldBeUsedThroughRefundableContract() {

        Refundable refundable =
                new CardPayment("Tushar");

        assertEquals(
                "Refunded ₹500.0 to Card",
                refundable.refund(500)
        );
    }

    @Test
    void paymentMethodShouldSupportNormalPayment() {

        PaymentMethod payment =
                new RefundablePayment("Tushar");

        assertEquals(
                "Paid ₹500.0 using Refundable Payment",
                payment.pay(500)
        );
    }
}