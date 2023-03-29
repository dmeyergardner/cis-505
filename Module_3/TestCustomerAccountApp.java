/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a class named TestCustomerAccountApp to test the Account, Customer, and CustomerDB classes:
1. Prompt the user to enter a customer number between 1007 and 1009. Use the inputted number to invoke the getCustomer static method and assign the returned value to a variable named customer.
2. Display the account menu using the accounts displayMenu method.
3. Handle the user’s selection and invoke the corresponding method. For invalid selections,
display a message “Error: Invalid Option.”
4. Allow the user to continue to select as many options as they choose by prompting them to
decide between continuing or exiting the menu. Use a do...while loop in your
programming logic.
5. After exiting the menu, display the customers details using the customer classes
toString() method. Next, on a separate line, show the customers account balance.

Special note. For the currency fields, use Java’s printf function and the expression “$%,6.2f”
*/ 

import java.util.Scanner;
import java.util.ArrayList;

public class TestCustomerAccountApp {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        // prompt user to enter customer number
        System.out.print("Enter customer number between 1007 and 1009: ");
        int customerNumber = input.nextInt();
        
        // get customer from CustomerDB using customer number
        Customer customer = CustomerDB.getCustomer(customerNumber);
        
        // display account menu and handle user selection
        String choice;
        do {
            Account.displayMenu();
            System.out.print("Enter option: ");
            choice = input.next();
            
            // invoke corresponding method based on user selection
            switch (choice) {
                case "1":
                    double amount;
                    System.out.print("Enter deposit amount: ");
                    amount = input.nextDouble();
                    customer.getAccount().deposit(amount);
                    break;
                
                case "2":
                    System.out.print("Enter withdrawal amount: ");
                    amount = input.nextDouble();
                    boolean success = customer.getAccount().withdraw(amount);
                    if (!success) {
                        System.out.println("Error: Insufficient funds");
                    }
                    break;
                
                case "3":
                    System.out.printf("Account balance: $%,6.2f\n", customer.getAccount().getBalance());
                    break;
                
                case "4":
                    break;
                
                default:
                    System.out.println("Error: Invalid option");
                    break;
            }
            
            // prompt user to continue or exit menu
            System.out.print("Continue? (y/n): ");
            choice = input.next();
        } while (choice.equalsIgnoreCase("y"));
        
        // display customer details and account balance
        System.out.println(customer.toString());
        System.out.printf("Account balance: $%,6.2f\n", customer.getAccount().getBalance());
    }    
}