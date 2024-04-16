package com.bookstore.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pago " + amount + " via Cartão de Crédito.");
    }
}