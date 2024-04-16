package com.bookstore;

import com.bookstore.composite.*;
import com.bookstore.observer.*;
import com.bookstore.strategy.*;

public class App {
    public static void main(String[] args) {
        
        // Criando as estratégias de pagamento
        PaymentStrategy creditCardPayment = new CreditCardPaymentStrategy();
        PaymentStrategy payPalPayment = new PayPalPaymentStrategy();
        PaymentStrategy bitcoinPayment = new BitcoinPaymentStrategy();

        // Criando clientes e adicionando eles como observers
        Customer customer1 = new Customer("Fulano");
        Customer customer2 = new Customer("Cicrano");

        // Criando ordem e adicionando como observers
        Order order1 = new Order();
        order1.attach(customer1);
        Order order2 = new Order();
        order2.attach(customer2);

        // Adicionar itens ao carrinho de compras
        ShoppingCart cart1 = new ShoppingCart();
        cart1.add(new Book("Programação em Java", 50));
        cart1.add(new Book("Design Patterns", 40));
        order1.setStatus("Em Processo"); // Notifying customer1
        System.out.println("Preço total da ordem 1: $" + cart1.getPrice());

        ShoppingCart cart2 = new ShoppingCart();
        cart2.add(new Book("Estrutura de Dados", 30));
        cart2.add(new Book("Algoritmos", 35));
        order2.setStatus("Enviado"); // Notifying customer2
        System.out.println("Preço total da Ordem 2: $" + cart2.getPrice());

        // Pagamento
        creditCardPayment.pay(cart1.getPrice());
        payPalPayment.pay(cart2.getPrice());
        bitcoinPayment.pay(cart1.getPrice());
    }
}
