package com.tushar.javafoundations.solid.lsp.payment;

public class RefundablePayment extends PaymentMethod {

    public RefundablePayment(String accountHolder) {
        super(accountHolder);
    }

    @Override
    public String pay(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Payment amount must be positive"
            );
        }

        return "Paid ₹" + amount + " using Refundable Payment";
    }
}