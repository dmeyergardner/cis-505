/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    
1. A private string data field named date that specifies the date of a transaction. The default value is today’s date formatted as “MM-dd-yyyy”
2. A private string data field named description that specifies the description of a transaction. The default is an empty string.
3. A private double data field named amount that specifies the amount of a transaction. The default value is 0.
4. Accessor and mutator methods for the all three data fields.
5. A no-argument constructor that creates a default transaction.
6. An argument constructor that creates a transaction using the three data fields.
7. Override the toString method. Return a string description of a transaction with all three
data fields, on separate lines.

*/

import java.text.SimpleDateFormat;
import java.util.Date;

//class named transaction to represent an expense transaction
public class Transaction {
    //private string data field named date that specifies the date of a transaction.
    private String date;
    // private string data field named description that specifies the description of a transaction. 
    private String description;
    // private double data field named amount that specifies the amount of a transaction. 
    private double amount;

    // no-argument constructor that creates a default transaction. 
    public Transaction(){
        Date today = new Date();
        // The default value is today’s date formatted as “MM-dd-yyyy”
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
        this.date = simpleDateFormat.format(today);
        // The default is an empty string.
        this.description = "";
        //The default value is 0.
        this.amount = 0.0;
    }
    //argument constructor that creates a transaction using the three data fields.
    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    // Getters and setters for date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    // Getters and setters for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // Getters and setters for amount
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    // Override the toString method. Return a string description of a transaction with all three data fields, on separate lines.
    @Override
    public String toString() {
        return "Transaction{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}
