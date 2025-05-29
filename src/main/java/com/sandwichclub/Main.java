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
                System.out.println("1. Small (4\")\n2. Medium (8\")\n3. Large (12\")");
                int sizeChoice = scanner.nextInt();
                scanner.nextLine();

                int sizeInInches;
                if (sizeChoice == 1) sizeInInches = 4;
                else if (sizeChoice == 2) sizeInInches = 8;
                else sizeInInches = 12;



                System.out.println("Choose bread type:");
                System.out.println("1. White\n2. Wheat\n3. Rye");
                int breadChoice = scanner.nextInt();
                scanner.nextLine();

                String bread;
                if (breadChoice == 1) bread = "White";
                else if (breadChoice == 2) bread = "Wheat";
                else bread = "Rye";



                System.out.println("Do you want it toasted?");
                System.out.println("1. Yes\n2. No");
                boolean isToasted = scanner.nextInt() == 1;
                scanner.nextLine();




                List<Topping> toppings = new ArrayList<>();


                boolean addingMeats = true;

                while (addingMeats) {
                    System.out.println("Choose a meat topping:");
                    System.out.println("1. Turkey");
                    System.out.println("2. Ham");
                    System.out.println("3. Chicken");
                    System.out.println("4. Roast Beef");
                    System.out.println("5. Done");

                    int meatChoice = scanner.nextInt();
                    scanner.nextLine();

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
                    toppings.add(new Meat(meatName, isExtra));


                }
                System.out.println("Do you want extra meat?");
                System.out.println("1. Yes\n2. No");
                boolean extraMeat = scanner.nextInt() == 1;
                scanner.nextLine();

                boolean addingCheese = true;

                while (addingCheese) {
                    System.out.println("Choose a cheese:");
                    System.out.println("1. Cheddar");
                    System.out.println("2. Swiss");
                    System.out.println("3. Provolone");
                    System.out.println("4. Mozzarella");
                    System.out.println("5. Done");

                    int cheeseChoice = scanner.nextInt();
                    scanner.nextLine();

                    String cheeseName = "";
                    switch (cheeseChoice) {
                        case 1: cheeseName = "Cheddar"; break;
                        case 2: cheeseName = "Swiss"; break;
                        case 3: cheeseName = "Provolone"; break;
                        case 4: cheeseName = "Mozzarella"; break;
                        case 5:
                            addingCheese = false;
                            continue;
                        default:
                            System.out.println("Invalid choice. Try again.");
                            continue;
                    }

                    System.out.println("Do you want extra " + cheeseName + "?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    boolean isExtra = scanner.nextInt() == 1;
                    scanner.nextLine();

                    toppings.add(new Cheese(cheeseName, isExtra));
                }


                System.out.println("Do you want extra cheese?");
                System.out.println("1. Yes\n2. No");
                boolean extraCheese = scanner.nextInt() == 1;
                scanner.nextLine();

                List<String> sauces = new ArrayList<>();
                boolean addingSauces = true;

                while (addingSauces) {
                    System.out.println("Choose a sauce:");
                    System.out.println("1. Mayo");
                    System.out.println("2. Mustard");
                    System.out.println("3. Chipotle");
                    System.out.println("4. Done");

                    int sauceChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (sauceChoice) {
                        case 1: sauces.add("Mayo"); break;
                        case 2: sauces.add("Mustard"); break;
                        case 3: sauces.add("Chipotle"); break;
                        case 4: addingSauces = false; break;
                        default:
                            System.out.println("Not on the sauce list ");
                    }
                }
                boolean addingRegular = true;

                while (addingRegular) {
                    System.out.println("Choose a regular topping:");
                    System.out.println("1. Lettuce");
                    System.out.println("2. Tomato");
                    System.out.println("3. Pickles");
                    System.out.println("4. Onions");
                    System.out.println("5. Done");

                    int regChoice = scanner.nextInt();
                    scanner.nextLine();

                    String toppingName = "";
                    switch (regChoice) {
                        case 1: toppingName = "Lettuce"; break;
                        case 2: toppingName = "Tomato"; break;
                        case 3: toppingName = "Pickles"; break;
                        case 4: toppingName = "Onions"; break;
                        case 5:
                            addingRegular = false;
                            continue;
                        default:
                            System.out.println("Invalid option 🥔. Try again.");
                            continue;
                    }

                    toppings.add(new Regular(toppingName));
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





