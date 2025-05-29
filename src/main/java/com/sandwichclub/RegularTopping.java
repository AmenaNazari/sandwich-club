package com.sandwichclub;

public class RegularTopping extends Topping {
    public RegularTopping(String name) {
        super(name, "regular", false);
    }

    @Override
    public double getPrice() {
        return 0.00;
    }
}


