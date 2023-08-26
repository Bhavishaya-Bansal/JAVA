package com.bhav.LinkedList;

// Linked list are linear data structure
public class LinkedList {

    private Node head;
    private Node tail;
    
    private int size;

    public LinkedList(){
        this.size= 0;
    }


    // **** INSERTION.. ****


    // Inserting value at the starting of Singly Linked List
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head= node;
        if(tail==null){ // it means it is the first item being added as both head and tail are pointing to the same node
            tail = head;
        }
        size++;
    }

    // Instering value at a particular index
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head; 
        for(int i=1; i<index; i++){ // start 'i' from 1 because temp is at head which is index 0 itself
            temp = temp.next;
        }
        Node node= new Node(val, temp.next);  // passing 'temp.next' here because we already have a node after our index present 
        temp.next= node;
        size++;
    }

    //Inserting a node in the end of the Linked List
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        } 
        Node node= new Node(value);
        tail.next= node; // connecting our node to the end of tail
        tail= node;
        size++;
    }

    // Inserting at the end of linked list if 'tail' node is not given
    public void insertEnd(int value){
        Node newNode= new Node(value);

        if(head== null){ // if LL is empty. therefore it means we have to enter the first node.
            head= newNode;
            return;
        }

        // created temp node for traversal
        Node temp = head;

        // taking temp to the last of linked list
        while(temp.next != null){
            temp = temp.next;
        }

        // as temp is at last posn of LL therefore adding next as our newNode
        temp.next= newNode;
        size++;
    }

    // Inserting in the Linked List using RECURSION.. (This is most used when we are not given the size or tail variable of our linked list)
    public void insertRec(int index, int val){
        if(index< 0){
            System.out.println("Invalid index");
            return;
        }
        if(index== 0){
            Node node= new Node(val);
            node.next= head;
            head= node;
            return;
        }
        insertRec(head, index, val);
    }
    
    private void insertRec(Node curr, int index, int val){
        
        if (index == 1) {
            Node node = new Node(val);
            node.next = curr.next;
            curr.next = node;
            return;
        }
        insertRec(curr.next, index - 1, val);
    }
    

    // **** DELETION.. ****


    // Deleting the first element from our singly linked list
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val; // returning the value which was removed 
    }

    // Deleteing last node in the Linked List
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast= get(size-2);
        int val = tail.value;
        tail= secondLast;
        tail.next=null;
        return val;
    }

    // Deleting the last node is 'tail' node is not given.. returning the value of the node which was deleted
    public int deleteLastNode(){
        if(head== null){
            return -1;
        }
        if(head.next== null){
            return -1;
        }

        int val=0;

        // finding the second last node
        Node secondLast= head;
        while(secondLast.next.next != null){
            secondLast= secondLast.next;
            val= secondLast.next.value; // as 'secondLast' is now 'secondLast.next' therefore we need the value of element to it's next
        }
        
        // changing next of second last to null as that is the node which we have to delete 
        secondLast.next= null;
        return val;
    }

    // Deleting value from any particular index
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index== size-1){
            return deleteLast();
        }

        Node prev= get(index-1);
        int val= prev.next.value;
         
        prev.next= prev.next.next;

        return val;
    }


    // **** GET.. FIND.. DISPLAY.. ****


    // Get function: to get the value of any particular node at any particular index
    public Node get(int index){
        Node node= head;
        for(int i=0; i<index; i++){
            node= node.next;
        }
        return node; // returns refrence pointer to any node
    }

    // Find some particular node with given value
    public Node find(int value){
        Node node= head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node= node.next;
        }
        return null;
    }

    
    // Displaying singly Linked list
    public void display(){
        Node temp = head; // creating a temp node so that we can transverse it in our linked list
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next; // moving the temp node one position further
        }
        System.out.println("END");
    }


    private class Node{ // In singly linked list a LL has nodes and that particular node has only knowledge about it's own value and the node next to it, that is why we have declared our LL as with value and next( knowledge of next node )
        private int value;
        private Node next;

        public Node(int value){
            this.value= value;
        } // constructor when no further node is provided

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        } // constructor when further node is provided
    }
}

