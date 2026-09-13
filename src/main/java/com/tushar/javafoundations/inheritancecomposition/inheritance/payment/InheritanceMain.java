package com.tushar.javafoundations.inheritancecomposition.inheritance.payment;

public class InheritanceMain {

    public static void main(String[] args) {

        PaymentMethod cardPayment =
                new CardPayment("Tushar", "1234567890123456");

        PaymentMethod upiPayment =
                new UpiPayment("Tushar", "tushar@upi");

        System.out.println("INHERITANCE VERSION");
        System.out.println("-------------------");

        System.out.println(cardPayment.pay(1000));
        System.out.println(upiPayment.pay(500));
    }
}
