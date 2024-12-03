package generics;

// Write a parameterized class LinkedList
public class MyLinkedList<T> {
    // FILL IN CODE:
    // Add a nested class Node that stores data of type T and next (a reference to the next Node).
    // Should store a head of type Node

    /**
     *  Inserts a node with the given value in front of the list
     * @param data
     */
    public void insertAtFront(T data) {
       // FILL IN CODE

    }

    /**
     * Print data in all nodes
     */
    public void print() {
       // FILL IN CODE:
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> listInts = new MyLinkedList<>();
        listInts.insertAtFront(4);
        listInts.insertAtFront(2);
        listInts.insertAtFront(0);
        listInts.print();

        MyLinkedList<String> listStr = new MyLinkedList<>();
        listStr.insertAtFront("c");
        listStr.insertAtFront("b");
        listStr.insertAtFront("a");
        listStr.print();
    }
}