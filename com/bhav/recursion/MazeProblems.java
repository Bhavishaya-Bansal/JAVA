package com.bhav.Recursion;

public class MazeProblems {
    public static void main(String[] args) {
        System.out.println(nmbrOfPaths(0, 0, 3));
    }

    // Number of paths in a maze(matrix) from 1 index to another.. when we are moving from (0, 0) index to (2,2) index(last idnex of our matrix)
    static int nmbrOfPaths(int row, int colm, int sizeOfMatrix){
        if((row== sizeOfMatrix- 1) || (colm== sizeOfMatrix- 1)){
            return 1;
        }

        int downMovement= nmbrOfPaths(row+1, colm, sizeOfMatrix); // left subtree of our recursion call
        int rightMovement= nmbrOfPaths(row, colm+1, sizeOfMatrix); // right subtree of our recursion call

        return downMovement+ rightMovement;
    }
}
