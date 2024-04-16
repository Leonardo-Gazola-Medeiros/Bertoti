package com.bookstore.observer;

public class Customer implements OrderStatusObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("Oi " + name + ", o status do seu pedido é: " + status);
    }
}