/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by D. Meyer-Gardner 2023

    Design a generic queue named GenericQueue. The Java class contains:

A private generic link list data field named list.
A public method named enqueue with a generic argument named item that adds the item to the list using the addFirst method.
A public method named dequeue with a generic return type that removes the first object in the queue using the removeFirst method.
A public method named size with a data return type of integer that specifies the size of the list using the size method.
*/ 

import java.util.LinkedList;

public class GenericQueue {
    
    // private generic link list data field named list
    private LinkedList<E> list = new LinkedList<E>();
    
    // public method named enqueue with a generic argument named item that adds the item to the list using the addFirst method
    public void enqueue(E item) {
        list.addFirst(item);
        }
        
        // public method named dequeue with a generic return type that removes the first object in the queue using the removeFirst method
        public E dequeue() {
            return list.removeFirst();
        }
        
        // public method named size with a data return type of integer that specifies the size of the list using the size method
        public int size() {
            return list.size();
        }
}
