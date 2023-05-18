
/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

   4. Extend the JavaFX Application object and setup the @Override start method with a single argument for the Stage object. Exhibit B @Override start(Stage primaryStage)
5. Create private variables for two TextField’s, one TextArea, five Labels, one ComboBox of type Integer, and two Button’s.
    a. Set the text for the labels to match the labels in Exhibit A. Exhibit C Labels with a default text value
    b. Set the text for the buttons to match the buttons in Exhibit A. Exhibit D Buttons with a default text value   
   c. In the start() method, add a new GridPane object and set its alignment to Pos.CENTER, set its padding to 11.5, 12.5, 13.5, and 14.5. Next, set the panes Hgap to 5.5 and its Vgap to 5.5.
    d. Add the controls to the GridPane. For the lblInterestRateFormat label, set the text fill to red and HPos to the right. Exhibit E lblInterestRateFormat
    e. Add the clear and calculate buttons to an HBox with a spacing of 10 and a padding of 15, 0, 15, and 30. Exhibit F actionBtnContainer
    f. Set the primary stages title to “YourLastName Future Value App.”
*/

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//Extend the JavaFX Application object and setup the @Override start method with a single argument for the Stage object 
public class MeyerGardenerFutureValueApp extends Application {
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {

    // set title for the stage
    primaryStage.setTitle("MeyerGardner Future Value App");
    primaryStage.show();

    /*
    * In the start() method, add a new GridPane object and set its alignment to Pos.CENTER, set its padding to 11.5, 12.5, 13.5, and 14.5. Next, set the panes Hgap to 5.5 and its Vgap to 5.5
    */
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(5.5);
    grid.setVgap(5.5);
    grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

    Scene scene = new Scene(grid, 700, 300);
    primaryStage.setScene(scene);

    /* 
    * Add the controls to the GridPane. For the lblInterestRateFormat label, set the text fill to red and HPos to the right.
    */
    lblInterestRateFormat.setTextFill(Color.RED); //Set the font color of the interest rate instructions to red
    pane.add(lblInterestRateFormat, 1, 2); //Add the label to the grid pane
    GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT); //Postition the label to the right of the pane

    /*
    Add the clear and calculate buttons to an HBox with a spacing of 10 and a padding of 15, 0, 15, and 30.
    */
    HBox actionBtnContainer = new HBox (); //Create new Hbox container
    actionBtnContainer.setPadding(new Insets(15, 0, 15, 30)) //set container padding
    actionBtnContainer.setSpacing(10); //set container spacing
    actionBtnContainer.getChildren().add(btnClear); //add btnClear to container
    actionBtnContainer.getChildren().add(btnCalculate); //add btnCalculate to container
    pane.add(actionBtnContainer, 1, 4); //add the container to the grid panel

    /*
     * Create private variables for two TextField’s, one TextArea, five Labels, one ComboBox of type Integer, and two Button’s.
     */
     // create two textfield
    private TextField txtMonthlyPayment = new TextField();
    private TextField b = new TextField();
 
    //textArea
    TextArea text = new TextArea();

    // create five label
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblYears = new Label("Years:");
    private Label lblClear = new Label("Clear");
    private Label lblCalculate = new Label("Calculate");

    /*
    * one ComboBox of type Integer
    */
    //combobox items
    ObservableList<String> list = FXCollections.observableArrayList("1","2","3","4");

    //combobox staffs
    var yearCombo = new ComboBox();
    yearCombo.setItems(list);
    grid.add(yearCombo,1,4);

    // create two buttons
    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");
  }
  
  // Main method only needed for IDE with limited JavaFX support. Not needed for running from command line.
  public static void main(String[] args) { 
    launch(args);
  }
}