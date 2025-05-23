package com.sandwichclub;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sandwich club! Lets make your day by one delicious Sandwich \uD83E\uDD6A");
        System.out.println("1. I want to order");
        System.out.println("2. I am Done! ");
        boolean running = true;
        while (running) {
            System.out.print("What do you want for today? choose an option");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Great! Let's build your sandwich!");
            } else if (choice == 2) {
                System.out.println("Thanks for visiting Sandwich-Club. See you soon!");
            } else {
                System.out.println("Hmm 1... that's not a valid option. Please try again!");

            }
        }
    }
}




