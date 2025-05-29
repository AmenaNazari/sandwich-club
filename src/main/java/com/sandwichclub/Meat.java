
package com.sandwichclub;

public class Meat extends Topping {
    private boolean isExtra;

    public Meat(String name, boolean isExtra) {
        super(name);  // passes name to Topping
        this.isExtra = isExtra;
    }

    @Override
    public double getPrice() {
        return isExtra ? 1.50 : 1.00;
    }
    @Override
    public String toString() {
        return getName() + (isExtra ? " (extra)" : "");
    }

}

