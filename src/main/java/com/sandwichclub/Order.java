package com.sandwichclub;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Order {

    private String orderId;
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;
    private LocalDateTime timestamp;

    public Order(String orderId, List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips, LocalDateTime timestamp) {
        this.orderId = orderId;
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
        this.timestamp = timestamp;

    }

    public String getOrderId() {
        return orderId;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
