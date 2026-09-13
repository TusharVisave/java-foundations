package com.tushar.javafoundations.inheritancecomposition.inheritance.payment;

public class UpiPayment extends PaymentMethod {

    private final String upiId;

    public UpiPayment(String accountHolder, String upiId) {
        super(accountHolder);

        if (upiId == null || upiId.isBlank()) {
            throw new IllegalArgumentException("UPI ID cannot be empty");
        }

        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    @Override
    public String pay(double amount) {
        validateAmount(amount);

        return "Paid ₹" + amount + " using UPI";
    }

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be positive");
        }
    }
}