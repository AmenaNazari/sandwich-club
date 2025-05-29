package com.sandwichclub;

public class Regular extends Topping {
    public Regular(String name) {
        super(name, "regular", false); // regular toppings are never extra
    }
}
