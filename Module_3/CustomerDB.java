/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a class named CustomerDB. This class contains:
1. A public static method named getCustomer with an Integer argument named id and a return type of Customer. Using an if...else if...else if...else statement, compare the argument id data field against the values 1007, 1008, and 1009. For each match, return a new customer object with unique fields. If there are no matches, return a default customer object.
*/ 
public class CustomerDB {
    public static Customer getCustomer(Integer id) {
        if (id == 1007) {
            return new Customer("John Smith", "123 Main St", "j.smith@gmail.com");
        } else if (id == 1008) {
            return new Customer("Jane Doe", "456 Elm St", "j.doe@gmail.com");
        } else if (id == 1009) {
            return new Customer("Bob Johnson", "789 Oak St", "b.johnson@gmail.com");
        } else {
            return new Customer("Unknown", "N/A", "N/A");
        }
    }
    
}