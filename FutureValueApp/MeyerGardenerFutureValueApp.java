/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JFrame;
import javax.swing.JLabel;


//Extend the JavaFX Application object and setup the @Override start method with a single argument for the Stage object 
public class MeyerGardenerFutureValueApp extends Application {

  private TextField mp = new TextField();
  private TextField ir = new TextField();
    
  static JFrame f;
  static JLabel l;
  static JLabel btnClear;
  static JLabel btnCalculate;
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {

    /*
    * In the start() method, add a new GridPane object and set its alignment to Pos.CENTER, set its padding to 11.5, 12.5, 13.5, and 14.5. Next, set the panes Hgap to 5.5 and its Vgap to 5.5
    */
    // Create a pane and set its properties
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(5.5);
    grid.setVgap(5.5);
    grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

    // Place nodes in the pane
    pane.add(new Label("Monthly Payment"), 0, 0);
    pane.add(mp, 1, 0);
    pane.add(new Label("Interest Rate"), 0, 1);
    pane.add(ir, 1, 1);

    l = new JLabel("Years");
    pane.add(new Label("Years"), 0,2);

    Button btAdd = new Button("Calculate");
    pane.add(btAdd, 3, 3);
    Button btAddn = new Button("Clear");
    pane.add(btAddn, 0, 3);

    VBox layout = new VBox();
   TextArea jfxarea = new TextArea();
   jfxarea.setPrefColumnCount(10);
    jfxarea.setPrefHeight(75);
    jfxarea.setPrefWidth(150);
    

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
    ComboBox comboBox = new ComboBox();
    comboBox.getItems().add("15");
    comboBox.getItems().add("20");
    comboBox.getItems().add("30");

    //combobox staffs
    var yearCombo = new ComboBox();
    yearCombo.setItems(list);
    grid.add(yearCombo,1,4);

    // create two buttons
    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");
    
    //Stage and Scene set up
    Scene scene = new Scene(grid, 700, 300);
    primaryStage.setTitle("MeyerGardner Future Value App"); // set title for the stage
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  // Main method only needed for IDE with limited JavaFX support. Not needed for running from command line.
  public static void main(String[] args) { 
    launch(args);
  }
}