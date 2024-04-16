package com.bookstore.strategy;

public class BitcoinPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pago " + amount + " via Bitcoin.");
    }
}