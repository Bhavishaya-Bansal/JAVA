package com.bhav.BinaryTree;

// We have made this class as Generic
public class BinaryTreeNode<T> {

    public BinaryTreeNode(T data){ // Made a constructor to save value of our data in the node
        this.data= data;
    }
    public T data; // Contains T type of Data
    public BinaryTreeNode<T> left; // Knowledge of a left node 
    public BinaryTreeNode<T> right; // Knowledge of a right node
}
