package com.tushar.javafoundations.inheritancecomposition.inheritance.payment;

public class WalletPayment extends PaymentMethod {

    public WalletPayment(String accountHolder) {
        super(accountHolder);
    }

    @Override
    public String pay(double amount) {
        PaymentValidator.validateAmount(amount);

        return "Paid ₹" + amount + " using Wallet";
    }
}