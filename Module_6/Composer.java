/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a class named Composer to represent a composer. This class contains:
1. A private integer data field named id. The default is an empty string.
2. A private string data field named name. The default is an empty string.
3. A private string data field named genre. The default is an empty string.
4. A no-argument constructor that creates a default composer.
5. An argument constructor that creates a composer using all three data fields.
6. Accessor methods for all three data fields.
7. Override the toString method. Return a string description of a composer with all three
data fields, on separate lines.
*/

// class named Composer to represent a composer
public class Composer{

    //private integer data field named id
    private Integer id;

    // private string data field named name
    private String name;

    //private string data field named genre
    private String genre;

    // Default no-arg constructor, all defaults are empty
    public Composer() {
        this.id = 0;
        this.name = "";
        this.genre = "";
    }

    // Argument constructor that creates a composer using all three data fields
    public Composer(Integer id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    // Accessor methods for all three data fields
    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getGenre() {
        return this.genre;
    }


    // Override the toString method. Return a string description of a composer with all three data fields, on separate lines.
    @Override
    public String toString() {
        return "ID: " + id + "\n" + "Name: " + name + "\n" + "Genre: " + genre;
    }
}