/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Modified by Noah Pilkington
    Additional modifications by D. Meyer-Gardner 2023

    Provide users with a grade book form. Include the following fields: first name, last name, course, and grade (use A-F). For the grade field use a ComboBox with prefilled values.
Use labels to identify the forms fields.
Provide users with a button to clear the grade book form.
Provide users with a button to view saved grade entries.
Provide users with a button to save a grade book entry.
On form submission, write the entered values to a csv file named grades.csv. The grades.csv file should have a header row with values for “firstName, lastName, course, and grade.”
When a user selects the “view grades’ button, display the contents of the grades.csv file.
Use a Java class to hold the values from the gradebook form (firstName, lastName, course, and grade). Name the class Student and include private variables for the fields with two constructors: a default constructor and a parameterized constructor with the class’s properties. Add getter/setter methods for the class properties and Override the toString() method.
Use the Student classes toString() method to output the object to the results section of the GUI you create.
*/
package GradeBookApp;

import java.util.*;

public class MeyerGardnerGradeBookApp {
    public static void main(String[] args) {
        // 1. gets user input
        // 2. Verify user data
        // 3. Asks for user commands aka switch statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my grade book!");  // intro line

        // Get information of the first student
        System.out.println("Please enter the information of the first student using the following format: 'firstName lastName PID RoundedNumberGrade'.");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String firstName = parts[0];
        String lastName = parts[1];
        String pid = parts[2];
        int grade = Integer.parseInt(parts[3]);  // converts number grade to Int
//----------------------------------------------------------------------------------------------------
        // Verify the information of the student
        while (!isValid(firstName, lastName, pid, grade)) // if false, we re-run ask Info lines. If True, we move on to next code block
        {
            System.out.println("Invalid input. Please enter the information again using the correct format.");
            input = scanner.nextLine();
            parts = input.split(" ");

            firstName = parts[0];
            lastName = parts[1];
            pid = parts[2];
            grade = Integer.parseInt(parts[3]); // converts number grade to Int
        } // end of isValid check method

        // Adds valid info to Class objects if passes IsValid loop
        int pidInt = Integer.parseInt(pid); // Need to convert pid to an int to be valid for Student class
        String gradeString = Integer.toString(grade); // Need to convert grade e.g 93 -> "A" to a String to be valid for Student class

        // Adds values to Class objects.
        Grade gradeObj = new Grade(grade, gradeString); //int score, letter grade // Instantiate Grade class

        GradeBook gradeBook = new GradeBook(); // Instantiate GradeBook class
        Student person = new Student(firstName, lastName, pidInt, grade);
        gradeBook.addToArray(person);
//----------------------------------------------------------------------------------------------------

        // Ask for information of the next students
        while (true) {
            System.out.println("Please enter the information of the next student using the same format. If there is no more students, please enter the keyword 'DONE'.");
            input = scanner.nextLine();

            if (input.equals("DONE")) {
                break;
            }
            // IF not == DONE...
            parts = input.split(" ");
            firstName = parts[0];
            lastName = parts[1];
            pid = parts[2];
            grade = Integer.parseInt(parts[3]);

            // Verify the information of the next student
            if (!isValid(firstName, lastName, pid, grade))  // if IsValid is false
            {
                System.out.println("Invalid input. Please enter the information again using the correct format.");
            } else // create new object to add to Student,Grade and GradeBook Class
            {

//                // Adds values to Class objects.

                int pidInt2 = Integer.parseInt(pid); // Need to convert pid to an int to be valid for Student class
                String gradeString2 = Integer.toString(grade); // Need to convert grade e.g 93 -> "A" to a String to be valid for Student class

                // Adds values to Class objects.
                Grade gradeObj2 = new Grade(grade, gradeString2); //int score, letter grade // Instantiate Grade class

                //GradeBook gradeBook2 = new GradeBook(); // Instantiate GradeBook class
                Student person2 = new Student(firstName, lastName, pidInt2, grade);
                gradeBook.addToArray(person2);

            }

        } // end of while loop for secondary info
//----------------------------------------------------------------------------------------------------

        // While loop/ Switch statement so the user can access the Methods

        while (true) {
            System.out.println("List of commands:\n Minimum score: Press 1\n Max score: Press 2\n Minimum letter grade: Press 3\n Maximum letter grade: Press 4\n Letter grade with pid number search: Press 5\n Student full name with pid number search: Press 6\n Update grade: Press 7\n Average score: Press 8\n Average grade: Press 9\n Median grade: Press 10\n Tabulate scores: Press 11\n Tabular grades: Press 12\n Median Score: Press 13\n Quit: Press 14\n");
            System.out.println("Please enter a new numerical command value between 1 -> 14: ");

            int command = scanner.nextInt();

            switch (command)  //
            {
                case 1:
                    System.out.println("Minimum score: " + GradeBook.getMinScore()); //lowest score
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 2:
                    System.out.println("Max score: " + GradeBook.getMaxScore());  //highest score
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 3:
                    System.out.println("Minimum letter grade: " + GradeBook.getMinLetterGrade()); //lowest letter grade
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 4:
                    System.out.println("Max letter grade: " + GradeBook.getMaxLetterGrade()); //highest letter grade
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 5:
                    System.out.println("Please enter a 7 digit pid value to search for:");
                    int pidInput1 = scanner.nextInt(); //entered as a string
                    //Need Try and Catch for potential PID errors
                    System.out.println("Letter grade for: " + pidInput1 + " : " + GradeBook.getLetterGrade(pidInput1));  //for certain given pid, needs Int
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 6:
                    System.out.println("Please enter a 7 digit pid value to search for:");
                    int pidInput2 = scanner.nextInt(); //entered as a string
                    //Need Try and Catch for potential PID errors
                    System.out.println("Full name for pid number: " + pidInput2 + " is :  " + GradeBook.getFullName(pidInput2)); //print first and last name
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 7:
                    System.out.println("Please enter a 7 digit pid value to search for:");
                    int pidInput3 = scanner.nextInt(); //entered as a string
                    System.out.println("Please enter a new updated numerical grade between 0 and 100:");
                    int grdInput1 = scanner.nextInt(); //entered as a string

                    System.out.println("Updated grade for the student with pid number: " + pidInput3);
                    GradeBook.updateGrade(pidInput3, grdInput1); //updates grade getAverageScore
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 8:
                    System.out.println("Average score grade: " + GradeBook.getAverageScore()); //average score
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 9:
                    System.out.println("Average letter grade: " + GradeBook.getAverageLetterGrade());   //average letter grade
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 10:
                    System.out.println("Median letter grade: " + GradeBook.medianLetter());   //average letter grade
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 11:
                    GradeBook.printTabularScores();   //average letter grade
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 12:
                    GradeBook.printTabularLetters();   //average letter grade
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 13:
                    System.out.println("Median score: " + GradeBook.medianScore());   //median score
                    System.out.println("-----------------------------------\n\n");
                    break;
                case 14: //quit
                {
                    System.out.println("Program is ending, thank you...");
                    System.out.println("-----------------------------------\n\n");
                    return;
                }
                default:
                    System.out.println("Invalid number command, try again!");
                    System.out.println("-----------------------------------\n\n");
            }

        } //end of switch statement

    } // end of Main method


    //----------------------------------------------------------------------------------------------------
    private static boolean isValid(String firstName, String lastName, String pid, int grade)  // Verify the firstName, lastName, pid and grade according to the given criteria
    {
//----------------------------------------------------------------------------------------------------
        // first name check -> All letters, First letter Capital letter & no white space
        if (firstName == null || firstName.isEmpty()) {
            System.out.println("firstname is an Empty input");
            return false;
        }
        if (Character.isUpperCase(firstName.charAt(0)) == false)   // not Uppercase
        {
            System.out.println("firstnames, first letter is not a capital letter");
            return false;
        }

        // Check if the string contains only alphabetical characters
        for (int i = 1; i < firstName.length(); i++)  // i = 1 to skip index 0
        {
            if ((Character.isLetter(firstName.charAt(i)) == false) || (Character.isLowerCase(firstName.charAt(i)) == false))  // not a letter and not lower case
            {
                System.out.println("firstname contains a non-letter value or is not lower case");
                return false;
            }
        }// end of firstname check

//----------------------------------------------------------------------------------------------------
        // Check for lastname -> Can contain ".", All letters, First letter Capital letter & no white space

        if (lastName == null || lastName.isEmpty()) {
            System.out.println("lastname is an Empty input");
            return false;
        }
        if (Character.isUpperCase(lastName.charAt(0)) == false)
        {
            System.out.println("lastname first letter is not a capital letter");
            return false;
        }

        // Check if the string contains only alphabetical characters and at most one dot
        int dotCount = 0;
        for (int i = 1; i < lastName.length(); i++) {
            char c = lastName.charAt(i);
            if (c == '.') {
                dotCount++;
                if (dotCount > 1)   // fail
                {
                    System.out.println("lastname contains too many dots '.', you are only allowed 1 ");
                    return false;
                }
            } else if ((Character.isLetter(firstName.charAt(i)) == false) || (Character.isLowerCase(firstName.charAt(i)) == false))  // not a letter and not lower case
            {
                System.out.println("lastname contains a non-letter value or the chars after the first are not lower case");
                return false;
            }
        }
//----------------------------------------------------------------------------------------------------
        // Check pid -> 7 digits, no leading zeros

        if (pid == null || pid.isEmpty()) {
            System.out.println("pid is an Empty input");
            return false;
        }
        pid = pid.replaceAll("\\s", "");

        // Check if input contains non-numeric characters
        if (!pid.matches("[0-9]+")) {
            System.out.println("pid contain non-numeric characters ");
            return false;
        }

        // Check if input has leading zeros
        if (pid.length() > 1 && pid.charAt(0) == '0') {
            System.out.println("pid contains leading zeros ");
            return false;
        }

        // Check if input is longer than 7 digits
        if (pid.length() > 7) {
            System.out.println("pid is longer than 7 digits ");
            return false;
        }

        // Parse the input as an integer and return it
        int pidInt = Integer.parseInt(pid);

// ----------------------------------------------------------------------------------------------------
        // Grade Check

        try {
            if (grade < 0 || grade > 100)
            {
                System.out.println("Grade is out of bounds");
                return false;
            }
        } catch (NumberFormatException e)
        {
            System.out.println("Grade contains non-numeric characters");
            return false;
        }

        return true; // if valid, it will return true

    } // end of isValid checks
//----------------------------------------------------------------------------------------------------

} // end of Main Class
