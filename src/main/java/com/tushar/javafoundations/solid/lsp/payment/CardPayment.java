package com.tushar.javafoundations.solid.lsp.payment;

public class CardPayment extends PaymentMethod
        implements Refundable {

    public CardPayment(String accountHolder) {
        super(accountHolder);
    }

    @Override
    public String pay(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Payment amount must be positive"
            );
        }

        return "Paid ₹" + amount + " using Card";
    }

    @Override
    public String refund(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Refund amount must be positive"
            );
        }

        return "Refunded ₹" + amount + " to Card";
    }
}