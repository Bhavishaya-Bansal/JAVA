package com.bhav.TreesKK;

import java.util.*; 

// The whole code base working of AVL tree is based on BST just the 'insert' function is changed..
// AVL is one of a kind of Self Balancing Binary Search Tree.. that uses 4 method of balancing itself..
public class AVL {
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
    public AVL(){

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

    // Inserting values in our binary tree.. when we are given an array..
    public void populate(int arr[]){
        // we are given an array and we performing insert function on that multiple times
        for(int i=0; i< arr.length; i++){
            this.insert(arr[i]);
        }
    }

    // If we are given a sorted array and we have to make our balanced binary search tree out of it(without using self balanced binary trees.. AVL and all) we will do it by..
    public void populateSorted(int arr[]){
        // we would take in our middle element as the root node.. then take the left part middle of the array and it's mid would be the left node of the above node.. and the right part's mid element as the right node to that above node..
        populateTheSorted(arr, 0, arr.length);
    }

    private void populateTheSorted(int[] arr, int start, int end) {
        // Base condn
        if(start> end){
            return;
        }

        // Take the middle element and we will simply insert it in our tree
        int mid= start+ (end- start)/2;
        // Inserting the middle element of the sorted array in the tree
        this.insert(arr[mid]);
        // call the same recurive func for the left half..
        populateTheSorted(arr, start, mid-1);
        // and for the right half..
        populateTheSorted(arr, mid+1, end);
    }

    // Inserting in our AVL Tree..
    public void insert(int value){
        // while coming out of recursion calls in the end 'root' will be returned so we will assign all the changes to the root node only..
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

        // now while we are getting out of recursion call, as we are adding a new node the height of the node will be changed so.. we have to change the height of each node to be.. max between the left height and the right height of that node and that would be increased by one(as the max of left and right side would give us the height of the child node of the current node at which we are at and plus 1 would be done because we have added a new node in our tree)..
        node.height= Math.max(height(node.left), height(node.right))+ 1;

        // Whenever we are entering any new node in our tree so we have to call the rotate function on that particular node and that particular node while returning outside will provide us the root node..
        return rotate(node); 
    }


    // Here our rotate function will keep on calling the rotate function(from bottom node(newly added node) to the root node (Bottom-Up Approach)) but will only execute(rotate) on the node that is making our tree unbalanced..
    private Node rotate(Node node) {
        // left Heavy Case: When Child(C) node is attached to the left of the Parent(P) node.. When height of left child node is greater than the height of right child node..
        if(height(node.left)- height(node.right)> 1){
            // Left Heavy also has 2 cases:

            // 1. Left-Left Case: Right Rotate on Parent node
            // PCG all in the same side.. when the left node of our Child node has greater height than right one..
            if(height(node.left.left)- height(node.left.right)> 0){ // This will the case when 'G' will lie in the left of the Child node..
                // Here we have to do Right Rotate on our Parent node that would be our 'node' itself..
                return rightRotate(node);
            }

            // 2. Left-Right Case: Left Rotate on Child node and then Right Rotate on Parent node
            // PCG all three not being in the same side.. when our left node of our Child node has smaller height than right one
            if(height(node.left.left)- height(node.left.right)< 0){ // This is the case when our 'G' lies on the right of the Child node..
                // Here first we will perform left rotate on Child and then right rotate on the Parent node..
                node.left= leftRotate(node.left);
                return rightRotate(node);
            }

        }

        // Right Heavy Case: When Child(C) node is attached to the right of the Parent(P) node.. When height of right child node is greater than the height of left child node..
        if(height(node.right)- height(node.left)> 1){
            // Right Heavy also has 2 cases: 

            // 1. Right-Right Case: Left Rotate on Parent node
            // PCG all in the same side.. when our Child node is in the right of the Parent node and Grandchild node is also at the right of Child node.. And height of left of Child is less than right of Child node..
            if(height(node.right.right)- height(node.right.left)> 0){ // This is when 'G' lies to the right of the Child node..
                // Here we have to do Left Rotate on our Parent node that would be our 'node' itself..
                return leftRotate(node);
            }

            // 2. Right-Left Case: Right Rotate on Child node then Left Rotate on Parent node
            // PCG all three not being in the same side.. when our Child node is in the right of the Parent node and Grandchild node is at the left of Child node.. And height of right of Child is less than left of Child node..
            if(height(node.right.right)- height(node.right.left)< 0){ // This is the case when our 'G' lies on the right of the Child node..
                // Here first we will perform right rotate on Child and then left rotate on the Parent node..
                node.right= rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    // Right Rotate working..
    // Here we are passing 'Parent' node in the function(for understanding why refer notebook notes bcs in the notebook the main node in the diagram is the 'Parent' node) because that is the top node on which we have to perform our rotation on..
    public Node rightRotate(Node parent){
        Node child= parent.left;
        Node t= child.right;

        // After rotation our changes will be:
        child.right= parent;
        parent.left= t;

        // Update the height..
        parent.height= Math.max(height(parent.left), height(parent.right)+ 1);

        child.height= Math.max(height(child.left), height(child.right)+ 1);

        // Here our new node will become 'Child' node, hence we will return it..
        return child;
    }

    // Left Rotate working..
    // Here we are passing 'Child' node in the function(for understanding why refer notebook notes bcs in the notebook the main node in the diagram is 'Child' node) because that is the top node on which we have to perform our rotation on..
    public Node leftRotate(Node child){
        Node parent= child.right;
        Node t= parent.left;

        // After rotation our changes will be:
        parent.left= child;
        child.right= t;

        // Update the height..
        parent.height= Math.max(height(parent.left), height(parent.right)+ 1);

        child.height= Math.max(height(child.left), height(child.right)+ 1);

        // Here our new node will become 'Parent' node, hence we will return it..
        return parent;
    }


    // To check if our tree is balanced or not..
    public boolean balanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        // if our node is null which means that our tree is empty.. bcs 
        if(node == null){
            return true;
        }

        // if our height difference between left and right nodes is less than equal to 1 then it's okay.. but we also need to check for our left subtree and right subtree that they are balanced or not.. if all is true then return true, The tree is balanced.. else false
        if(Math.abs(height(node.left)- height(node.right))<= 1 && isBalanced(node.left) && isBalanced(node.right)){
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
        displayTree(node.left, "Left child of "+ node.getValue()+" is ");
        // Making recursion call for the right subtree..
        displayTree(node.right, "Right child of "+ node.getValue()+" is ");
    }

    // TREE TRAVERSALS..

    //Pre Order
    public void preOrder(){
        preOrderPrint(root);
    }
    private void preOrderPrint(Node node) {
        if(node== null){
            return;
        }
        System.out.print(node.getValue()+"-");
        preOrderPrint(node.left);
        preOrderPrint(node.right);
    }

    //In order
    public void inOrder(){
        inOrderPrint(root);
    }
    private void inOrderPrint(Node node){
        if(node== null){
            return;
        }
        inOrderPrint(node.left);
        System.out.print(node.getValue()+"-");
        inOrderPrint(node.right);
    }

    // Post Order
    public void postOrder(){
        postOrderPrint(root);
    }
    public void postOrderPrint(Node node){
        if(node== null){
            return;
        }
        postOrderPrint(node.left);
        postOrderPrint(node.right);
        System.out.print(node.getValue()+"-");
    }

}

