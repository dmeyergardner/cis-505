/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/ 

import java.util.Scanner;

// class named TestCustomerAccountApp to test the Account, Customer, and CustomerDB classes
public class TestCustomerAccountApp {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Welcome to the Customer Account App");
        System.out.println("");
        System.out.println("Enter a customer ID: ");
        System.out.print("  ex: 1007, 1008, 1009>: "); // Prompt for customer number between 1007 and 1009

    
        Scanner input = new Scanner(System.in);
        Integer id = input.nextInt();
        input.nextLine();
        
        // Get customer from customer database, invoke the getCustomer static method and assign the returned value to a variable named customer.
        Customer customer = CustomerDB.getCustomer(id);
        Account account = new Account();

        // Allow the user to continue to select as many options as they choose by prompting them to decide between continuing or exiting the menu. Use a do...while loop in your programming logic.
        String choice;
        String cont = new String("y");

        do {
            // Display account menu using the accounts displayMenu method
            account.displayMenu();
            choice = input.nextLine();
          
            switch (choice.toLowerCase()) {
                case "d": { // deposit
                    System.out.println("");
                    System.out.print("Enter the deposit amount: ");
                    double amt = input.nextDouble();
                    input.nextLine();
                    account.deposit(amt);
                    System.out.println("");
                    break;
                  }
                case "w": { // withdraw
                    System.out.println("");
                    System.out.print("Enter the withdraw amount: ");
                    double withdrawAmt = input.nextDouble();
                    input.nextLine();
                    account.withdraw(withdrawAmt);
                    break;
                  }
                case "b": // check balance
                    System.out.println("");
                    System.out.printf("Current balance: $%,6.2f", account.getBalance());
                    System.out.println("");
                    break;
                default:
                // Handle the user’s selection and invoke the corresponding method. For invalid selections, display a message “Error: Invalid Option.”
                System.out.println("");
                System.out.println("Error: Invalid option.");
                }
            
            System.out.println("");
            System.out.print("Do you want to continue? (y/n): ");
            cont = input.nextLine();

          } while (cont.equalsIgnoreCase("y")); 
          
          // After exiting the menu, display the customers details using the customer class's toString() method. 
          System.out.println("");
          System.out.println("--Customer Details--");
          System.out.print(customer.toString());

          // on a separate line, show the customers account balance.
          System.out.println("");
          System.out.printf("\nAccount balance: $%,6.2f", account.getBalance());
          input.close();
    }
}