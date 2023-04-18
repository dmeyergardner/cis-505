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

(The GenericDao interface #2).Design and interface named GenericDao to represent the operations in a data persistence layer. The interface contains:
Figure 2.

(The ComposerDao interface #3). Design an interface named ComposerDao to represent the operations in a composer data persistence layer. This interface extends the GenericDao interface, using the Composer object and Integer as its generic arguments.
*/

public class Composer {
    private int id;
    private String name;
    private String genre;

// Default constructor
public Composer() {
this.id = 0;
this.name = "";
this.genre = "";
}

// Argument constructor
public Composer(int id, String name, String genre) {
this.id = id;
this.name = name;
this.genre = genre;
}

// Accessor methods
public int getId() {
return id;
}

public String getName() {
return name;
}

public String getGenre() {
return genre;
}

// toString method
@Override
public String toString() {
return "Composer ID: " + id + "\n" + "Composer Name: " + name + "\n" + "Composer Genre: " + genre;
}

public interface GenericDao<E, K>{
    List<E> findAll();
    E findby(K key);
    void insert(E entity);
}

public interface ComposerDao extends GenericDao<Composer, Integer>{
}

    

}

/* import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcComposerDao implements ComposerDao {
private Connection connection;

java
Copy code
public JdbcComposerDao(Connection connection) {
    this.connection = connection;
}

@Override
public List<Composer> findAll() {
    List<Composer> composers = new ArrayList<>();
    String query = "SELECT * FROM composers";
    try (PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String genre = resultSet.getString("genre");
            Composer composer = new Composer(id, name, genre);
            composers.add(composer);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return composers;
}

@Override
public Composer findBy(Integer key) {
    String query = "SELECT * FROM composers WHERE id = ?";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setInt(1, key);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String genre = resultSet.getString("genre");
            return new Composer(id, name, genre);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}

@Override
public void insert(Composer composer) {
    String query = "INSERT INTO composers (name, genre) VALUES (?, ?)";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, composer.getName());
        statement.setString(2, composer.getGenre());
        statement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
} */