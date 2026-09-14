package com.tushar.javafoundations.inheritancecomposition.inheritance.payment;

public abstract class PaymentMethod {

    private final String accountHolder;

    protected PaymentMethod(String accountHolder) {
        PaymentValidator.validateAccountHolder(accountHolder);
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public abstract String pay(double amount);
}