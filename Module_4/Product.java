/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a superclass named product to represent a product in a bowling shop. This class contains:
1. A private string data field named code that specifies the product code. The default value is an empty string.
2. A private string data field named description that specifies the products description. The default value is an empty string.
3. A private double data field named price that specifies the price of a product. The default value is 0.
4. A no-argument constructor that creates a default product.
5. Accessor and mutator methods for all three data fields.
6. Override the toString() method. Return a description of the product with all three fields
on separate lines.
*/ 
public class Product {

        // private string data field named code that specifies the product code
        private String code; 

        // private string data field named description that specifies the products description
        private String description;

        // private double data field named price that specifies the price of a product
        private double price;
        
        public Product() {
        code = ""; // default value is an empty string
        description = ""; // default value is an empty string
        price = 0; // efault value is 0
        }
        
        // no-argument constructor that creates a default product
        public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
        }
        
        // Accessor and mutator methods for CODE
        public String getCode() {
        return code;
        }
        
        public void setCode(String code) {
        this.code = code;
        }
        
        // Accessor and mutator methods for DESCRIPTION
        public String getDescription() {
        return description;
        }
        
        public void setDescription(String description) {
        this.description = description;
        }
        
        // Accessor and mutator methods for PRICE
        public double getPrice() {
        return price;
        }
        
        public void setPrice(double price) {
        this.price = price;
        }
        
        // Override the toString() method. Return a description of the product with all three fields on separate lines
        @Override
        public String toString() {
        return "Product Code: " + code + "\nDescription: " + description + "\nPrice: $" + String.format("%,.2f", price);
        }
}
