package com.tushar.javafoundations.inheritancecomposition.polymorphism.payment;

public class CardPayment implements PaymentMethod {

    private final String cardNumber;

    public CardPayment(String cardNumber) {

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

    @Override
    public String getPaymentCategory() {
        return "Card Payment";
    }

    private void validateAmount(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Payment amount must be positive"
            );
        }
    }
}
