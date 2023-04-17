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

//class named TestExpenseTracker to test the classes Transaction, TransactionIO, and ValidatorIO
public class TestExpenseTracker {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean cont = true;
        
        //Display a menu to the user
        System.out.println("Welcome to the Expense Tracker");
        
        //testing date format as string. Remove from final

        do {
            System.out.println("\nMENU OPTIONS");
            System.out.println("  1. View Transactions");
            System.out.println("  2. Add Transactions");
            System.out.println("  3. View Expenses");
            input = ValidatorIO.getInt(sc, "\nPlease choose an option: ");
    
            if (input == 1) {
                String c = "y";
                ArrayList<Transaction> transactions = new ArrayList<>();
                try {
                    transactions = TransactionIO.findAll();
    
                    System.out.println("\nMONTHLY EXPENSES\n");
    
                    for (Transaction transaction : transactions) {
                        System.out.printf("Date: %s\nDescription: %s\nAmount: $%,6.2f\n\n",
                                transaction.getDate(),
                                transaction.getDescription(),
                                transaction.getAmount());
                    }
                } catch (IOException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
    
                c = ValidatorIO.getString(sc, "\nContinue? (y/n) ");
                if (c == "n"){
                    cont = false;
                }
            }
    
            else if (input == 2) {
                String c = "y";
                ArrayList<Transaction> transactions = new ArrayList<>();
    
                while(c.equalsIgnoreCase("y")){
                    String description = ValidatorIO.getString(sc, "\n  Enter description: ");
                    double amount = ValidatorIO.getDouble(sc, "  Enter the amount: ");
    
                    Transaction transaction = new Transaction(description, amount);
    
                    transactions.add(transaction);
    
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
    
            else if (input == 3) {
                String c = "y";
                double monthlyExpense = 0;
                ArrayList<Transaction> transactions = new ArrayList<>();
                try {
                    transactions = TransactionIO.findAll();
    
                    for (Transaction transaction : transactions) {
                        monthlyExpense += transaction.getAmount();
                    }
                } catch (IOException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
    
                System.out.printf("\nTOTAL EXPENSES: $%,6.2f\n", monthlyExpense);

                c = ValidatorIO.getString(sc, "Continue? (y/n) ");
                if (c == "n"){
                    cont = false;
                }
            }

        } while(cont);
        System.out.println("\nExiting Expense Tracker");
    } 
}