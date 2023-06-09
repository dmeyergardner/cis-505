/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Modified by Noah Pilkington
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

	Use a Java class to hold the values from the gradebook form (firstName, lastName, course, and grade).
	Name the class Student and include private variables for the fields with two constructors:
	a default constructor and a parameterized constructor with the class’s properties.
	Add getter/setter methods for the class properties and Override the toString() method.

	Use the Student classes toString() method to output the object to the results section of the GUI you create.

	Build the Capstone Project’s user interface using JavaFX.

	add the appropriate event handlers to make the application fully functional.
*/

package application;

public class Student // keeps track of student data
{
    private String firstName;
    private String lastName;
    private String course;
    private String grade;

/* ----- GETTER METHODS ----- */
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public String getCourse()
    {
        return this.course;
    }
    public String getGrade()
    {
        return this.grade;
    }
/* ----- SETTER METHODS ----- */
    public void setFirstName(String fn)
    {
        this.firstName = fn;
    }
    public void setLastName(String ln)
    {
        this.lastName = ln;
    }
    public void setCourse(String c)
    {
        this.course = c;
    }
    public void setGrade(String g)
    {
        this.grade = g;
    }
	
/* ----- CUSTOM CONSTRUCTOR ----- */
    Student(String fn, String ln, String c, String g)
    {
        this.firstName = fn;
        this.lastName = ln;
        this.course = c;
        this.grade =g;
        //this.score = score;
    }
/* ----- DEFAULT CONSTRUCTOR ----- */
    Student()
    {
        this.firstName = "";
        this.lastName = "";
        this.course = "";
        this.grade = "";
    }
    
/* ----- OVERRIDE TOSTRING METHOD ON COMPILE ----- */
   @Override
	public String toString() {
   		return("Student: " + this.getFirstName() + " " + this.getLastName() + "\nCourse: " + this.getCourse() + "\nGrade: " + this.getGrade() + "\n");
	}
} //end of student class