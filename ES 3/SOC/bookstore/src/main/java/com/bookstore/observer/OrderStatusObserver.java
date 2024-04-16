package com.bookstore.observer;

public interface OrderStatusObserver {
    void update(String status);
}