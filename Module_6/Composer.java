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

// class named Composer to represent a composer
public class Composer implements GenericDao{
    //private integer data field named id
    private int id;
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
public Composer(int id, String name, String genre) {
    this.id = id;
    this.name = name;
    this.genre = genre;
}

// Accessor methods for all three data fields
public int getId() {
    return this.id;
}

public String getName() {
    return this.name;
}

public String getGenre() {
    return this.genre;
}

class GenericDao1 implements GenaricDao{
// Override the toString method. Return a string description of a composer with all three data fields, on separate lines.
@Override
public String toString() {
    return "ID: " + id + "\n" + "Name: " + name + "\n" + "Genre: " + genre;
}
}

/*
 * Interface
 * interface named GenericDao to represent the operations in a data persistence layer.
 */

public interface GenericDao<E, K>{
    List<E> findAll();
    E findby(K key);
    void insert(E entity);
}

/*
 * Interface
 * interface named ComposerDao to represent the operations in a composer data persistence layer. This interface extends the GenericDao interface, using the Composer object and Integer as its generic arguments.
 */

public interface ComposerDao extends GenericDao<Composer, Integer>{
}

}