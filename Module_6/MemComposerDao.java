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

public class MemComposerDao implements ComposerDao {
    private List<Composer> composers;

public MemComposerDao() {
    composers = new ArrayList<Composer>();
    composers.add(new Composer("1", "Bach", "Johann Sebastian", 1685, "Germany"));
    composers.add(new Composer("2", "Mozart", "Wolfgang Amadeus", 1756, "Austria"));
    composers.add(new Composer("3", "Beethoven", "Ludwig van", 1770, "Germany"));
    composers.add(new Composer("4", "Chopin", "Frédéric", 1810, "Poland"));
    composers.add(new Composer("5", "Debussy", "Claude", 1862, "France"));
}

@Override
public List<Composer> findAll() {
    return composers;
}

@Override
public Composer findBy(String id) {
    for (Composer c : composers) {
        if (c.getId().equals(id)) {
            return c;
        }
    }
    return null;
}

@Override
public void insert(Composer composer) {
    composers.add(composer);
}

}