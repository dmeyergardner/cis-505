/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Modified by Noah Pilkington
    Modified by Menai Ala Eddine 
    Additional modifications by D. Meyer-Gardner 2023

Capstone Project Requirements
	Name the project folder GradeBookApp.
	Name the program file YourLastNameGradeBookApp.java.
	Use GitHub to store the project.
	
	Provide users with a grade book form. Include the following fields: first name, last name, course, and grade (use A-F). 
	For the grade field use a ComboBox with prefilled values.
	Use labels to identify the forms fields.
	Provide users with a button to clear the grade book form.
	Provide users with a button to view saved grade entries.
	Provide users with a button to save a grade book entry.
	On form submission, write the entered values to a csv file named grades.csv. 
	The grades.csv file should have a header row with values for “firstName, lastName, course, and grade.”
	When a user selects the “view grades’ button, display the contents of the grades.csv file.
	Use a Java class to hold the values from the gradebook form (firstName, lastName, course, and grade). Name the class Student and include private variables for the fields with two constructors: a default constructor and a parameterized constructor with the class’s properties. Add getter/setter methods for the class properties and Override the toString() method.
	Use the Student classes toString() method to output the object to the results section of the GUI you create.

	Build the Capstone Project’s user interface using JavaFX.
	Note: You are only building the User Interface portion of the project. 
	During Sprint 2 (module 11) you will be adding event handling. 
	
	add the appropriate event handlers to make the application fully functional.


*/

package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @web http://java-buddy.blogspot.com/
 */
public class csvRead {
    
    static String CsvFile = "/home/buddy/test/test.csv";
    static String FieldDelimiter = ",";

    public static void main(String[] args) throws IOException {
        BufferedReader br;
        
        try {
            br = new BufferedReader(new FileReader(CsvFile));
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(FieldDelimiter, -1);
                System.out.print(fields.length + "-");
                for(String s : fields){
                    System.out.print(s);
                    System.out.print(":");
                }
                System.out.println();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(csvRead.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
}
