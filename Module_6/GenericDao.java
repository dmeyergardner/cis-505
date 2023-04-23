/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023
*/
import java.util.List;

// interface named GenericDao to represent the operations in a data persistence layer.

 public interface GenericDao<E, K>{
    List<E> findAll();
    E findBy(K key);
    void insert(E entity);
}

