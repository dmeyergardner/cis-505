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

public class Grade {
    private static int score;
    private static String letterGrade;
//----------------------------------------------------------------------------------------------------
    //Getters
    public static int getScore() //Numerical e.g 99
    {
        return score;
    }
    public static String getLetterGrade()
    {
        return letterGrade;
    }
//----------------------------------------------------------------------------------------------------
    // Setters
    public void setScore(int score)
    {
        this.score= score;
    }
    public static String setLetterGrade(int score)
    {
        // sets letterGrade variable to correct string letter, depending on score value.
        if (score >= 90)
        {
            return "A";
        } else if (score >= 85) {
            return "A-";
        } else if (score >= 80) {
            return "B+";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 70) {
            return "B-";
        } else if (score >= 65) {
            return "C+";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 55) {
            return "C-";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }


//----------------------------------------------------------------------------------------------------
    // Default constructor

    Grade()
    {
        this.score = 0;
        this.letterGrade = "";
    }
    // Custom constructor
    Grade(int score, String letterGrade)
    {
        this.score = score;
        this.letterGrade = letterGrade;
    }
//----------------------------------------------------------------------------------------------------

}// end of classespackage.Grade class
