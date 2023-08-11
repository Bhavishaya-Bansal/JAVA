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

