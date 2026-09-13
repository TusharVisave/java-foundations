package com.tushar.javafoundations.inheritancecomposition.composition.payment;

public class PaymentProcessor {

    private final PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            throw new IllegalArgumentException("Payment method cannot be null");
        }

        this.paymentMethod = paymentMethod;
    }

    public String processPayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be positive");
        }

        return paymentMethod.pay(amount);
    }
}
