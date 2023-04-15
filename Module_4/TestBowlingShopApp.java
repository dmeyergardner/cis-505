/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/

import java.util.Scanner;

// class named TestBowlingShopApp to test the Product, Ball, Bag, Shoe, ProductDB, and GenericQueue classes
public class TestBowlingShopApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option = new String();
        do {
            //Display the menu to the user 
            displayMenu();

            // Display the menu to the user and invoke the getProducts method from the ProductDB class with the user’s entry as the argument. Assign the results to a product generic queue named products.
            GenericQueue<Product> products = new GenericQueue<Product>();

            System.out.print("Please choose an option: ");
            option = input.nextLine();
            System.out.println("");

        switch (option) {
            case "b":
                // invoke the getProducts method from the ProductDB class with the user’s entry as the argument
                products = ProductDB.getProducts(option);
                System.out.println("--Product Listing--");

                // Using a while loop iterate over the queue and invoke the dequeue method to display the contents.
                while (products.size() > 0){
                    // Use the queues size method in the while loops signature to keep track of your placement in the queue. Use the products toString method to display the results.
                    System.out.println(products.dequeue());
                    System.out.println("");
                }
                break;
            case "s":
                // invoke the getProducts method from the ProductDB class with the user’s entry as the argument
                products = ProductDB.getProducts(option);
                System.out.println("--Product Listing--");

                // Using a while loop iterate over the queue and invoke the dequeue method to display the contents.
                while (products.size() > 0){
                    // Use the queues size method in the while loops signature to keep track of your placement in the queue. Use the products toString method to display the results.
                    System.out.println(products.dequeue());
                    System.out.println("");
                }
                break;
            case "a":
                // invoke the getProducts method from the ProductDB class with the user’s entry as the argument
                products = ProductDB.getProducts(option);
                System.out.println("--Product Listing--");

                // Using a while loop iterate over the queue and invoke the dequeue method to display the contents.
                while (products.size() > 0){
                    // Use the queues size method in the while loops signature to keep track of your placement in the queue. Use the products toString method to display the results.
                    System.out.println(products.dequeue());
                    System.out.println("");
                }
                break;
            // Allow the user to keep selecting options until “x” is chosen.    
            case "x": 
                System.out.println("End of line...");
                break;
            // If the user inputs an invalid character, print out this error message
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        } 
    }
    while (!(option.equalsIgnoreCase("x")));
        input.close(); 
    }

    // public static method named displayMenu that displays the user choice menu
    public static void displayMenu() {
        
        System.out.println("");
        System.out.println("Welcome to the Bowling Shop\n");
        System.out.println("");
        System.out.println("MENU OPTIONS:");
        System.out.println("  1. <b> Bowling Balls");
        System.out.println("  2. <a> Bowling Bags");
        System.out.println("  3. <s> Bowling Shoes");
        System.out.println("  4. <x> To exit");
        System.out.println("");
    }
}