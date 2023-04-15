/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/
public class Product {

    // private string data field named code that specifies the product code
    private String code;

    // private string data field named description that specifies the products
    // description
    private String description;

    // private double data field named price that specifies the price of a product
    private double price;

    // no-argument constructor that creates a default product
    public Product() {
        code = ""; // default value is an empty string
        description = ""; // default value is an empty string
        price = 0; // default value is 0
    }

    // arg constructor that gets the default product
    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // Accessor and mutator methods for CODE
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Accessor and mutator methods for DESCRIPTION
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Accessor and mutator methods for PRICE
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override the toString() method. Return a description of the product with all
    // three fields on separate lines
    @Override
    public String toString() {
        return "Product Code: " + code + "\nDescription: " + description + "\nPrice: "
                + String.format("$%,6.2f", price);
    }
}
