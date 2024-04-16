package com.bookstore.composite;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements ShoppingCartComponent {
    private List<ShoppingCartComponent> items = new ArrayList<>();

    public void add(ShoppingCartComponent item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (ShoppingCartComponent item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}