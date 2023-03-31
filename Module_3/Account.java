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
        return balance;
    }
    
    // public method named deposit with a double argument named amt and a return type of void. Increase the running total of the balance data field using the methods argument
    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited " + amt + " successfully.");
    }
    
    // public method named withdraw with a double argument named amt and a return type of void. If the balance data field is greater than or equal to the argument, decrease the running total of the balance field using the methods argument
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawn " + amt + " successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    } 
    
    // public method named displayMenu with a return type of void
    public void displayMenu() {
        System.out.println("  Account Menu");
        System.out.println("  Enter <D/d> for depsit");
        System.out.println("  Enter <W/w> for withdraw");
        System.out.println("  Enter <B/b> for balance");
        System.out.print("    Enter option:  ");
    }
        
    // public method named getTransactionDate with a return type of string. Return a date using the format MM-dd-yyyy.
    public String getTransactionDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
       
}