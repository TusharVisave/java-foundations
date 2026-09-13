package com.tushar.javafoundations.inheritancecomposition.composition.payment;

public class UpiPayment implements PaymentMethod {

    private final String accountHolder;
    private final String upiId;

    public UpiPayment(String accountHolder, String upiId) {

        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException("Account holder cannot be empty");
        }

        if (upiId == null || upiId.isBlank()) {
            throw new IllegalArgumentException("UPI ID cannot be empty");
        }

        this.accountHolder = accountHolder;
        this.upiId = upiId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getUpiId() {
        return upiId;
    }

    @Override
    public String pay(double amount) {
        return "Paid ₹" + amount + " using UPI";
    }
}