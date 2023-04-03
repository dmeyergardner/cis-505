/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

6. A public method named getTransactionDate with a return type of string. Return a date using the format MM-dd-yyyy.
*/ 

import java.text.SimpleDateFormat;
import java.util.Date;

// class named Account to represent an account
public class Account {
    private double balance = 200.0; // private double data field named balance, default is 200
    
    public Account() {
        balance = 200;
        }

    // accessor method for the balance data field
    public double getBalance() {
        return this.balance;
    }
    
    // public method named deposit with a double argument named amt and a return type of void. Increase the running total of the balance data field using the methods argument
    public void deposit(double amt) {
        this.balance += amt;
        System.out.printf("Successfully Deposited $%,6.2f", amt);
    }
    
    // public method named withdraw with a double argument named amt and a return type of void. If the balance data field is greater than or equal to the argument, decrease the running total of the balance field using the methods argument
    public void withdraw(double amt) {
        if (this.balance >= amt) {
            this.balance -= amt;
            System.out.printf("Successfully Withdrawn $%,6.2f", amt);
        } else {
            System.out.println("Insufficient balance.");
        }
    } 
    
    // public method named displayMenu with a return type of void
    public void displayMenu() {
        System.out.println("");
        ;System.out.println("Account Menu");
        System.out.println("Enter <D/d> for deposit");
        System.out.println("Enter <W/w> for withdraw");
        System.out.println("Enter <B/b> for balance");
        System.out.print("  Enter option:  ");
    }
        
    // public method named getTransactionDate with a return type of string. Return a date using the format MM-dd-yyyy.
    public String getTransactionDate() {
        // Get the current date/time
        Date currentDate = new Date();
    
        // Create a SimpleDateFormat object with the desired date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
    
        // Use the SimpleDateFormat object to format the date as a string
        String dateString = dateFormat.format(currentDate);
    
        // Return the formatted date string
        return dateString;
      }
}