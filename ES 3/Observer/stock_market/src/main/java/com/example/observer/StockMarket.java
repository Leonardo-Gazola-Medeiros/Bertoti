package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<Investor> investors;
    private Stock stock;

    public StockMarket(Stock stock) {
        this.investors = new ArrayList<>();
        this.stock = stock;
    }

    public void addObserver(Investor investor) {
        investors.add(investor);
    }

    public void removeObserver(Investor investor) {
        investors.remove(investor);
    }

    public void notifyObservers() {
        double price = stock.getPrice();
        for (Investor investor : investors) {
            investor.update(stock.getName(), price);
        }
    }

    public void setStockPrice(double price) {
        stock.setPrice(price);
        notifyObservers();
    }
}
