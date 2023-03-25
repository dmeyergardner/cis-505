/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

9. Create a new file named TestSportsTeamApp with a main() method to test the Team class.
Prompt the user to enter the team and player names. For the player names, accept a string of first names, separated by commas without spaces. Use the inputted values to create a new instance of the Team class and use the player names to invoke the addPlayer method. Display the results on two separate lines using the format “Number of players in team <playerCount>” and “Players on team: <players>.” Allow the user to enter as many teams and players as they choose by prompting them to decide between continuing or exiting the program. Use a while loop in your programming logic.

Programming hints/how-to:
User prompts are handled through the Scanner class (util.Scanner). Use a while loop to check whether the user wishes to continue. Use the Array.split(“,”) method to covert the user entered players string into a string array of players. Next, use a for loop to iterate over the string array of players and invoke the addPlayer method. Reverse this process to display the “Players on team.”

Special note. Spacing is two spaces from the left. Make sure your output/display is neat and matches the spacing and line spaces I have in the screenshots. This is a gradable requirement and designed to teach the importance of focusing on the details of a requirement. Two-four spaces from the left are applied to all programs in this course.

*/ 
import java.util.Scanner;  // Import the Scanner class

public class TestSportsTeamapp {
    public static void main(String[] args) {
        Scanner teamName = new Scanner(System.in);  // Create a team name Scanner object
        Scanner playerName = new Scanner(System.in);  // Create a player name Scanner object
        
        System.out.println("Welcome to the Sports Team App");
        System.out.println("");
        System.out.println("Enter team name:  "); // enter team name
        System.out.println("");
        System.out.println("Enter players names:");
        System.out.println("  hint: use commas for multiple players; no spaces>:  " + playerName);
        System.out.println("");

        String teamName = myObj.nextLine();  // Read team name user input

        System.out.println("--Team Summary--");
        System.out.println("Number of players on the team:  " + getNumberOfPlayers());  // Output team numbers from team player user input
        String[] players = getPlayerName();
        for (int i = 0; i < getNumberOfPlayers(); i++)
        System.out.println("Players on the team:  "+ playerName);
        
        System.out.println("");
        System.out.println("Continue? (y/n):  ");
        System.out.println("");
        System.out.println("End of line...");
    }
}
