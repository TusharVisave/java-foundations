package com.tushar.javafoundations.inheritancecomposition.composition.payment;

public class CardPayment implements PaymentMethod {

    private final String accountHolder;
    private final String cardNumber;

    public CardPayment(String accountHolder, String cardNumber) {

        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException("Account holder cannot be empty");
        }

        if (cardNumber == null || cardNumber.isBlank()) {
            throw new IllegalArgumentException("Card number cannot be empty");
        }

        this.accountHolder = accountHolder;
        this.cardNumber = cardNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String pay(double amount) {
        return "Paid ₹" + amount + " using Card";
    }
}
