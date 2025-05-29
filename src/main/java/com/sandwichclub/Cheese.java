package com.sandwichclub;

public class Cheese extends Topping {
    public Cheese(String name, boolean isExtra) {
        super(name, "cheese", isExtra);
    }

    @Override
    public double getPrice() {
        return isExtra() ? 1.00 : 0.00;
    }
}




