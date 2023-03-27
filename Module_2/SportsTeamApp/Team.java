/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/ 

public class Team {
    // data field named teamName that specifies the teams name, default is an empty string
    private String teamName;
    // array data field named players that specifies the players assigned to a team, default size is 20
    private String[] players = new String[20];
    // int data field named playerCount that specifies the number of players on a team, default is 0
    private int playerCount;

    
    // An argument constructor that creates a team using the teamName data field as an argument
    public Team(String teamName) {
        this.teamName = teamName;
    }
    
    // public method named addPlayer with a string argument that adds a player to the players data field. This method should increment the playerCount data field, so you are able to use the array’s index to add new players
    public void addPlayer(String playerName) {
        players[playerCount] = playerName;
        playerCount++;
    }

    // public string array method named getPlayers that returns the players data field
    public String[] getPlayers() {
        return players;
    }

    // public int method named getPlayerCount that returns the playerCount data field
    public int getPlayerCount(){
        return playerCount;
    }

    // public string method named getTeamName that returns the teamName data field
    public String getTeamName() {
        return teamName;
    }
} 
