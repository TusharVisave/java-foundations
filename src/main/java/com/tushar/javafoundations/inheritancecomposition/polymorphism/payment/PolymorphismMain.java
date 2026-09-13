package com.tushar.javafoundations.inheritancecomposition.polymorphism.payment;

import java.util.List;

public class PolymorphismMain {

    public static void main(String[] args) {

        System.out.println("POLYMORPHISM DEMONSTRATION");
        System.out.println("--------------------------");

        demonstrateRuntimePolymorphism();

        System.out.println();

        demonstrateCompileTimePolymorphism();
    }

    private static void demonstrateRuntimePolymorphism() {

        List<PaymentMethod> paymentMethods = List.of(
                new CardPayment("1234567890123456"),
                new UpiPayment("tushar@upi")
        );

        System.out.println("RUNTIME POLYMORPHISM");
        System.out.println("--------------------");

        for (PaymentMethod paymentMethod : paymentMethods) {

            System.out.println(
                    paymentMethod.getPaymentCategory()
                            + " → "
                            + paymentMethod.pay(1000)
            );
        }
    }

    private static void demonstrateCompileTimePolymorphism() {

        PaymentCalculator calculator = new PaymentCalculator();

        System.out.println("COMPILE-TIME POLYMORPHISM");
        System.out.println("-------------------------");

        System.out.println(
                "Integer payment: ₹"
                        + calculator.calculateTotal(1000, 200)
        );

        System.out.println(
                "Decimal payment: ₹"
                        + calculator.calculateTotal(1000.50, 200.25)
        );
    }

    static class PaymentCalculator {

        int calculateTotal(int amount, int fee) {
            return amount + fee;
        }

        double calculateTotal(double amount, double fee) {
            return amount + fee;
        }
    }
}