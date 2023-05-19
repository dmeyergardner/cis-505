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

public class Student // keeps track of student data
{
    private String firstName;
    private String lastName;
    private int pid;
    private int grade;
    //private  int score;
//----------------------------------------------------------------------------------------------------
    // Getters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getPid()
    {
        return pid;
    }
    public int getGrade()
    {
        return grade;
    }

    //----------------------------------------------------------------------------------------------------
    //setters
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setPid(int pid)
    {
        this.pid = pid;
    }
    public void setGrade(int grade)
    {
        this.grade = grade;
    }

//----------------------------------------------------------------------------------------------------
    // CUSTOM CONSTRUCTOR

    Student(String firstName, String lastName, int pid, int grade)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pid = pid;
        this.grade =grade;
        //this.score = score;
    }
//----------------------------------------------------------------------------------------------------
    // Default constructor

    Student()
    {
        this.firstName = "";
        this.lastName = "";
        this.pid = 0;
        this.grade = 0;
    }
//----------------------------------------------------------------------------------------------------
} //end of student class
