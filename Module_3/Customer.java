/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a class named Customer to represent a customer. This class contains:
1. A private string data field named name that specifies the name of a customer.
2. A private string data field named address that specifies the address of a customer.
3. A private string data field named city that specifies the city of a customer.
4. A private string data field named zip that specifies the zip code of a customer.
5. A no-argument constructor that creates a default customer.
6. An argument constructor that creates a customer using the four data fields.
7. Accessor methods for all four data fields.
8. Override the toString() method. Return a string description for a customer with all four
fields, on separate lines.
*/ 
class Customer {
    private String customerName;
    private String customerAddress;
    private String customerCity;
    private String customerZip;

    public Customer(String customerName, String customerAddress, String customrCity, String customerZip) {
        this.name = customerName;
        this.address = customerAddress;
        this.city = customerCity;
        this.zip = customerZip;
        }
        
        public String getName() {
        return name;
        }
        
        public void setName(String name) {
        this.name = name;
        }
        
        public String getAddress() {
        return address;
        }
        
        public void setAddress(String address) {
        this.address = address;
        }
        
        public String getCity() {
        return city;
        }
        
        public void setCity(String city) {
        this.city = city;
        }
        
        public String getZip() {
        return zip;
        }
        
        public void setZip(String zip) {
        this.zip = zip;
        }
        
        @Override
        public String toString() {
        return "Name: " + name + "\n" +
        "Address: " + address + "\n" +
        "City: " + city + "\n" +
        "Zip Code: " + zip + "\n";
        }    
}