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
        System.out.println("  Welcome to the Customer Account App");
        System.out.println("");
        System.out.println("Enter a customer ID: ");
                System.out.print("    ex: 1007, 1008, 1009>: "); // Prompt for customer number between 1007 and 1009
    
        Integer id = scanner.nextInt();

        // Get customer from customer database, invoke the getCustomer static method and assign the returned value to a variable named customer.
        Customer customer = CustomerDB.getCustomer(id);
        System.out.println(customer);

        Account account = new Account();
        String choice;

        // Allow the user to continue to select as many options as they choose by prompting them to decide between continuing or exiting the menu. Use a do...while loop in your programming logic.
        do {
            // Display account menu using the accounts displayMenu method
            Account.displayMenu();
            account.displayMenu();
            choice = scanner.next();
          
            switch (choice) {
              case "1": // check balance
                System.out.println("Current balance: $" + account.getBalance());
                break;
              case "2": { // deposit
                System.out.print("Enter amount to deposit: $");
                double amt = scanner.nextDouble();
                account.deposit(amt);
                System.out.println("Deposit of $" + amt + " successful.");
                break;
              }
              case "3": { // withdraw
                System.out.print("Enter amount to withdraw: $");
                double amt = scanner.nextDouble();
                account.withdraw(amt);
                System.out.println("Withdrawal of $" + amt + " successful.");
                break;
              }
              case "4": // Exit
                System.out.println("Exiting menu...");
                break;
              default:
              // Handle the user’s selection and invoke the corresponding method. For invalid selections, display a message “Error: Invalid Option.”
                System.out.println("Error: Invalid option.");
            }
          } while (!choice.equals("4"));
          
          // After exiting the menu, display the customers details using the customer classesmtoString() method. Next, on a separate line, show the customers account balance.
          System.out.println(customer);
          System.out.println("Current balance: $" + account.getBalance());
    }
}