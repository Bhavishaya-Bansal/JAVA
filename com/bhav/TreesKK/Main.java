package com.bhav.TreesKK;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // BinaryTree bt= new BinaryTree();
        
        // bt.populate(sc);
        // bt.display();


        int arr[]= {15, 10, 20, 5, 12, 18, 8};
        BinarySearchTree bst= new BinarySearchTree();

        bst.populate(arr);
        bst.display();

    }
}
