package com.bookstore.strategy;

public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pago " + amount + " via PayPal.");
    }
}