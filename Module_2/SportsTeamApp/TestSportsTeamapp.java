/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/ 
import java.util.Scanner;  // Import the Scanner class

public class TestSportsTeamapp { //test the Team class
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    
    boolean keepGoing = true;
    while (keepGoing) {  // while loop if user wants to keep using the program or exit
        System.out.println("");
        System.out.println("  Welcome to the Sports Team App");
        System.out.println("");
        System.out.print("  Enter the team name: "); //Prompt the user to enter the team name
        String teamName = scanner.nextLine(); // Create a team name Scanner object
        System.out.println("");
        
        Team team = new Team(teamName);
        
        System.out.println("  Enter the player names separated by commas: "); //Prompt the user to enter the player names
        System.out.print("    hint: use commas for multiple players; no spaces>:  ");
        String playerNames = scanner.nextLine(); // Create a player name Scanner object

        //Use the inputted values to create a new instance of the Team class and use the player names to invoke the addPlayer method
        String[] players = playerNames.split(","); 
        for (int i = 0; i < players.length; i++) {
            team.addPlayer(players[i]);
        }
        
        System.out.println("");
        System.out.println("  --Team Summary--");
        System.out.println("  Number of players in team " + team.getPlayerCount()); // Output team numbers from team player user input
        System.out.print("  Players on team: ");
        
        //Use the inputted values to create a new instance of the Team class and use the player names to invoke the addPlayer method
        String[] teamPlayers = team.getPlayers();
        for (int i = 0; i < team.getPlayerCount(); i++) {
            System.out.print(teamPlayers[i] + " ");
        }
        System.out.println();
        
        System.out.println("");
        System.out.print("  Do you want to continue? (y/n) ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("n")) {
            keepGoing = false;
            System.out.println("");
            System.out.println("  End of line...");
        }
    }
    scanner.close();
    }

}
