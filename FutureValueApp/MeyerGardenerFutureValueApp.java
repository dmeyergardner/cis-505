
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


//Extend the JavaFX Application object 
public class MeyerGardenerFutureValueApp extends Application {

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {

    //In the start() method, add a new GridPane object and set its alignment to Pos.CENTER, set its padding to 11.5, 12.5, 13.5, and 14.5. Next, set the panes Hgap to 5.5 and its Vgap to 5.5


    // Add the controls to the GridPane. For the lblInterestRateFormat label, set the text fill to red and HPos to the right.
    lblInterestRateFormat.setTextFill(Color.RED); //Set the font color of the interest rate instructions to red
    pane.add(lblInterestRateFormat, 1, 2); //Add the label to the grid pane
    GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT); //Postition the label to the right of the pane

    //Add the clear and calculate buttons to an HBox with a spacing of 10 and a padding of 15, 0, 15, and 30.
    HBox actionBtnContainer = new HBox (); //Create new Hbox container
    actionBtnContainer.setPadding(new Insets(15, 0, 15, 30)) //set container padding
    actionBtnContainer.setSpacing(10); //set container spacing
    actionBtnContainer.getChildren().add(btnClear); //add btnClear to container
    actionBtnContainer.getChildren().add(btnCalculate); //add btnCalculate to container
    pane.add(actionBtnContainer, 1, 4); //add the container to the grid panel

    // set title for the stage
    s.setTitle("Future Value App");
 
    // create two textfield
    private TextField txtMonthlyPayment = new TextField();
    private TextField b = new TextField();

    // create a stack pane
    StackPane r = new StackPane();
 
    // add one textfield
    r.getChildren().add(b);

    // Create a combo box of type Integer
    //ComboBox combo_box = new ComboBox(FXCollections.observableArrayList(week_days));

    // create five label
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblYears = new Label("Years:");
    private Label lblClear = new Label("Clear");
    private Label lblCalculate = new Label("Calculate");

    // create two buttons
    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");

    // Weekdays
    //String week_days[] =
   // { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

    // create a scene
    Scene sc = new Scene(r, 200, 200);

    // Display stage
    primaryStage.show();
  }
  
  // Main method only needed for IDE with limited JavaFX support. Not needed for running from command line.
  public static void main(String[] args) { 
    launch(args);
  }
}