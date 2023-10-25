package com.bhav.TreesKK;

import java.util.*;

// Here we are returning a List<List<Integer>> in Level Order (by using BFS)..
// Breadth First Searh.. performing operations by going across the Breadth of the tree first.. Like: Displaying the node of the tree across the Breadth OR calculating the diameter of the tree..

public class BreadthFirstSearch {
    // Definition for a binary tree node..
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> BFS(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();

        if(root== null){
            return result;
        }

        // making a queue to store our tree nodes in it..
        Queue<TreeNode> queue= new LinkedList<>();
        // queue.offer() method only adds the elements when there is space left in the queue.. when our queue gets full and we are unable to add more elements it returns FALSE and when the item gets successfully added it returns TRUE
        queue.offer(root);

        while(!queue.isEmpty()){
            // The no. of elements present in our queue would be same as the elements present at that level of the tree..
            int levelSize= queue.size();
            List<Integer> currentLevel= new ArrayList<>(levelSize);
            for(int i=0; i< levelSize; i++){
                // poll() method removes the head of the queue..
                TreeNode currNode= queue.poll();
                currentLevel.add(currNode.val);
                if(currNode.left!= null){
                    queue.add(currNode.left);
                }
                if(currNode.right!= null){
                    queue.add(currNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}
