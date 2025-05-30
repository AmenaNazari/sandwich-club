package com.Writers;

import com.model.Chips;
import com.model.Drink;
import com.model.Order;
import com.model.Sandwich;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {
    public void writeReceipt(Order order) {

        File folder = new File("receipts");
        if (!folder.exists()) {
            folder.mkdir();
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = "receipts/" + order.getTimestamp().format(formatter) + ".txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("=== Sandwich Club Receipt ===\n");
            writer.write("Order ID: " + order.getOrderId() + "\n");
            writer.write("Time: " + order.getTimestamp() + "\n\n");

            writer.write("Sandwiches:\n");
            for (Sandwich s : order.getSandwiches()) {
                writer.write(" - " + s + "\n");
            }

            writer.write("\nDrinks:\n");
            for (Drink d : order.getDrinks()) {
                writer.write(" - " + d + "\n");
            }

            writer.write("\nChips:\n");
            for (Chips c : order.getChips()) {
                writer.write(" - " + c + "\n");
            }

            writer.write(String.format("\nTOTAL: $%.2f\n", order.getTotalCost()));
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }
}
