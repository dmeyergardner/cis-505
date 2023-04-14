/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    (The TransactionIO class #3). Design a Java class named TransactionIO for reading and writing transactions to a text file. The class contains:
1. A private string constant data field named FILE_NAME. The default value is “expenses.txt”
2. A private File data field name file. The default value is a new File instance. Use the FILE_NAME constant as the argument for the new file instance.
3. A public static method named bulkInsert with an ArrayList<Transaction> argument named transactions and a return type of void. Give the signature of this method a “throws IOException.” In the body of the function, create a new PrintWriter variable named output and set the default value to null. Using an if...else statement, check if the file exists. For true comparisons, assign a new PrintOutStream to the output variable. For false comparison, set output to a new PrintWriter instance. Use the FILE_NAME constant as the PrintWriter instances argument. Finally, iterate over the transactions argument and write the objects to the file using the output.print and output.println() methods.
4. A public static method named findAll with a return type of ArrayList<Transaction>. Give the signature of this method a “throws IOException.” In the body of the method, open the expenses.txt file, iterate over the lines, and return an ArrayList of transactions. Special note. Invoke Scanner input = new Scanner(file) to open the expenses.txt file. Use while (input.hasNext()) to iterate over the file and assign the data fields to a new instance of a transaction object. Add this object to an ArrayList of transactions and return it.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    private static final String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;

        if (file.exists()) { // If the file exists, append the transactions to it
            output = new PrintWriter(file);
        } else {
            output = new PrintWriter(FILE_NAME);
        }

        for (Transaction transaction : transactions) {
            output.print(transaction.getDate() + ",");
            output.print(transaction.getDescription() + ",");
            output.print(transaction.getAmount());
            output.println();
        }

        output.close();
    }

    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String line = input.nextLine();
            String[] data = line.split(",");

            String date = data[0];
            String description = data[1];
            double amount = Double.parseDouble(data[2]);

            Transaction transaction = new Transaction(date, description, amount);
            transactions.add(transaction);
        }

        input.close();
        return transactions;
    }
}
