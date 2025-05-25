package com.sandwichclub;

public class Topping {
    private String name;
    private String type;
    private boolean isExtra;

    public Topping(String name, String type, boolean isExtra) {
        this.name = name;
        this.type = type;
        this.isExtra = isExtra;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isExtra() {
        return isExtra;
    }

    @Override
    public String toString() {
        return name + (isExtra ? " (extra)" : "");
    }
}
