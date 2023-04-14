/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a product subclass named bag to represent a bowling bag. The class contains:
1. A private string data field named type that specifies the number of bowling balls the bag can hold. The default is an empty string.
2. A no-argument constructor that creates a default bag.
3. Accessor and mutator methods for the type data field.
4. Override the toString() method. Return an appended string of the superclass with an
additional field for the bags type.
*/

// product subclass named bag to represent a bowling bag
public class Bag extends Product {

    // private string data field named type that specifies the number of bowling
    // balls the bag can hold
    private String type;

    // no-argument constructor that creates a default bag
    public Bag() {
        super();
        type = ""; // default is an empty string
    }

    // argument constructor that creates a specific bag
    public Bag(String code, String description, double price, String type) {
        super(code, description, price);
        this.type = type;
    }

    // Accessor and mutator methods for the type data field
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Override the toString() method. Return an appended string of the superclass
    // with an additional field for the bags type.
    @Override
    public String toString() {
        return super.toString() + "\nType: " + type;
    }
}