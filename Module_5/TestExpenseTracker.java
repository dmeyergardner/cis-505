/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    (The TestExpenseTracker class #4). Design a class named TestExpenseTracker to test the classes Transaction, TransactionIO, and ValidatorIO. The class contains:
1. Display a menu to the user matching the format in Figure 4.1. Special note. Use the ValidatorIO static methods to validate the users input. Figure 4.1.
2. If the user selects menu item one, display all the transactions in the expenses.txt file. Special note. Invoke the findAll method from the TransactionIO class and format the amount data field using $%,6.2.f
3. If the user selects menu item two, allow the user to add a new transaction to the expenses.txt file. Special note. Use the ValidatorIO static methods for the user prompts. Allow the user to enter as many transactions as they wish by asking them to “Add another transaction.” This means you will need at least two while loops. One to check if they want to stay in the main program and one to check if they want to stay in the “Add Transactions” section.
4. If the user selects menu item three, display the total expenses of all transactions in the expenses.txt file. Special note. Invoke the findAll method from the TransactionIO class and iterate over the list to get a running total of the transaction amounts.
5. Allow the user to stay in the menu by prompting them to continue. If the user does not wish to continue, exit the program.
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {
    public static void main(String[] args) {
    
        int choice;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Expense Tracker Menu");
            System.out.println("---------------------");
            System.out.println("1. List all transactions");
            System.out.println("2. Add a transaction");
            System.out.println("3. Display total expenses");
            System.out.println("4. Exit");
            
            choice = ValidatorIO.getInt(input, "Enter your choice: ", 1, 4);
            
            switch(choice) {
                case 1:
                    displayAllTransactions();
                    break;
                case 2:
                    addTransaction();
                    break;
                case 3:
                    displayTotalExpenses();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            
        } while (choice != 4);
        
    }
    
    public static void displayAllTransactions() {
        
        List<Transaction> transactions = TransactionIO.findAll();
        
        if (transactions.size() == 0) {
            System.out.println("No transactions found.");
        } else {
            System.out.printf("%-20s %-20s %-10s\n", "Date", "Description", "Amount");
            System.out.println("-------------------------------------------");
            for (Transaction t : transactions) {
                System.out.printf("%-20s %-20s $%,6.2f\n", t.getDate(), t.getDescription(), t.getAmount());
            }
        }
        
    }
    
    public static void addTransaction() {
        
        Scanner input = new Scanner(System.in);
        boolean addAnother;
        
        do {
            String date = ValidatorIO.getRequiredString(input, "Enter date (mm/dd/yyyy): ");
            String description = ValidatorIO.getRequiredString(input, "Enter description: ");
            double amount = ValidatorIO.getDouble(input, "Enter amount: $", 0, Double.MAX_VALUE);
            
            Transaction t = new Transaction(date, description, amount);
            TransactionIO.add(t);
            
            addAnother = ValidatorIO.getYesNo(input, "Add another transaction? (y/n) ");
            
        } while (addAnother);
        
    }
    
    public static void displayTotalExpenses() {
        
        List<Transaction> transactions = TransactionIO.findAll();
        double total = 0;
        
        for (Transaction t : transactions) {
            total += t.getAmount();
        }
        
        System.out.printf("Total expenses: $%,6.2f\n", total);
        
    }
}    
