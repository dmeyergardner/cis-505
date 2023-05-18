/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

   Additional Java Programming Requirements
a. Add a private static int with the name MONTHS_IN_YEAR and give it a default
value of 12.
b. Create a static double method named calculateFutureValue with three parameters:
double monthlyPayment, double rate, and int years.
c. In the body of the method calculate the moths by taking the argument years and
multiplying it by the MONTHS_IN_YEAR variable.
d. Calculate the interest rate by using the formula in Exhibit A.
Exhibit A: (1 + rate / 100)
e. Calculate the presentValue by multiplying the monthlyPayment by the number of
months variable.
f. Calculate the futureValue by using the calculation in Exhibit B.
Exhibit B: presentValue * (Math.pow(interestRate, months)
a. Return the calculated futureValue
*/

package Module_8;

public class FinanceCalculator {
    private void clearFormFields() {

        private static final int MONTHS_IN_YEAR = 12;

        // Default no-arg constructor, all defaults are empty
        this.txtMonthlyPayment = "";
        this.txtInterestRate = "";
        this.txtResults = "";
        this.lblFutureValueDate = "";
        this.cbYears = 0;
    }
    private void calculateResults(double monthlyPayment, double rate, int years) {
        /*collects the users entered values and calls the calculateFutureValue method from the FinanceCalculator class. Set the lblFutureValueDate text to the string value “Calculation as of <today’s date>” and set the txtResults TextArea to the string value “The future value is <futureValue>” */
        int months = years * MONTHS_IN_YEAR;
        double interestRate = 1 + (rate / 100);
        double presentValue = monthlyPayment * months;
        double futureValue = presentValue * Math.pow(interestRate, months);
        return futureValue;
    }
    private void String() {
        /*Add a private String method that returns today’s date with the following format “MM/dd/yyyy.” The easiest way to do this is use the SimpleDateFormat object and pass-in the string pattern “MM/dd/yyyy.” Next, call the format() method off of the SimpleDateFormat object and pass-in a new Date() instance. The return value from this method will be used to show today’s date in the “Calculation as of <today’s date>” label.  */
    }
}
