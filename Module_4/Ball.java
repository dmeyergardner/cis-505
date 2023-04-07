/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a product subclass named ball to represent a bowling ball. The class contains:
1. A private string data field named color that specifies the color of a bowling ball. The default is an empty string.
2. A no-argument constructor that creates a default ball.
3. Accessor and mutator methods for the color data field.
4. Override the toString() method. Return an appended string of the superclass with an
additional field for the bowling balls color.
*/ 

// product subclass named ball to represent a bowling ball
public class Ball extends Product {

        // private string data field named color that specifies the color of a bowling ball
        private String color;
        
        public Ball() {
        super();
        color = ""; // default is an empty string
        }
        
        // no-argument constructor that creates a default ball
        public Ball(String code, String description, double price, String color) {
        super(code, description, price);
        this.color = color;
        }
        
        // Accessor and mutator methods for the color data field
        public String getColor() {
        return color;
        }
        
        public void setColor(String color) {
        this.color = color;
        }
        
        // Override the toString() method. Return an appended string of the superclass with an additional field for the bowling balls color.
        @Override
        public String toString() {
        return super.toString() + "\nColor: " + color;
        }
}
