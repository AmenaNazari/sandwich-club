package com.sandwichclub;

public class Cheese extends Topping {
    private boolean isExtra;

    public Cheese(String name, boolean isExtra) {
        super(name); // Only name is passed to Topping
        this.isExtra = isExtra;
    }

    @Override
    public double getPrice(int size) {
        return isExtra ? 1.00 : 0.00;
    }

    @Override
    public String toString() {
        return getName() + (isExtra ? " (extra)" : "");
    }
}





