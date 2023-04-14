/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

Design a Java class named TestBowlingShopApp to test the Product, Ball, Bag, Shoe, ProductDB, and GenericQueue classes.
1. A public static method named displayMenu that displays the menu
2. Display the menu to the user and invoke the getProducts method from the ProductDB class with the user’s entry as the argument. Assign the results to a product generic queue named products. Using a while loop iterate over the queue and invoke the dequeue method to display the contents.
Special note. Use the queues size method in the while loops signature to keep track of your placement in the queue. Use the products toString method to display the results.
3. Allow the user to keep selecting options until “x” is chosen.
Special note. Pay close attention to the format of the price data field. Use the printf method and pattern “$%,6.2f” in the product classes toString method.
*/

import java.util.Scanner;

public class TestBowlingShopApp {
    public static void main(String[] args) {

        displayMenu();

    }

    // public static method named displayMenu that displays the menu
    public static void displayMenu() {
        System.out.println("");
        System.out.println("MENU OPTIONS:");
        System.out.println("  1. <b> Bowling Balls");
        System.out.println("  2. <a> Bowling Bags");
        System.out.println("  3. <s> Bowling Shoes");
        System.out.println("  4. <x> To exit");
        System.out.println("");
        System.out.println("");
    }
}

/*
 * choice=scanner.nextLine();
 * 
 * switch(choice)
 * 
 * private static void displayMenu() {
 * }
 * 
 * {
 * case "1":
 * System.out.println("Displaying all products:");
 * products = productDB.getProducts("all");
 * break;
 * 
 * case "2":
 * 
 * System.out.println("Adding a product:");
 * System.out.println("Please choose a product type:");
 * System.out.println("1. Ball");
 * System.out.println("2. Bag");
 * System.out.println("3. Shoe");
 * String type = scanner.nextLine();
 * System.out.println("Please enter the product name:");
 * String name = scanner.nextLine();
 * System.out.println("Please enter the product price:");
 * double price = scanner.nextDouble();
 * scanner.nextLine(); // clear the buffer
 * 
 * if (type.equals("1")) {
 * System.out.println("Please enter the ball weight:");
 * double weight = scanner.nextDouble();
 * scanner.nextLine(); // clear the buffer
 * Ball newBall = new Ball(name, price, weight);
 * productDB.addProduct(newBall);
 * System.out.println("Ball added successfully!");
 * 
 * } else if (type.equals("2")) {
 * System.out.println("Please enter the bag capacity:");
 * int capacity = scanner.nextInt();
 * scanner.nextLine(); // clear the buffer
 * Bag newBag = new Bag(name, price, capacity);
 * productDB.addProduct(newBag);
 * System.out.println("Bag added successfully!");
 * 
 * } else if (type.equals("3")) {
 * System.out.println("Please enter the shoe size:");
 * int size = scanner.nextInt();
 * scanner.nextLine(); // clear the buffer
 * System.out.println("Please enter the shoe color:");
 * String color = scanner.nextLine();
 * Shoe newShoe = new Shoe(name, price, size, color);
 * productDB.addProduct(newShoe);
 * System.out.println("Shoe added successfully!");
 * 
 * } else {
 * System.out.println("Invalid product type!");
 * }
 * break;
 * 
 * case "3":
 * System.out.println("Removing a product:");
 * System.out.println("Please enter the product ID:");
 * int id = scanner.nextInt();
 * scanner.nextLine(); // clear the buffer
 * 
 * if (productDB.removeProduct(id)) {
 * System.out.println("Product removed successfully!");
 * 
 * } else {
 * System.out.println("Product not found!");
 * }
 * break;
 * 
 * case "4":
 * System.out.println("Searching for a product:");
 * System.out.println("Please enter the product name:");
 * String searchName = scanner.nextLine();
 * products = productDB.getProducts(searchName);
 * break;
 * 
 * case "x":
 * break;
 * 
 * default:
 * System.out.println("Invalid choice!");
 * }
 * 
 * if(products!=null)
 * {
 * int size = products.size();
 * for (int i = 0; i < size; i++) {
 * Product product = products.dequeue();
 * System.out.println(product.toString());
 * products.enqueue(product);
 * }
 * }
 * 
 * } while(!choice.equals("x"));
 * }
 */