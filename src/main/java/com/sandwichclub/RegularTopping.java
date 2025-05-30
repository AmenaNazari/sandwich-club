package com.sandwichclub;

public class RegularTopping extends Topping {
    public RegularTopping(String name) {
        super(name);
    }

    @Override
    public double getPrice(int size) {
        return 0.0;  // Regular toppings are free
    }
}
