/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/ 
public class CustomerDB {

    // public static method named getCustomer with an Integer argument named id and a return type of Customer
    public static Customer getCustomer(Integer id) {

        // Using an if...else if...else if...else statement, compare the argument id data field against the values 1007, 1008, and 1009
        if (id == 1007) {
            return new Customer("John Smith", "123 Main St", "Anytown", "12345"); // For each match, return a new customer object with unique fields
        } else if (id == 1008) {
            return new Customer("Jane Doe", "456 Elm St", "Anyville", "67890"); // For each match, return a new customer object with unique fields
        } else if (id == 1009) {
            return new Customer("Bob Johnson", "789 Oak St", "Anycity", "54321"); // For each match, return a new customer object with unique fields
        } else {
            return new Customer(); // no matches, return a default customer object
        }
    }
    
}