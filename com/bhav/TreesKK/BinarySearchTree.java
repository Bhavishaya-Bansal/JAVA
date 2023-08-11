package com.bhav.TreesKK;

import java.util.*; 

public class BinarySearchTree {
    public class Node{
        private int value;
        private Node left; 
        private Node right;
        private int height; // here we are also taking height just for the sake of simplicity, as a property of the node
        
        // constructor
        public Node(int value){
            this.value= value;
        }

        // Using GETTER METHOD..
        // to get the value
        public int getValue(){
            return value;
        }
    }

    private Node root;

    // Constructor..
    public BinarySearchTree(){

    }

    // To get Height..
    public int height(Node node){
        // if there is no tree then the height is -1
        if(node== null){
            return -1;
        }
        // else simply return the height
        return node.height;
    }

    // to check whether a tree is empty or not
    public boolean isEmpty(){
        // if our root value itself is null then the tree is empty
        if(root== null){
            return true;
        }
        return false;
    }

    // Inserting in our Binary Search Tree..
    public void insert(int value){
        // while coming out of recursion calls in the end root will be returned so we will assign all the changes to the root node only..
        root= insertIn(value, root);

    }

    private Node insertIn(int value, Node node){
        // if our node becomes null(means we are inserting a node below of our leaf node).. then we have to create a new node there and return it..
        if(node== null){
            node= new Node(value);
            return node;
        }

        // if our 'value' of the new node that we are inserting is less than than the current node that we are at.. then insert it to it's left.. 
        if(value< node.value){
            node.left= insertIn(value, node.left);
        }

        // else.. if the value is greater we will add it to the right.. 
        if(value> node.value){
            node.right= insertIn(value, node.right);
        }

        // now while we are getting out of recursion call, as we are adding a new node the height of the node will be changed so.. we have to change the height of each node to be.. max between the left height and the right height of that node and that would be increased by one(as the max of left and right side would give us the height of the child node of the current node at which we are at)..
        node.height= Math.max(height(node.left), height(node.right))+ 1;

        // whenever we are getting out of recursion call we will return the nodes that were at the posn earlier and were called in the recursion stack as it is.. we will do so because if we will not do so our tree will change
        return node; 
    }

    // To display our tree..
    public void display(){
        // calling the recursive function to display our tree
        displayTree(root, "Root Node: ");
    }

    public void displayTree(Node node, String str){
        if(node== null){
            return;
        }
        System.out.println(str+ node.getValue());
        
        // Making recursion call for the let subtree.. 
        displayTree(node.left, "Left child of: "+ node.getValue()+" : ");
        // Making recursion call for the right subtree..
        displayTree(node.right, "Right child of: "+ node.getValue()+" : ");
    }

}

