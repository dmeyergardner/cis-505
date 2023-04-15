/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/

// product subclass named shoe to represent bowling shoes
public class Shoe extends Product {

    // private double data field named size that specifies the shoe size
    private double size;

    // no-argument constructor that creates a default shoe
    public Shoe() {
        super();
        size = 0; // default is 0
    }

    // argument constructor that creates a specific shoe
    public Shoe(String code, String description, double price, double size) {
        super(code, description, price);
        this.size = size;
    }

    // Accessor and mutator methods for the size data field
    public double getSize() {
        return this.size;
    }

    public void setSize(double d) {
        this.size = d;
    }

    // Override the toString() method. Return an appended string of the superclass with an additional field for the shoe size.
    @Override
    public String toString() {
        return super.toString() + "\nSize: " + size;
    }

}
