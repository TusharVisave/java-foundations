package com.tushar.javafoundations.inheritancecomposition.inheritance.payment;

public final class PaymentValidator {

    private PaymentValidator() {
        // Utility class
    }

    public static void validateAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException("Account holder cannot be empty");
        }
    }

    public static void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be positive");
        }
    }
}