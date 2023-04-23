/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//class named TestExpenseTracker to test the classes Transaction, TransactionIO, and ValidatorIO
public class TestExpenseTracker {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean cont = true;
        
        System.out.println("Welcome to the Expense Tracker");

        do {
            //Display a menu to the user
            System.out.println("\nMENU OPTIONS");
            System.out.println("  1. View Transactions");
            System.out.println("  2. Add Transactions");
            System.out.println("  3. View Expenses");
            input = ValidatorIO.getInt(sc, "\nPlease choose an option: ");
    
            //If the user selects menu item one, display all the transactions in the expenses.txt file. 
            if (input == 1) {
                String c = "y";
                ArrayList<Transaction> transactions = new ArrayList<>();
                try {
                    //Invoke the findAll method from the TransactionIO class 
                    transactions = TransactionIO.findAll();
    
                    System.out.println("\nMONTHLY EXPENSES\n");
    
                    for (Transaction transaction : transactions) {
                        // format the amount data field using $%,6.2.f
                        System.out.printf("Date: %s\nDescription: %s\nAmount: $%,6.2f\n\n",
                                transaction.getDate(),
                                transaction.getDescription(),
                                transaction.getAmount());
                    }
                } catch (IOException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
    
                // Allow the user to stay in the menu by prompting them to continue. If the user does not wish to continue, exit the program.
                c = ValidatorIO.getString(sc, "\nContinue? (y/n) ");
                if (c == "n"){
                    cont = false;
                }
            }
    
            //If the user selects menu item two, allow the user to add a new transaction to the expenses.txt file. 
            else if (input == 2) {
                String c = "y";
                ArrayList<Transaction> transactions = new ArrayList<>();
    
                while(c.equalsIgnoreCase("y")){

                    //Use the ValidatorIO static methods for the user prompts. 
                    String description = ValidatorIO.getString(sc, "\n  Enter description: ");
                    double amount = ValidatorIO.getDouble(sc, "  Enter the amount: ");
    
                    Transaction transaction = new Transaction(description, amount);
    
                    transactions.add(transaction);
    
                    // Allow the user to enter as many transactions as they wish by asking them to “Add another transaction.” This means you will need at least two while loops. One to check if they want to stay in the main program and one to check if they want to stay in the “Add Transactions” section.
                    c = ValidatorIO.getString(sc, "\n  Add another transaction? (y/n): ");
                    if (c == "n"){
                        cont = false;
                    }
                }
    
                try {
                    TransactionIO.bulkInsert(transactions);
                }
                catch (IOException e){
                    System.out.println("\n  Exception:  " + e.getMessage());
                }
            }
    
            //If the user selects menu item three, display the total expenses of all transactions in the expenses.txt file. 
            else if (input == 3) {
                String c = "y";
                double monthlyExpense = 0;
                ArrayList<Transaction> transactions = new ArrayList<>();
                try {
                    //Invoke the findAll method from the TransactionIO class and iterate over the list to get a running total of the transaction amounts.
                    transactions = TransactionIO.findAll();
    
                    for (Transaction transaction : transactions) {
                        monthlyExpense += transaction.getAmount();
                    }
                } catch (IOException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
    
                System.out.printf("\nTOTAL EXPENSES: $%,6.2f\n", monthlyExpense);

                //Allow the user to stay in the menu by prompting them to continue. If the user does not wish to continue, exit the program.
                c = ValidatorIO.getString(sc, "Continue? (y/n) ");
                if (c == "n"){
                    cont = false;
                }
            }

        } while(cont);
        // Allow the user to enter as many transactions as they wish by asking them to “Add another transaction.” This means you will need at least two while loops. One to check if they want to stay in the main program and one to check if they want to stay in the “Add Transactions” section.
        System.out.println("\nExiting Expense Tracker");
    } 
}