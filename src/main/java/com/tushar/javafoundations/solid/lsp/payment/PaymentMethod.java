package com.tushar.javafoundations.solid.lsp.payment;

public abstract class PaymentMethod {

    private final String accountHolder;

    protected PaymentMethod(String accountHolder) {
        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException(
                    "Account holder cannot be empty"
            );
        }

        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public abstract String pay(double amount);
}