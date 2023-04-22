public class TestFanApp {
    /*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. James 2015
    Additional modifications by D. Meyer-Gardner 2023

    Create a new file named TestFanApp with a main() method to test the Fan class. Create two instances of the Fan class, one using the default constructor and the other using the argument constructor. For the second argument constructor, use the classes constants to set the speed. Display the objects by invoking the classes toString() method.
*/ 

public static void main(String[] args) {
    // Create two Fan objects, one using the default constructor and the other using the argument constructor. For the second argument constructor, use the classes constants to set the speed. Display the objects by invoking the classes toString() method.
    Fan fan1 = new Fan();
    Fan fan2 = new Fan(Fan.MEDIUM,true, 8,"blue");

    System.out.println(fan1.toString());
    System.out.println(fan2.toString());
    }   
}
