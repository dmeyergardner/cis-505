/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a class named ProductDB to represent the bowling shops database. The class contains:
1. A public static method named getProducts with string argument named code and a return type of a product generic queue (hint: we are leveraging the GenericQueue to store the product objects). Using an if...else if...else if...else check the argument against the values “b, s, and a.” For arguments that equal “b” create five (5) new ball instances, set all four data fields with values, and add them to a product generic queue named balls. For arguments that equal “s” create five (5) new shoe instances, set all four data fields with values, and add them to a product generic queue named shoes. For arguments that equal “a’ create three (3) new shoe instances, set all four data fields with values, and add them to a product generic queue named shoes. For all other arguments, return an empty product generic queue.
*/ 

// lass named ProductDB to represent the bowling shops database
public class ProductDB {

    // public static method named getProducts with string argument named code
    public static GenericQueue getProducts(String code) {

        // return type of a product generic queue
        GenericQueue queue = new GenericQueue();

        // Using an if...else if...else if...else check the argument against the values “b”
        if (code.equalsIgnoreCase("b")) {

            Ball ball1 = new Ball();
            ball1.setCode("B100");
            ball1.setDescription("Black Widow 2.0");
            ball1.setPrice(144.95);
            ball1.setColor("Black and Red");
            
            GenericQueue<Product> balls = new GenericQueue<Product>();
            balls.enqueue(ball1);
            } else if  {
                Ball ball2 = new Ball();
                ball2.setCode("B200");
                ball2.setDescription("Axiom Pearl");
                ball2.setPrice(154.95);
                ball2.setColor("Blue and Red");
            
                GenericQueue<Product> balls = new GenericQueue<Product>();
                balls.enqueue(ball2);

            } else if {
                Ball ball3 = new Ball();
                ball3.setCode("B300");
                ball3.setDescription("Proton Physix");
                ball3.setPrice(174.95);
                ball3.setColor("Pink and Purple");
            
                GenericQueue<Product> balls = new GenericQueue<Product>();
                balls.enqueue(ball3);

            } else if {
                Ball ball4 = new Ball();
                ball4.setCode("B400");
                ball4.setDescription("Force Unleashed");
                ball4.setPrice(139.99);
                ball4.setColor("Red and White");
            
                GenericQueue<Product> balls = new GenericQueue<Product>();
                balls.enqueue(ball4);

            } else if {
                Ball ball5 = new Ball();
                ball5.setCode("B500");
                ball5.setDescription("Phase III");
                ball5.setPrice(159.99);
                ball5.setColor("Purple and Green");
            
                GenericQueue<Product> balls = new GenericQueue<Product>();
                balls.enqueue(ball5);

            }

            // For arguments that equal “b” create five (5) new ball instances, set all four data fields with values and add them to a product generic queue named balls
            if (code.equalsIgnoreCase("b")) {
                for (int i = 1; i <= 5; i++) {
                   Ball ball = new Ball("B" + i, "Bowling Ball " + i, 99.99 + i, "Color " + i);
                   queue.enqueue(ball);
                }

            // // Using an if...else if...else if...else check the argument against the values “s”
         } else if (code.equalsIgnoreCase("s")) {

            Show shoe1 = new Shoe();
            shoe1.setCode("S100");
            shoe1.setDescription("Men's Ram Black");
            shoe1.setPrice(39.99);
            shoe1.setSize("10.5");
            
            GenericQueue<Product> shoes = new GenericQueue<Product>();
            shoe.enqueue(shoe1);

         } else if {

            Show shoe2 = new Shoe();
            shoe2.setCode("S200");
            shoe2.setDescription("Women's Rise Black/Hot Pink");
            shoe2.setPrice(39.99);
            shoe2.setSize("7.0");
            
            GenericQueue<Product> shoes = new GenericQueue<Product>();
            shoe.enqueue(shoe2);

         } else if {

            Show shoe3 = new Shoe();
            shoe3.setCode("S300");
            shoe3.setDescription("Women's Path Lite Seamless Mesh");
            shoe3.setPrice(54.99);
            shoe3.setSize("6.0");
            
            GenericQueue<Product> shoes = new GenericQueue<Product>();
            shoe.enqueue(shoe3);

         } else if {

            Show shoe4 = new Shoe();
            shoe4.setCode("S400");
            shoe4.setDescription("Men's Tribal White");
            shoe4.setPrice(26.99);
            shoe4.setSize("8.5");
            
            GenericQueue<Product> shoes = new GenericQueue<Product>();
            shoe.enqueue(shoe4);

         } else if {   

            Show shoe5 = new Shoe();
            shoe5.setCode("S500");
            shoe5.setDescription("Youth Skull Green/Black");
            shoe5.setPrice(39.99);
            shoe5.setSize("3.0");
            
            GenericQueue<Product> shoes = new GenericQueue<Product>();
            shoe.enqueue(shoe5);

         }

            // For arguments that equal “s” create five (5) new shoe instances, set all four data fields with values, and add them to a product generic queue named shoes. For arguments that equal “a’ create three (3) new shoe instances, set all four data fields with values, and add them to a product generic queue named shoes.
            for (int i = 1; i <= 5; i++) {
               Shoe shoe = new Shoe("S" + i, "Bowling Shoe " + i, 49.99 + i, 8.5 + i);
               queue.enqueue(shoe);
            }

            // // Using an if...else if...else if...else check the argument against the value “a”
         } else if (code.equals("a")) {

            Show bag1 = new Bag();
            bag1.setCode("A100");
            bag1.setDescription("Pro Path Deluxe");
            bag1.setPrice(34.99);
            bag1.setType("Single");
            
            GenericQueue<Product> bags = new GenericQueue<Product>();
            shoe.enqueue(bag1);

         } else if {

            Show bag2 = new Bag();
            bag2.setCode("A200");
            bag2.setDescription("Prime Roller Black/Royal Blue");
            bag2.setPrice(54.99);
            bag2.setType("Double");
            
            GenericQueue<Product> bags = new GenericQueue<Product>();
            shoe.enqueue(bag2);

         } else if {

            Show bag3 = new Bag();
            bag3.setCode("A300");
            bag3.setDescription("Silver/Royal Blue");
            bag3.setPrice(74.99);
            bag3.setType("Triple");
            
            GenericQueue<Product> bags = new GenericQueue<Product>();
            shoe.enqueue(bag3);

         }

            // For all other arguments, return an empty product generic queue.
            for (int i = 1; i <= 3; i++) {
               Bag bag = new Bag("A" + i, "Bowling Bag " + i, 39.99 + i, i + "-ball");
               queue.enqueue(bag);
            }
         }
         
         return queue;
    }
}
