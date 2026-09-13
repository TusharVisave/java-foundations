package com.tushar.javafoundations.inheritancecomposition.polymorphism.payment;

public interface PaymentMethod {

    String pay(double amount);

    default String getPaymentCategory() {
        return "Digital Payment";
    }
}