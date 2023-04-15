/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023


1. A static method named getInt with a Scanner argument named sc and a string argument named prompt and an Integer return type. Add local variables for an Integer named input and a boolean named isValid. Set the input variable to 0 and isValid to false. Using a while loop check if isValid is false, display the contents of the prompt variable to the console, and use an if...else statement to check for Scanner hasNextInt(). For true comparisons, set the input variable to sc.nextLine and isValid to true. For false comparisons, display the message “Error! Invalid integer value.”
2. A static method named getDouble with a Scanner argument named sc and a string argument named prompt and a double return type. Using the code I provided in Figure 2.1, repeat the process, but this time check for double values (hint: use sc.hasNextDouble() and sc.nextDouble()).
3. A static method named getString with a Scanner argument named sc and a string argument named prompt and a string return type. Display the prompt message and use sc.next() to capture the user’s inputted value. Return the inputted value.

*/

import java.util.Scanner;

// class named ValidatorIO to validate invalid user entries
public class ValidatorIO {
    // static method named getInt with a Scanner argument named sc and a string argument named prompt and an Integer return type. Add local variables for an Integer named input and a boolean named isValid.
    public static int getInt(Scanner sc, String prompt) {
        // Set the input variable to 0 and isValid to false. 
        int input = 0;
        boolean isValid = false;

        // Using a while loop check if isValid is false, display the contents of the prompt variable to the console
        while (!isValid) {
            System.out.print(prompt);

            //use an if...else statement to check for Scanner hasNextInt(). 
            if (sc.hasNextInt()) { // Check if the user input is an integer
                input = sc.nextInt();
                // for true comparisons, set the input variable to sc.nextLine and isValid to true.
                isValid = true;
            } else {
                // for false comparisons, display the message “Error! Invalid integer value.”
                System.out.println("\n Error! Invalid integer value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    // static method named getDouble with a Scanner argument named sc and a string argument named prompt and a double return type. rompt and an Integer return type. 
    public static Double getDouble(Scanner sc, String prompt) {
        // Set the input variable to 0 and isValid to false. 
        Double input = 0.0;
        boolean isValid = false;

        // Using a while loop check if isValid is false, display the contents of the prompt variable to the console
        while (!isValid) {
            System.out.print(prompt);

            //use an if...else statement to check for Scanner hasNextInt(). 
            if (sc.hasNextDouble()) { // Check if the user input is a double
                input = sc.nextDouble();
                // for true comparisons, set the input variable to sc.nextLine and isValid to true.
                isValid = true;
            } else {
                // for false comparisons, display the message “Error! Invalid integer value.”
                System.out.println("\n Error! Invalid integer value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    // A static method named getString with a Scanner argument named sc and a string argument named prompt and a string return type. 
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        //Display the prompt message and use sc.next() to capture the user’s inputted value. 
        String input = sc.next();

        //Return the inputted value.
        return input;
    }
}
