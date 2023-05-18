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

public class MeyerGardnerEnhancedFutureValueApp {
    
}
