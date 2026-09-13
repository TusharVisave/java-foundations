package com.tushar.javafoundations.inheritancecomposition.inheritance.payment;

public class CardPayment extends PaymentMethod {

    private final String cardNumber;

    public CardPayment(String accountHolder, String cardNumber) {
        super(accountHolder);

        if (cardNumber == null || cardNumber.isBlank()) {
            throw new IllegalArgumentException("Card number cannot be empty");
        }

        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String pay(double amount) {
        validateAmount(amount);

        return "Paid ₹" + amount + " using Card";
    }

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be positive");
        }
    }
}