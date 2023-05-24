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
	Use a Java class to hold the values from the gradebook form (firstName, lastName, course, and grade). Name the class Student and include private variables for the fields with two constructors: a default constructor and a parameterized constructor with the class’s properties. Add getter/setter methods for the class properties and Override the toString() method.
	Use the Student classes toString() method to output the object to the results section of the GUI you create.

	Build the Capstone Project’s user interface using JavaFX.
	Note: You are only building the User Interface portion of the project. 
	During Sprint 2 (module 11) you will be adding event handling. 
	
	add the appropriate event handlers to make the application fully functional.


*/

package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class MeyerGardnerGradeBookApp extends Application {
	
	// labels for all fields
	private Label lblFirstName = new Label("Student's First Name:");
	private Label lblLastName = new Label("Student's Last Name:");
	private Label lblCourse = new Label("Student's Course:");
	private Label lblGrade = new Label("Student's Grade:");
	private Label lblClear = new Label("Clear");
	private Label lblSave = new Label("Save");
	private Label lblView = new Label("View Grades");
		
	// text fields for student first and last name, student course
	private final TextField txtFirstName = new TextField();
	private final TextField txtLastName = new TextField();
	private final TextField txtCourseName = new TextField();
	
	// combobox (drop-down) choice options
	private String[] gradesCbo = {"A", "B", "C", "D", "F"};
	
	// combobox (drop-down) items of type string
	private ComboBox<String> cboGrade = new ComboBox<>();
	
	// create buttons
	private Button btnClear = new Button("Clear");
	private Button btnSave = new Button("Save");
	private Button btnView = new Button("View");
	
	// Extend the JavaFX Application object and setup the @Override start method with a single argument for the Stage object
	@Override
	public void start(Stage primaryStage) {
		
		// Create a pane and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		
		// Add the controls to the GridPane. .
		pane.add(lblFirstName, 0, 0);
		pane.add(txtFirstName, 1, 0);
		pane.add(lblLastName, 0, 1);
		pane.add(txtLastName, 1, 1);
		pane.add(lblCourse, 0, 3);
		pane.add(txtCourseName, 1, 3);
		pane.add(lblGrade, 0, 4);
		pane.add(cboGrade, 1, 4);
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void clearFormFields() {
		txtFirstName.setText("");
		txtLastName.setText("");
		txtCourseName.setText("");
        
		lblGrade.setText("Grades as of " + getCurrentDate());
        cboGrade.setValue(0);
    }
	
	public static void main(String[] args) {
		launch(args);
	}
	
	 @Override
     public void actionPerformed(ActionEvent e) {
         // TODO Auto-generated method actionPerformed'");
         calculateResults();
         clearFormFields();
     }
}
