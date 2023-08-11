package com.bhav.TreesKK;

import java.util.*; 

public class BinarySearchTree {
    public class Node{
        private int value;
        private Node left; 
        private Node right;
        private int height; // here we are also taking height just for the sake of simplicity
        
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
        // if there is not ree then the height is -1
        if(node== null){
            return -1;
        }
        // else simply return the height
        return node.height;
    }

    public boolean isEmpty(){
        if(root== null){
            return true;
        }
        return false;
    }

    public void display(){
        displayTree(root, "Root Node: ");
    }

    public void displayTree(Node node, String str){
        if(node== null){
            return;
        }
        System.out.println(str+ node.getValue());
        
        // Makign recursion call for the let subtree 
        displayTree(node.left, "Left child of: "+ node.getValue()+" : ");
        // Making recursion call for the right subtree
        displayTree(node.right, "Right child of: "+ node.getValue()+" : ");
    }

}

