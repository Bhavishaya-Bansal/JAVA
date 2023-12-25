package com.bhav.TreesKK;

import java.util.*;

// Binary tree are trees which have either zero or one or two children..
public class BinaryTree {

    public BinaryTree(){

    }

    // defining the node of our binary tree.. It will contain it's value, a node towards the left to it and a node towards a right to it
    public static class Node{ 
        int value;
        Node left;
        Node right;
    
        // constructor to initialize the value to our node
        public Node(int value){
            this.value= value;
        }
    }

    public Node root; // declaring a root node

    // Inserting elements in Binary Tree
    public void populate(Scanner sc){
        System.out.println("Enter the Root Node value: ");
        int value= sc.nextInt(); // Inputting the value for the node
        root = new Node(value); // creating a new Node with the given value(Root node)
        
        // Recursion function to fill the entire tree..
        populateTree(sc, root);
    }

    public void populateTree(Scanner sc, Node node){
        // We will ask first for the left node.. that do we want ot enter it or not
        System.out.println("Do you want to enter left of: "+ node.value);

        boolean left= sc.nextBoolean(); // taking input YES or NO whether we want to insert a left node to the current node or not
        if(left== true){
            System.out.print("Enter the value for the left node of "+ node.value + " : ");
            int value= sc.nextInt();
            node.left= new Node(value); // assigning the left to the node
            
            populateTree(sc, node.left); // calling the recursion again for the left node which was just now inserted
        }

        // Now we will check for the right node of the current node.. that do we want to insert the right of it or not..
        System.out.println("Do you want to enter right of: "+ node.value);

        boolean right= sc.nextBoolean(); // take input YES or NO whether we want to insert the right of this particular node or not
        if(right== true){
            System.out.print("Enter the value for the right of "+ node.value + " : ");
            int value= sc.nextInt();
            node.right= new Node(value); // assigning the right to the current node

            populateTree(sc, node.right); // calling the recurion to insert left and right node to the current node which we are at that is right side node
        }
    }

    // HERE OUR TREE IS FORMED SOMETHING LIKE THIS.. (example)
    /*                    15
     *                6        9
     *             8    4
     *              10
     * 
     *   15 has 2 childern 6 and 9
     *    6 has 2 children 8 and 4
     *    8 has a right child 10
     *    and 10 4 and 9 have no children 
     */   

    // to display our tree..
    public void display(){
        displayTree(root, "");
    }

    // The above shown tree.. 
    /* By the following fucntion will be displayed in such manner..
     *       15
     *           6               -> 15 kaa left child
     *              8            -> 6 kaa left child
     *                 10        -> 8 kaa right child
     *              4            -> 6 kaa right child
     *           9               -> 15 kaa right child
     * 
     *  --> First comes the main node.. then it's left on a tab space forward and just below it comes the right of that node.. and if we have further more levels downwards then we keep on inserting nodes in the same manner.. first left then ask for the left's left and right.. then just below our left comes right.. then ask for right's left and right.. then move up level (which means TAB space backwards) then print the right (bcs when we are coming out of recursion calls then only we are printing our right node for that particular node) and so on..
     *  
     */
    public void displayTree(Node node, String str) {
        // Base case.. If we have no node then we will simply return
        if(node == null){
            return;
        }

        System.out.println(str+ node.value); // here str works as indentation(means it is just the space that we are providing)

        displayTree(node.left, str+ "   ");
        displayTree(node.right, str+ "   ");
    }

    // Here in our prettu display function we are printing our tree in a form kii voh leta hua h.. 

    /*  Above used example will look like:
            |---->9
            15
            |     |---->4
            |---->6
            |     |     |---->10
            |     |---->8  
    */

    // In the code first we are printing the right most node then that particular node then the left of that node.. same way the whole recursion is taking place.. right-node-left

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }
    public void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }
        // go till the right most element first.. call the same function and increase the level by one
        prettyDisplay(node.right, level+1);

        if(level!= 0){ // which means we are not in the root node.. which means we have to add that many spaces(the number of spaces equal to the number of level we are downwards)
            for(int i=0; i<level-1; i++){
                System.out.print("|     "); // 2 tab spaces with a dash( | )
            }
            System.out.println("|---->"+ node.value);
        }
        else{
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level+1);
    }

    // TREE TRAVERSALS..

    //Pre Order..
    public void preOrder(){
        preOrderPrint(root);
    }
    private void preOrderPrint(Node node) {
        if(node== null){
            return;
        }
        System.out.print(node.value+"-");
        preOrderPrint(node.left);
        preOrderPrint(node.right);
    }

    //In order..
    public void inOrder(){
        inOrderPrint(root);
    }
    private void inOrderPrint(Node node){
        if(node== null){
            return;
        }
        inOrderPrint(node.left);
        System.out.print(node.value+"-");
        inOrderPrint(node.right);
    }

    // Post Order..
    public void postOrder(){
        postOrderPrint(root);
    }
    public void postOrderPrint(Node node){
        if(node== null){
            return;
        }
        postOrderPrint(node.left);
        postOrderPrint(node.right);
        System.out.print(node.value+"-");
    }

}

