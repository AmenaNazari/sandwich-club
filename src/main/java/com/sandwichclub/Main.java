package com.sandwichclub;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


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


                System.out.println("Choose sandwich size:");
                System.out.println("1. Small\n2. Medium\n3. Large");
                int sizeChoice = scanner.nextInt();
                scanner.nextLine();

                String size;
                if (sizeChoice == 1) size = "Small";
                else if (sizeChoice == 2) size = "Medium";
                else size = "Large";


                System.out.println("Choose bread type:");
                System.out.println("1. White\n2. Wheat\n3. Rye");
                int breadChoice = scanner.nextInt();
                scanner.nextLine();

                String bread;
                if (breadChoice == 1) bread = "White";
                else if (breadChoice == 2) bread = "Wheat";
                else bread = "Rye";


                System.out.println("Do you want it toasted?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int toastChoice = scanner.nextInt();
                scanner.nextLine();

                boolean isToasted = (toastChoice == 1);

                List<Topping> meats = new ArrayList<>();
                boolean addingMeats = true;

                while (addingMeats) {
                    System.out.println("Choose a meat topping:");
                    System.out.println("1. Turkey");
                    System.out.println("2. Ham");
                    System.out.println("3. Chicken");
                    System.out.println("4. Roast Beef");
                    System.out.println("5. Done");

                    int meatChoice = scanner.nextInt();
                    scanner.nextLine(); // clean newline

                    String meatName = "";
                    switch (meatChoice) {
                        case 1: meatName = "Turkey"; break;
                        case 2: meatName = "Ham"; break;
                        case 3: meatName = "Chicken"; break;
                        case 4: meatName = "Roast Beef"; break;
                        case 5:
                            addingMeats = false;
                            continue;
                        default:
                            System.out.println("Invalid option Try again.");
                            continue;
                    }

                    System.out.println("Do you want extra " + meatName + "?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    int extraChoice = scanner.nextInt();
                    scanner.nextLine();
                    boolean isExtra = (extraChoice == 1);




                }




            }else if (choice == 2) {

                    System.out.println("Thanks for visiting Sandwich-Club. See you soon!");
                    running = false;
                } else {
                    System.out.println("that's not a valid option. Please try again!");
                }
            }
            scanner.close();
        }
    }





