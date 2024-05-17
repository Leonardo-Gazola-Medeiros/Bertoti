package com.example;

import com.example.observer.Investor;
import com.example.observer.Stock;
import com.example.observer.StockMarket;


public class App 
{
    public static void main( String[] args )
    {
        Stock stock = new Stock("XYZ", 100.00);
        StockMarket stockMarket = new StockMarket(stock);

        Investor investor1 = new Investor("Fulano");
        Investor investor2 = new Investor("Cicrano");

        stockMarket.registerObserver(investor1);
        stockMarket.registerObserver(investor2);

        // Simulate price change
        stockMarket.setStockPrice(105.00);
    }
}
