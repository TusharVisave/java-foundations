package com.tushar.javafoundations.inheritancecomposition.payment;

import com.tushar.javafoundations.inheritancecomposition.inheritance.payment.PaymentValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PaymentValidatorTest {

    @Test
    void shouldAcceptValidAccountHolder() {
        assertDoesNotThrow(
                () -> PaymentValidator.validateAccountHolder("Tushar")
        );
    }

    @Test
    void shouldRejectEmptyAccountHolder() {
        assertThrows(
                IllegalArgumentException.class,
                () -> PaymentValidator.validateAccountHolder("")
        );
    }

    @Test
    void shouldRejectBlankAccountHolder() {
        assertThrows(
                IllegalArgumentException.class,
                () -> PaymentValidator.validateAccountHolder("   ")
        );
    }

    @Test
    void shouldAcceptPositivePaymentAmount() {
        assertDoesNotThrow(
                () -> PaymentValidator.validateAmount(500)
        );
    }

    @Test
    void shouldRejectZeroPaymentAmount() {
        assertThrows(
                IllegalArgumentException.class,
                () -> PaymentValidator.validateAmount(0)
        );
    }

    @Test
    void shouldRejectNegativePaymentAmount() {
        assertThrows(
                IllegalArgumentException.class,
                () -> PaymentValidator.validateAmount(-100)
        );
    }
}