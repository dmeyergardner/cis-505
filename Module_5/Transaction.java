/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/

//import java.text.SimpleDateFormat;
//import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//class named transaction to represent an expense transaction
public class Transaction {
    //private string data field named date that specifies the date of a transaction.
    private String date = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")).toString();
   
    // private string data field named description that specifies the description of a transaction. 
    private String description;
    // private double data field named amount that specifies the amount of a transaction. 
    private double amount;

    // no-argument constructor that creates a default transaction. 
    public Transaction(){
        //this.date = date;
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

    //argument constructor that creates a transaction using the two data fields and using default date.
    public Transaction(String description, double amount) {
        //this.date = date;
        this.description = description;
        this.amount = amount;
    }

    // Getters and setters for date
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    // Getters and setters for description
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // Getters and setters for amount
    public double getAmount() {
        return this.amount;
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
                ", amount= $%,6.2.f" + amount +
                '}';
    }
}
