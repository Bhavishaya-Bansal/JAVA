package com.bhav.Trees;

import java.util.ArrayList;

public class TreeNode<T> { // We have created this class as generic so that we can store any kind of data type in it, which we want to store
    
    public T data;
    public ArrayList<TreeNode<T>>  children;// Here we have created our Arraylist which can store our children and every child would be a TreeNode and every child would be of T data type (which means Child in the Tree would be of same data type as root node is)

    public TreeNode(T data){
        this.data = data;
        children= new ArrayList<>();
    } 
}
