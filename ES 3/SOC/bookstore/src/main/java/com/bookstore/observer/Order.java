package com.bookstore.observer;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<OrderStatusObserver> observers = new ArrayList<>();
    private String status;

    public void attach(OrderStatusObserver observer) {
        observers.add(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderStatusObserver observer : observers) {
            observer.update(status);
        }
    }
}