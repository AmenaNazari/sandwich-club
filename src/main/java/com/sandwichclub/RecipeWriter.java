package com.sandwichclub;
import java.io.FileWriter;
import java.io.IOException;

public class RecipeWriter {

    public void writeReceipt(Order order) {
        try {
            FileWriter writer = new FileWriter("receipt_" + order.getOrderId() + ".txt");

            writer.write("=== Sandwich Club Receipt ===\n");
            writer.write("Order ID: " + order.getOrderId() + "\n");
            writer.write("Date: " + order.getTimestamp() + "\n\n");

            // (Add rest of the receipt writing here...)

            writer.close();
            System.out.println("Receipt written to file successfully!");

        } catch (IOException e) {
            System.out.println("Error writing receipt: " + e.getMessage());
        }
    }
}

