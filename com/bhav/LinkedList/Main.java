package com.bhav.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ** Linked List ** ");
        LinkedList list = new LinkedList();
        list.insertFirst(0);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        list.insertLast(99);

        list.insertEnd(69);

        list.insert(111,3);

        list.display();

        list.deleteFirst();

        list.deleteLast();

        list.delete(4);
        
        list.display();

        // Doubly Linked List...
        // System.out.println(" ** Doubly Linked List ** ");
        // DoublyLL dll= new DoublyLL();
        // dll.InsertFirst(100);
        // dll.InsertFirst(99);
        // dll.InsertFirst(98);
        // dll.InsertFirst(97);
        // dll.InsertFirst(96);
        // dll.InsertFirst(95);
        // dll.insertLast(34);
        // dll.insert(99, 33);
        // // dll.display();
        // dll.displayRev();

        // Circular Linked List..
        // System.out.println(" ** Circular Linked List ** ");
        // CircularLL cll= new CircularLL();
        // cll.insert(67);
        // cll.insert(68);
        // cll.insert(69);
        // cll.insert(70);
        // cll.display();
        // cll.delete(68);
        // cll.display();
    }
}
