/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a class named TestComposerApp to test the classes Composer and MemComposerDao. The class contains:
1. Prompt the user with a menu 
2. If option one is selected, display a list of composers. Use the MemComposerDao classes findAll method.
3. If option two is selected, prompt the user to enter an id and display the selected composer object. Use the MemComposerDao classes findBy method.
4. If option 3 is selected, prompt the user to create a new composer. Use the MemComposerDao classes insert method.
*/

import java.util.Scanner;

// class named TestComposerApp to test the classes Composer and MemComposerDao
public class TestComposerApp {
    private static MemComposerDao dao = new MemComposerDao();
    private static Scanner scanner = new Scanner(System.in);

    int option = 0;
    
    do {
        //Display the menu to the user 
        displayMenu();

        // user entry 
        System.out.print("Please choose an option: ");
        option = input.nextLine();
        System.out.println("");
        
        while (option != 4) {
            displayMenu();
            option = readIntInput(1, 4);
            
            switch (option) {
                case 1:
                    viewComposers();
                    break;
                case 2:
                    findComposer();
                    break;
                case 3:
                    addComposer();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
            }
        }
    
    scanner.close();
}

// If option one is selected, display a list of composers 
private static void viewComposers() {
    System.out.println("--DISPLAYING COMPOSERS--");

    //Use the MemComposerDao classes findAll method
    for (Composer c : dao.findAll()) {
        System.out.println(c);
    }
}

//If option two is selected, prompt the user to enter an id and display the selected composer object 
private static void findComposer() {
    System.out.print("--FIND COMPOSER--");
    int id = readIntInput(1, Integer.MAX_VALUE);

    //Use the MemComposerDao classes findBy method
    Composer c = dao.findBy(id);
    if (c == null) {
        System.out.println("Composer not found.");
    } else {
        System.out.println(c);
    }
}

//If option 3 is selected, prompt the user to create a new composer 
private static void addComposer() {
    System.out.print("Enter nan id: ");
    String id = scanner.nextLine();
    System.out.print("Enter a name: ");
    String name = scanner.nextLine();
    System.out.print("Enter a genre: ");
    String genre = scanner.nextLine();
    
    //Use the MemComposerDao classes insert method.
    Composer c = new Composer(id, name, genre);
    dao.insert(c);
}

private static int readIntInput(int min, int max) {
    int value = 0;
    boolean validInput = false;
    while (!validInput) {
        try {
            value = Integer.parseInt(scanner.nextLine().trim());
            if (value >= min && value <= max) {
                validInput = true;
            } else {
                System.out.print("Invalid input! Please enter a number between " + min + " and " + max + ": ");
            }
        } catch (NumberFormatException e) {
            System.out.print("Invalid input! Please enter a number between " + min + " and " + max + ": ");
        }
    }
    return value;
}
    // Prompt the user with a menu
    public static void displayMenu() {
        
        System.out.println("");
        System.out.println("Welcome to the Composer App\n");
        System.out.println("");
        System.out.println("MENU OPTIONS:");
        System.out.println("  1. View Composers");
        System.out.println("  2. Find Composer");
        System.out.println("  3. Add Composer");
        System.out.println("  4. Exit");
        System.out.println("");
    }
}