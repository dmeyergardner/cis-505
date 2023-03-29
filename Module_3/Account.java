/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a class named Account to represent an account. This class contains:
1. A private double data field named balance. The default is 200.
2. An accessor method for the balance data field.
3. A public method named deposit with a double argument named amt and a return type of
void. Increase the running total of the balance data field using the methods argument.
4. A public method named withdraw with a double argument named amt and a return type
of void. If the balance data field is greater than or equal to the argument, decrease the
running total of the balance field using the methods argument.
5. A public method named displayMenu with a return type of void. Print a menu matching
the format in figure 3.5.
6. A public method named getTransactionDate with a return type of string. Return a date using the format MM-dd-yyyy.
*/ 
public class Account {
    private double balance;

    public Account() {
    this.balance = 200;
    }

    public double getBalance() {
    return this.balance;
    }

    public void deposit(double amt) {
    this.balance += amt;
    }

    public void withdraw(double amt) {
    if (this.balance >= amt) {
    this.balance -= amt;
    }
    }

    public void displayMenu() {
    System.out.println("=======MENU=======");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");
    System.out.println("4. Exit");
    }

    public String getTransactionDate() {
    DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
    Date date = new Date();
    return dateFormat.format(date);
    }
}