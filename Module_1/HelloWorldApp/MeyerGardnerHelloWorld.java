package HelloWorldApp;

/*
 * Meyer-Gardner, D. 2023. CIS 505 Intermediate Java Programming. Bellevue University.
 */
public class MeyerGardnerHelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Create a program that output’s the String value “Hello World from YourFirstName YourLastName.”
        // Use String variables for the first and last name values.
        String yourFirstNameString = "Deborah";
        String yourLastNameString = "Meyer-Gardner";
        //Use printf to write the results to the System.out window.
        System.out.printf("Hello World from " + yourFirstNameString + " " + yourLastNameString); 
    }
}