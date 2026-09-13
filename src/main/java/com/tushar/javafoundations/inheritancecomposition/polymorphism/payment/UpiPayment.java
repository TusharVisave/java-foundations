package com.tushar.javafoundations.inheritancecomposition.polymorphism.payment;

public class UpiPayment implements PaymentMethod {

    private final String upiId;

    public UpiPayment(String upiId) {

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

    @Override
    public String getPaymentCategory() {
        return "UPI Payment";
    }

    private void validateAmount(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Payment amount must be positive"
            );
        }
    }
}