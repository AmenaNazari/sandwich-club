package com.sandwichclub;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sandwich club! Lets make your day by one delicious Sandwich \uD83E\uDD6A");
        boolean running = true;
        while (running) {
            System.out.println(" choose an option");
        System.out.println("1. I want to order");
        System.out.println("2. I am Done! ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Great! Let's build your sandwich!");
            } else if (choice == 2) {
                System.out.println("Thanks for visiting Sandwich-Club. See you soon!");
            } else {
                System.out.println("Hmm 1... that's not a valid option. Please try again!");

            }
            System.out.println("Choose sandwich size:");
            System.out.println("1. Small\n2. Medium\n3. Large");
            int sizeChoice = scanner.nextInt();
            scanner.nextLine();  

            String size;
            if (sizeChoice == 1) size = "Small";
            else if (sizeChoice == 2) size = "Medium";
            else size = "Large";

        }
    }
}




