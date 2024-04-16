package com.example.observer;

public class Investor {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    public void update(String stockName, double price) {
        System.out.println(name + ": Preço de " + stockName + " Mudou Para " + price);
    }
}
