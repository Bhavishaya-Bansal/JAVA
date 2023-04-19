package com.bhav.BinaryTree;

import java.util.*;

public class Main {

    // this function takes input of the Binary Tree from the user recursively..
    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        int rootData;
        System.out.println("Enter root data: ");
        rootData= sc.nextInt();
        if(rootData== -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        root.left= takeInput(sc);
        root.right= takeInput(sc);
        return root;
    }

    public static void print(BinaryTreeNode<Integer> root){
        if(root== null){
            return;
        }
        String toBePrinted = root.data + "- ";
        if(root.left != null){
            toBePrinted = toBePrinted +"L:" + root.left.data + ", ";
        }
        if(root.right != null){
            toBePrinted = toBePrinted +"R:" + root.right.data;
        }
        System.out.println(toBePrinted);
        print(root.left);
        print(root.right);
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc= new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes= new LinkedList<>(); 
        System.out.println("Enter root data: ");
        int rootData= sc.nextInt();
        if(rootData== -1){
            return null;
        }

        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front;
            try{
                front = pendingNodes.remove();
            }
            catch(Exception e){
                return null;
            }

            System.out.println("Enter left child of "+ front.data);
            int leftChild= sc.nextInt();
            
            if(leftChild != -1){
                BinaryTreeNode<Integer> child= new BinaryTreeNode<Integer>(leftChild);
                pendingNodes.add(child);
                front.left= child;
            }


            System.out.println("Enter right child of "+ front.data);
            int rightChild= sc.nextInt();
            
            if(rightChild != -1){
                BinaryTreeNode<Integer> child= new BinaryTreeNode<Integer>(rightChild);
                pendingNodes.add(child);
                front.right= child;
            }
        }
        return root;        
    }

    // To count nodes we will count the number of nodes in our left subtree and number of nodes in our right subtree and add 1 in them (1 being the root node)
    public static int countNodes(BinaryTreeNode<Integer> root){
        if(root== null){ // Base case
            return 0;
        }
        int ans= 1; // as we have our root node in our tree
        ans= ans + countNodes(root.left); // call our recursion for the left node
        ans= ans+ countNodes(root.right); // call our recursion fot the right node
        return ans;
    }
    

    // To get the height of the Binary tree
    public static int height(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1+ Math.max(leftHeight, rightHeight);
    } // Time complexity: for the height would be O(n).. as we are going on each node of the tree and we are doing the constant work  

    // To find the diameter of our binary tree (the length between our farthest two points in our tree)
    public static int diameter(BinaryTreeNode<Integer> root){
        if(root == null){ // Base case
            return 0;
        }

        int option1= height(root.left) + height(root.right);
        int option2= diameter(root.left);
        int option3= diameter(root.right);
        return Math.max(option1, Math.max(option2, option3));
    }

    // We have created a function to return pur Height and Diameter at once only (in a form of pair) inspite of asking height and then diameter and making things lengthy for us
    public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root){
        // in our Pair class we have created 'first' & 'second' where first is height of the tree and secondis the diameter of the tree
        if(root == null){ // Base case
            Pair<Integer, Integer> output = new Pair<>();
            output.first = 0;
            output.second= 0;
            return output;
        }
        Pair<Integer, Integer> leftOutput= heightDiameter(root.left); // this will provide of height & diameter of left subtree at once
        Pair<Integer, Integer> rightOutput= heightDiameter(root.right); // this will provide us height & diameter of right subtree at once
        int height = 1+ Math.max(leftOutput.first, rightOutput.first); // our height of the tree would be declared from maximum of left tree's height & right tree's height

        int diaOption1= leftOutput.first + rightOutput.first; // Diameter's first option is left subtree's height + right subtree's height (as seen above) 

        int diaOption2= leftOutput.second; // Second option for our tree's diameter to be is diameter of left subtree's output

        int diaOption3= rightOutput.second; // Third option for our tree's diameter to be is diameter of right subtree's output
        
        int diameter= Math.max(diaOption1, Math.max(diaOption2, diaOption3));

        // as we have done the calculations now we will create our pair and finally put our height and diameter in the output and return it 
        Pair<Integer, Integer> output = new Pair<>();
        output.first = height;
        output.second= diameter;
        return output;
    }

    public static void main(String[] args) {
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);

        // BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
        // root.left= node1;

        // BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
        // root.right= node2;

        // Scanner sc= new Scanner(System.in);
        // BinaryTreeNode<Integer> root = takeInput(sc);
        // print(root);

        // *** taking levelwise input ***

        BinaryTreeNode<Integer> root= takeInputLevelWise();
        System.out.println();
        print(root);

        System.out.println();
        System.out.println("Total number of nodes in the tree: "+ countNodes(root));
        
        System.out.println();
        System.out.println("Height of the tree: "+ height(root));
        System.out.println("Diameter of our tree is: "+ diameter(root) );

        System.out.println("Our height and diameter for the tree are: "+ heightDiameter(root).first +"&"+ heightDiameter(root).second);

    }
}
