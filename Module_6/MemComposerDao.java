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

import java.util.ArrayList;
import java.util.List;


// class named MemComposerDao to represent the operations in a composer data persistence layer
public class MemComposerDao implements ComposerDao{

    // private List<Composer> data field named composers
    private List<Composer> composers;

    // no-argument constructor that creates a default list of five composer objects
    public MemComposerDao() {

        // default is a list of composer objects
        this.composers = new ArrayList<Composer>();

            Composer composer1 = new Composer(1007,"Ludwig Van Beethoven", "Classical");
            this.composers.add(composer1);

            Composer composer2 = new Composer(1008,"Johann Sebastian Bach","Classical");
            this.composers.add(composer2);

            Composer composer3 = new Composer(1009,"Wolfgang Amadeus Mozart","Classical");
            this.composers.add(composer3);

            Composer composer4 = new Composer(1010,"Johannes Brahms","Classical");
            this.composers.add(composer4);

            Composer composer5 = new Composer(1011,"Joseph Haydn","Classical");
            this.composers.add(composer5);
  
    } 
    // overridden findAll method that returns a list of composer objects
    @Override
    public List<Composer> findAll() {
        return composers;
    }

    // overridden findBy method that returns a single composer object matching the arguments id
    @Override
    public Composer findBy(Integer id) {
        for (Composer c : this.composers) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    // overridden insert method that adds a new composer object to the list of composers
    @Override
    public void insert(Composer entity) {
       this.composers.add(entity);
    }
}