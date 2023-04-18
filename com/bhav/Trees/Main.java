package com.bhav.Trees;

import java.util.*;
import java.lang.Exception;
public class Main extends Exception{

    public static TreeNode<Integer> takeInput(Scanner sc){ // here we have given scanner as in input to the function because if we create scanner inside the function then everytime a new scanner would be created and we would have access to the other scanner which will lead to different results..
        int n; // root node data
        System.out.println("Enter node data: ");
        n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter number of children for current root node: ");
        int childCount= sc.nextInt(); // number of children for the root node
        for(int i=0; i<childCount; i++){ // for each child we will take input
            TreeNode<Integer> child= takeInput(sc); // By this we will get the root node for our subtree which is child for our root node
            root.children.add(child); // this way we are adding our child node in the root node
        }
        return root; 
    }

    public static void print(TreeNode<Integer> root){
        String s= root.data+ ":"; // String to store root data
        for(int i=0; i<root.children.size(); i++){ // Traversing to every child
            s= s+ root.children.get(i).data + ", "; // Here we have added data of each child in our String 's' one by one
        }
        System.out.println(s); // printing the string
        for(int i=0; i<root.children.size(); i++){ // Printing child's child 
            print(root.children.get(i));
        }
    }

    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter root data: ");
        int rootData= sc.nextInt(); // Entering root data

        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>(); // A queue to store children level wise and operate them
        TreeNode<Integer> root = new TreeNode<Integer>(rootData); // Created rot using Root Data
        pendingNodes.add(root); // Instead of using enqueue we have used add as enqueue in queue is not predefined for TreeNodes (ADD also gives exxception when we add value more than needed in it)
        while(!pendingNodes.isEmpty()){
            try{
                TreeNode<Integer> frontNode= pendingNodes.remove(); // instead of dequeue we are using remove
                System.out.println("Enter no. of children of "+ frontNode.data);
                int numChildren= sc.nextInt();
                for(int i =0; i< numChildren; i++){
                    System.out.println("Enter "+ (i+1) + "th child of "+ frontNode.data);
                    int child = sc.nextInt();
                    TreeNode<Integer> childNode= new TreeNode<Integer>(child); // Making of child Node
                    frontNode.children.add(childNode);
                    pendingNodes.add(childNode);
                }
            }
            // finally{
            //     System.out.println("yayyy");
            // }
            catch(Exception e){
                return null;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        // TreeNode<Integer> root = new TreeNode<Integer>(4);
        // TreeNode<Integer> node1 = new TreeNode<Integer>(1);
        // TreeNode<Integer> node2 = new TreeNode<Integer>(2);
        // TreeNode<Integer> node3 = new TreeNode<Integer>(3);
        // TreeNode<Integer> node4 = new TreeNode<Integer>(5);
        // // Uptil here we have declared the node, no Node is connected to any other node.. In order to connect them we have to perform following operation:

        // root.children.add(node1);  // now after this operation in our ArrayList with 4 as Root Node we have added node1 i.e. 1
        // root.children.add(node2);  // now after this operation in our ArrayList we have also added node2 i.e. 2
        // root.children.add(node3);  // now after this operation in our ArrayList we have also added node3 i.e. 3

        // node2.children.add(node4); // here we have added node4 as child of node2 which means in our ArrayList of node2 we have added node4 in it i.e. 5

        // System.out.println(root);


        // *** Taking input and printing the output of a tree recursively ***

        // Scanner sc= new Scanner(System.in);
        // TreeNode<Integer> node = takeInput(sc);
        // print(node);

        // *** Taking input and printing Level Wise ***
        TreeNode<Integer> root= takeInputLevelWise();
        print(root);

    }
}
