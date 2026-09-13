package com.tushar.javafoundations.inheritancecomposition.composition.payment;

public class CompositionMain {

    public static void main(String[] args) {

        PaymentMethod cardPayment =
                new CardPayment("Tushar", "1234567890123456");

        PaymentMethod upiPayment =
                new UpiPayment("Tushar", "tushar@upi");

        PaymentProcessor cardProcessor =
                new PaymentProcessor(cardPayment);

        PaymentProcessor upiProcessor =
                new PaymentProcessor(upiPayment);

        System.out.println("COMPOSITION VERSION");
        System.out.println("-------------------");

        System.out.println(cardProcessor.processPayment(1000));
        System.out.println(upiProcessor.processPayment(500));
    }
}
