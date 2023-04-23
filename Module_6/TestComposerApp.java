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
    public static void main(String[] args) {

        MemComposerDao dao = new MemComposerDao();
    
        Scanner sc = new Scanner(System.in);
        int option = 0;

        System.out.println("");
        System.out.println("Welcome to the Composer App\n");
        
        do {
            //Display the menu to the user 
            displayMenu();

            // default null
            Integer id;
            String name;
            String genre;
            Composer c;

            // user entry 
            System.out.print("Please choose an option: ");
            option = sc.nextInt();
            System.out.println("");

            switch (option) {
                case 1:
                    viewComposers(dao);
                    break;
                case 2:
                    //If option two is selected, prompt the user to enter an id and display the selected composer object
                    System.out.print("Enter an id: ");
                    id = sc.nextInt();
                    System.out.println("\n--DISPLAYING COMPOSER--");

                    //Use the MemComposerDao classes findBy method
                    c = dao.findBy(id);
                        if (c == null) {
                            System.out.println("Composer not found.");
                            System.out.println("");
                        } else {
                            System.out.println(c);
                            System.out.println("");
                        }
                    break;

                case 3:
                    //If option 3 is selected, prompt the user to create a new composer 
                    System.out.print("Enter an id: ");
                    id = sc.nextInt();
                    String newline = sc.nextLine();
                    System.out.print("Enter a name: ");
                    name = sc.nextLine();
                    System.out.print("Enter a genre: ");
                    genre = sc.nextLine();
                        
                        //Use the MemComposerDao classes insert method.
                        c = new Composer(id, name, genre);
                        dao.insert(c);
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                // If the user inputs an invalid character, print out this error message
                default:
                System.out.println("Invalid option. Please enter a number 1, 2, 3, or 4.");
                break;
            }
        }
            while (option != 4); 
            sc.close(); 
    }

    // If option one (1) is selected, display a list of composers 
    private static void viewComposers(MemComposerDao d) {
        System.out.println("--DISPLAYING COMPOSERS--");

        //Use the MemComposerDao classes findAll method
        for (Composer c : d.findAll()) {
            System.out.println(c);
            System.out.println("");
        }
    }
    
// Prompt the user with a menu
    public static void displayMenu() {
        
        System.out.println("");
        System.out.println("MENU OPTIONS:");
        System.out.println("  1. View Composers");
        System.out.println("  2. Find Composer");
        System.out.println("  3. Add Composer");
        System.out.println("  4. Exit");
        System.out.println("");
    }
}