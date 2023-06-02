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
	-a default constructor and a parameterized constructor with the class’s properties.
	-Add getter/setter methods for the class properties and Override the toString() method.

	Use the Student classes toString() method to output the object to the results section of the GUI you create.

	Build the Capstone Project’s user interface using JavaFX.
	
	add the appropriate event and error handlers to make the application fully functional.


*/

package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MeyerGardnerGradeBookApp extends Application {

/* ----- FIRST NAME ----- */
	private Label lblFirstName = new Label("Student's First Name:"); // label
	private final TextField txtFirstName = new TextField(); // text field
/* ----- LAST NAME ----- */
	private Label lblLastName = new Label("Student's Last Name:"); // label
	private final TextField txtLastName = new TextField(); // text field
/* ----- COURSE ----- */
	private Label lblCourse = new Label("Student's Course:"); // label
	private final TextField txtCourseName = new TextField(); // text field
/* ----- GRADE ----- */
	private Label lblGrade = new Label("Student's Grade:"); // label
	private String[] gradesCbo = {"A", "B", "C", "D", "F"}; // combobox (drop-down) items of type string
    	private ComboBox<String> cboGrade = new ComboBox<>(); // storing new combobox (drop-down) items of type string
/* ----- BUTTONS ----- */	
	private Button btnClear = new Button("Clear");
	private Button btnSave = new Button("Save");
	private Button btnView = new Button("View");

	// output area
	private TextArea txt = new TextArea();

	// Extend the JavaFX Application object and setup the @Override start method with a single argument for the Stage object
	@Override
	public void start(Stage primaryStage) {

/* ----- SET UP A GUI FX PANE AND PROPERTIES ----- */
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
        	
/* ----- EVENT HANDLERS ----- */
		this.cboGrade.getItems().addAll(gradesCbo); // grab this combobox entry
		
		students.remove(0); //removes header row from arraylist
			for (Student s:students) {
				// **** REPLACE WITH ACTUAL OUTPUT ****
				//placeholder to validate reading of file
				//System.out.println(s.toString());
				// **** REPLACE WITH ACTUAL OUTPUT ****
				
				//text Box output for pane
				txt.appendText(s.toString());
				txt.appendText("\n");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
/* ----- BUTTONS HANDLERS ----- */
	// Clear button action
		btnClear.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	clearFormFields();
		    }
		});
	// Save Button
		btnSave.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				try {
					writeCSV(new Student(txtFirstName.getText(),txtLastName.getText(),txtCourseName.getText(),cboGrade.getValue()));
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
	// View Button
		btnView.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				
				// do a view action here
				ArrayList<Student> students = new ArrayList<>();
				try {
					students = readCSV();
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
					
/* ----- SET UP A GUI FX HBOX AND PRPERTIES  ----- */
		//txt.setPrefColumnCount(30);
		//txt.setPrefHeight(20);
		txt.setPrefSize(500, 300);
		txt.setEditable(false);
					
	// Add the controls to the GridPane
		pane.add(lblFirstName, 0, 0);
		pane.add(txtFirstName, 1, 0);
		pane.add(lblLastName, 0, 1);
		pane.add(txtLastName, 1, 1);
		pane.add(lblCourse, 0, 3);
		pane.add(txtCourseName, 1, 3);
		pane.add(lblGrade, 0, 4);
		pane.add(cboGrade, 1, 4);
		pane.add(txt, 1, 6);

	// Add action buttons to an HBox
        	HBox actionBtnContainer = new HBox(10);
        	actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        	actionBtnContainer.getChildren().add(btnSave);
        	actionBtnContainer.getChildren().add(btnClear);
        	actionBtnContainer.getChildren().add(btnView);
        	pane.add(actionBtnContainer,1,5);
		
/* ----- SET THE GUI FX SCENE AND SHOW STAGE ----- */
		try {
			Scene scene = new Scene(pane,700,700);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Meyer-Gardner Gradebook App");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	// CLEAR All fields
	private void clearFormFields() {
		txtFirstName.setText("");
		txtLastName.setText("");
		txtCourseName.setText("");
        	cboGrade.setValue("");
        	txt.clear();
    	}

	public static void main(String[] args) {
		launch(args);
	}

	/* public void actionPerformed(ActionEvent e) {
         // TODO Auto-generated method actionPerformed'");
         clearFormFields();
     }
*/
	
/* ----- CSV READ AND WRITE ----- */
	
	// Begin writeCSV
	public static void writeCSV(Student s) throws java.io.IOException {
		/* if file is new with no records, add header row,
		  otherwise just append student info in new line

		  input: Student
		  output: write to file grades.csv
		  */
		Writer writer = null;
		try {
			File file = new File("grades.csv");
			writer = new BufferedWriter(new FileWriter(file, true));
			if(file.length()==0) {
	        	//println only for testing. Remove before final compile
				System.out.println("File is empty");
				writer.write("FirstName,LastName,Course,Grade");
	        	writer.write(System.getProperty("line.separator"));
	        }
			writer.write(s.getFirstName() + "," + s.getLastName() + "," + s.getCourse() + "," + s.getGrade());
			writer.write(System.getProperty("line.separator"));
			writer.close();
		} catch(IOException ex){
			ex.printStackTrace();
		}
	} // end writeCSV
	
	// Begin readCSV
	public ArrayList<Student> readCSV() throws java.io.IOException {
		ArrayList<Student> students = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("grades.csv"))) {
			String line = new String();
			while ((line = br.readLine())!= null) {
				String[] s = line.split(","); //splits each line by comma into a String array of each part
				students.add(new Student(s[0],s[1],s[2],s[3]));
			}
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		return students;
	} //end readCSV
}
