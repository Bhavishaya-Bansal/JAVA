package com.bhav.LinkedList;

public class DoublyLL {
    private Node head;

    // Inserting at first of our Doubly LL
    public void InsertFirst(int val){
        Node node= new Node(val);
        node.next= head;
        node.prev= null;
        if(head!= null){
            head.prev= node;
        }
        head= node;
    }

    // Inserting in the last of DLL
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next=null;
        if(head==null){
            node.prev= null;
            head= node;
        }
        while(last.next != null){
            last= last.next;
        }
        last.next= node;
        node.prev= last;
    }
    
    // Find some particular value of a node
    public Node find(int value){
        Node node= head;
        while(node!=null){
            if(node.val == value){
                return node;
            }
            node= node.next;
        }
        return null;
    }

    // Inserting on any particular index remains same as Singly Linked List, but something else that can be tried is:
    public void insert(int after, int val){
        Node p = find(after);
        if(p==null){
            System.out.println("Does not exist");
            return;
        }
        Node node= new Node(val);
        node.next= p.next;
        p.next=node;
        node.prev= p;
        if(node.next!= null){
            node.next.prev= node;
        }
    }

    // Printing DLL
    public void display(){
        Node node= head;
        while(node!=null){
            System.out.print(node.val + " -> ");
            node= node.next;
        }
        System.out.println("END");
    }

    // Printing DLL in reverse
    public void displayRev(){
        Node node= head;
        Node last= null;
        System.out.println("Printing normally..");
        while(node!=null){
            System.out.print(node.val + " -> ");
            last= node;
            node= node.next;
        }
         
        System.out.println("END");
        System.out.println("Printing in reverse..");
          
        while(last!=null){
            System.out.print(last.val + " -> ");
            last= last.prev;
        }
        System.out.println("START");
    }


    private class Node{
        int val; 
        Node next;
        Node prev;
        
        public Node(int val) {
            this.val= val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }        
    }
}
