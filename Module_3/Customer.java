/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/ 

// a class named Customer to represent a customer
public class Customer {
    private String customerName; // private string data field named name that specifies the name of a customer
    private String customerAddress; // private string data field named address that specifies the address of a customer
    private String customerCity; // private string data field named city that specifies the city of a customer
    private String customerZip; // private string data field named zip that specifies the zip code of a customer

    // no-argument constructor that creates a default customer
    public Customer() {
        customerName = "Sarah Jane";
        customerAddress = "1234 First Ave";
        customerCity = "Anywhere";
        customerZip = "09876";
    }

    // argument constructor that creates a customer using the four data fields
    public Customer(String customerName, String customerAddress, String customrCity, String customerZip) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerCity = customerCity;
        this.customerZip = customerZip;
        }
        
        // Accessor methods for all four data fields
        public String getName() {
            return customerName;
        }
        
        public String getAddress() {
            return customerAddress;
        }
        
        public String getCity() {
            return customerCity;
        }
        
        public String getZip() {
            return customerZip;
        }
        
        // Override the toString() method. Return a string description for a customer with all four fields, on separate lines
        @Override
        public String toString() {
            return "Name: " + customerName + "\nAddress: " + customerAddress + "\nCity: " + customerCity + "\nZip: " + customerZip;
        }    
}