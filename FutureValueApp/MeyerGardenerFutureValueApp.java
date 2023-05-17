
/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Download and install the JavaFX SDK.
2. Add a new folder to your cis-505 repository and name it FutureValueApp.
3. Add a new file to the FutureValueApp folder and name it YourLastNameFutureValueApp.java.
4. Extend the JavaFX Application object and setup the @Override start method with a single argument for the Stage object. Exhibit B @Override start(Stage primaryStage)
5. Create private variables for two TextField’s, one TextArea, five Labels, one ComboBox of type Integer, and two Button’s.

Additional Java Programming Requirements
a. Set the text for the labels to match the labels in Exhibit A. Exhibit C Labels with a default text value
b. Set the text for the buttons to match the buttons in Exhibit A. Exhibit D Buttons with a default text value   
c. In the start() method, add a new GridPane object and set its alignment to Pos.CENTER, set its padding to 11.5, 12.5, 13.5, and 14.5. Next, set the panes Hgap to 5.5 and its Vgap to 5.5.
d. Add the controls to the GridPane. For the lblInterestRateFormat label, set the text fill to red and HPos to the right. Exhibit E lblInterestRateFormat
e. Add the clear and calculate buttons to an HBox with a spacing of 10 and a padding of 15, 0, 15, and 30. Exhibit F actionBtnContainer
f. Set the primary stages title to “YourLastName Future Value App.”
*/



public class MeyerGardenerFutureValueApp extends Application {

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {

    // set title for the stage
    s.setTitle("Future Value App");
 
    // create a textfield
    private TextField txtMonthlyPayment = new TextField();
    private TextField b = new TextField();

    // create a stack pane
    StackPane r = new StackPane();
 
    // add textfield
    r.getChildren().add(b);

    // create a label
    private Label lblMonthlyPayment = new Label("Monthly Payment");
    private Label lblInterestRate = new Label("Interest Rate");
    private Label lblYears = new Label("Years");
    private Label lblClear = new Label("Clear");
    private Label lblCalculate = new Label("Calculate");

    // Weekdays
    String week_days[] =
    { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

    // Create a combo box
    ComboBox combo_box = new ComboBox(FXCollections.observableArrayList(week_days));

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