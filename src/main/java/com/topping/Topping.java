package com.topping;

public abstract class Topping {
    private String name;


    public Topping(String name ) {
        this.name = name;

    }



    public String getName() {
        return name;
    }


    public abstract double getPrice(int size);


}
