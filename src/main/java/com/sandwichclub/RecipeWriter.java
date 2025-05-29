package com.sandwichclub;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class RecipeWriter {

    public void writeReceipt(Order order) {
        String folderName = "receipts";
        File folder = new File(folderName);
        if (!folder.exists()) {
            folder.mkdir();
        }


        String timestamp = order.getTimestamp().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        String filename = folderName + "/" + timestamp + ".txt";

        try (FileWriter writer = new FileWriter(filename)) {
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

            writer.write(String.format("\nTotal: $%.2f\n", order.getTotalCost()));

            System.out.println(" Receipt saved to: " + filename);
        } catch (IOException e) {
            System.out.println(" Error writing receipt: " + e.getMessage());
        }
    }
}


