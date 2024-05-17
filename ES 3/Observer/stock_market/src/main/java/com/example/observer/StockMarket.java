package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {
    private List<Observer> observers;
    private Stock stock;

    public StockMarket(Stock stock) {
        this.observers = new ArrayList<>();
        this.stock = stock;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stock.getName(), stock.getPrice());
        }
    }

    public void setStockPrice(double price) {
        stock.setPrice(price);
        notifyObservers();
    }
}