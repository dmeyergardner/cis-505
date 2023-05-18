/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

Additional Java Programming Requirements
a. Create a private method named clearFormFields() with a return type of void. Set the
txtMonthlyPayment, txtInterestRate, txtResults, and lblFutureValueDate text values
to an empty string. Set the cbYears value to 0.
b. Create a private method named calculateResults that collects the users entered values
and calls the calculateFutureValue method from the FinanceCalculator class. Set the
lblFutureValueDate text to the string value “Calculation as of <today’s date>” and set
the txtResults TextArea to the string value “The future value is <futureValue>”
Exhibit C EnhancedFutureValueApp results
c. Add a private String method that returns today’s date with the following format
“MM/dd/yyyy.” The easiest way to do this is use the SimpleDateFormat object and
pass-in the string pattern “MM/dd/yyyy.” Next, call the format() method off of the
SimpleDateFormat object and pass-in a new Date() instance. The return value from
this method will be used to show today’s date in the “Calculation as of <today’s
date>” label.
Additional Java Programming Help
• Set the private methods to the onAction of the buttons
o btnClear event: btnClear.setOnAction(e -> clearFormFields());
o btnCalculate event: btnCalculate(e -> calculateResults()); 
*/

package Module_8;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MeyerGardnerEnhancedFutureValueApp {

    int futureValue;
    int calculateResults;
    Labeled lblFutureValueDate;
    JFrame frame = new JFrame();
    
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();
    private TextArea txtResults = new TextArea();
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblYears = new Label("Years:");   
    private Label lblInterestRateFormat = new Label("(Enter 11.1% as 11.1)");
    private ComboBox<Integer> cbYears = new ComboBox<>();
    
    Button btnCalculate = new Button("Calculate");
    Button btnClear = new Button("Clear");
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        
        // Add controls to the GridPane
        pane.add(lblMonthlyPayment, 0, 0);
        pane.add(txtMonthlyPayment, 1, 0);
        pane.add(lblInterestRate, 0, 1);
        pane.add(txtInterestRate, 1, 1);
        pane.add(lblInterestRateFormat,1,2 );
        pane.add(lblYears, 0, 3);
        pane.add(cbYears, 1, 3);
        pane.add(txtResults, 1,6 );
        
        // Add action buttons to an HBox
        HBox actionBtnContainer = new HBox(10);
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.getChildren().add(btnCalculate);
        actionBtnContainer.getChildren().add(btnClear);
        pane.add(actionBtnContainer,1,4);
        
        // Set the text fill to red and HPos to the right for lblInterestRateFormat label
        lblInterestRateFormat.setTextFill(Color.RED);
        GridPane.setHalignment(lblInterestRateFormat, javafx.geometry.HPos.RIGHT);
        
        // Set the ComboBox values
        for (int i = 0; i <= 30; i++) {
            cbYears.getItems().add(i);
        }
        
        // Set the primary stage's title
        primaryStage.setTitle("Future Value App");
        
        // Set the scene and show the stage
        Scene scene = new Scene(pane, 600, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
        }
        
        private void clearFormFields() {
            txtMonthlyPayment.setText("");
            txtInterestRate.setText("");
            txtResults.setText("");
            
            lblFutureValueDate.setText("Calculation as of " + getCurrentDate());
            cbYears.setValue(0);
        }
         
        private void calculateResults() {
            double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
            double rate = Double.parseDouble(txtInterestRate.getText());
            int years = cbYears.getValue();
            double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, rate, years);
            txtResults.setText("The future value is " + String.format("$%,.2f", futureValue));
            lblFutureValueDate.setText("Calculation as of " + getCurrentDate());
        }
        
        private String getCurrentDate() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            return dateFormat.format(new Date());
        }
        
        public static void main(String[] args) {
            new EnhancedFutureValueApp();
            Application.launch(args);
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method actionPerformed'");
            calculateResults();
            clearFormFields();
        }
}
