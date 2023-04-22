import Composer.GenericDao;

/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a class named MemComposerDao to represent the operations in a composer data persistence layer. The class contains:
1. A private List<Composer> data field named composers. The default is a list of composer objects.
2. A no-argument constructor that creates a default list of five composer objects.
3. An overridden findAll method that returns a list of composer objects.
4. An overridden findBy method that returns a single composer object matching the
arguments id.
5. An overridden insert method that adds a new composer object to the list of composers.
*/

// class named MemComposerDao to represent the operations in a composer data persistence layer
public class MemComposerDao implements ComposerDao {
    // private List<Composer> data field named composers
    private List<Composer> composers;

// no-argument constructor that creates a default list of five composer objects
public MemComposerDao() {
    // default is a list of composer objects
    composers = new ArrayList<Composer>();

        Composer composer1 = new Composer();
        composer1.setId("1007");
        composer1.setName("Ludwig Van Beethoven");
        composer1.setGenre("Classical");

        Composer composer2 = new Composer();
        composer2.setId("1008");
        composer2.setName("Johann Sebastian Bach");
        composer2.setGenre("Classical");

        Composer composer3 = new Composer();
        composer3.setId("1009");
        composer3.setName("Wolfgang Amadeus Mozart");
        composer3.setGenre("Classical");

        Composer composer4 = new Composer();
        composer4.setId("1010");
        composer4.setName("Johannes Brahms");
        composer4.setGenre("Classical");

        Composer composer5 = new Composer();
        composer5.setId("1011");
        composer5.setName("Joseph Haydn");
        composer5.setGenre("Classical");

        GenericDao<Composer> composers = new GenericDao<Composer>();
        composers.enqueue(composer1);
        composers.enqueue(composer2);
        composers.enqueue(composer3);
        composers.enqueue(composer4);
        composers.enqueue(composer5);

        queue = composers;

}

// overridden findAll method that returns a list of composer objects
@Override
public List<Composer> findAll() {
    return composers;
}

// overridden findBy method that returns a single composer object matching the arguments id
@Override
public Composer findBy(String id) {
    for (Composer c : composers) {
        if (c.getId().equals(id)) {
            return c;
        }
    }
    return null;
}

// overridden insert method that adds a new composer object to the list of composers
@Override
public void insert(Composer composer) {
    composers.add(composer);
}

}