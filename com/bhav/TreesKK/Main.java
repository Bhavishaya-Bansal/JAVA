package com.bhav.TreesKK;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // BinaryTree bt= new BinaryTree();
        
        // bt.populate(sc);
        // bt.display();


        int arr[]= {15, 10, 20, 5, 12, 18, 8};
        int arr2[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinarySearchTree bst= new BinarySearchTree();

        // bst.populate(arr);
        bst.populateSorted(arr2);
        bst.display();

    }
}
