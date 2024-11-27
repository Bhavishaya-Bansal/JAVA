package com.bhav.Recursion;

import java.util.ArrayList;

// IN ALL OUR MAZE PROBLEMS WE TAKING OUR MATRIX AS 0 INDEXED AND IS INDEXED IN SUCH THIS WAY.. EX: rows= 0, 1, 2.. etc & colms= 0, 1, 2.. etc
public class MazeProblems {
    public static void main(String[] args) {

        // System.out.println(nmbrOfPaths(0, 0, 3));

        // System.out.println(nmbrOfPaths2(1, 0, 1, 3));

        paths("", 0, 0, 2, 3);

        // ArrayList<String> ans= pathsList("", 0, 0, 2, 2);
        // System.out.println(ans);

        // int ouput= nmbrOfPathsDiagonally(0, 0, 2, 2, 0);
        // System.out.println(ouput);

        // pathsDiagonally("", 0, 0, 2, 2);

        // System.out.println(pathsDiagonalList("", 0, 0, 2, 2));

        // System.out.println(nmbrOfPathsAfterObstacles(0, 0, 3, 3, 2, 2, 0));

        // System.out.println(nmbrOfPathsAfterObstacles2(0, 0, 3, 3, 2, 2));

        // boolean matrix[][]= {
        //     {true, true, true},
        //     {true, false, true},
        //     {true, true, true}
        // };

        // System.out.println(pathsAfterObstructions3(0, 0, matrix));

        // pathsAfterObstructions("", 0, 0, 2, 2, 1, 1);
    }

    // Number of paths in a maze(matrix) from one index to another.. when we are moving from (0, 0) index to (2,2) index(last idnex of our matrix)
    static int nmbrOfPaths(int row, int colm, int sizeOfMatrix){
        if((row== sizeOfMatrix- 1) || (colm== sizeOfMatrix- 1)){
            return 1;
        }

        int downMovement= nmbrOfPaths(row+1, colm, sizeOfMatrix); // left subtree of our recursion call
        int rightMovement= nmbrOfPaths(row, colm+1, sizeOfMatrix); // right subtree of our recursion call

        return downMovement+ rightMovement;
    }

    // Finding the number of paths for user given indexes
    static int nmbrOfPaths2(int rowStart, int colmStart, int rowEnd, int colmEnd){
        if((rowStart== rowEnd)  || (colmStart== colmEnd)){
            return 1;
        }

        int downwards= nmbrOfPaths2(rowStart+ 1, colmStart, rowEnd, colmEnd);
        int rightSide= nmbrOfPaths2(rowStart, colmStart+ 1, rowEnd, colmEnd);

        return downwards+ rightSide;
    }

    // Printing the paths at which we will move to reach our destination.. (Used processed/unrocessed string concept here)
    static void paths(String pro, int rowStart, int colmStart, int rowEnd, int colmEnd){
        if((rowStart== rowEnd) && (colmStart == colmEnd)){ // we are taking '&&' here because we want complete path definition 
            System.out.println(pro);
            return;
        }

        if(rowStart< rowEnd){ // if our starting row is smaller than ending row then we will add a "D" as in downwards movement
            paths(pro+ "D", rowStart+ 1, colmStart, rowEnd, colmEnd);
        }

        if(colmStart< colmEnd){ // if our starting colm is smaller than ending colm then we will add a "R" as in rightSide movement
            paths(pro+ "R", rowStart, colmStart+ 1, rowEnd, colmEnd);
        }
    }

    // Add all the paths in an ArrayList.. (same as done in string and array questions)
    static ArrayList<String> pathsList(String pro, int rowStart, int colmStart, int rowEnd, int colmEnd){
        if((rowStart== rowEnd) && (colmStart== colmEnd)){
            ArrayList<String> list= new ArrayList<>();
            list.add(pro);
            return list;
        }

        ArrayList<String> down= new ArrayList<>();
        ArrayList<String> right= new ArrayList<>();

        if(rowStart< rowEnd){
            down= pathsList(pro+ "D", rowStart+ 1, colmStart, rowEnd, colmEnd);
        }

        if(colmStart< colmEnd){
            right= pathsList(pro+ "R", rowStart, colmStart+ 1, rowEnd, colmEnd);
        }

        right.addAll(down);
        return right;
    }

    // Number of paths if we can also move diagonally..
    static int nmbrOfPathsDiagonally(int rowStart, int colmStart, int rowEnd, int colmEnd, int diagonal){
        if((rowStart== rowEnd) || (colmStart== colmEnd)){
            return 1;
        }

        int dowmMovement= nmbrOfPathsDiagonally(rowStart+ 1, colmStart, rowEnd, colmEnd, diagonal);
        int rightMovement= nmbrOfPathsDiagonally(rowStart, colmStart+ 1, rowEnd, colmEnd, diagonal);
        int diagonalMovement= nmbrOfPathsDiagonally(rowStart+ 1, colmStart+ 1, rowEnd, colmEnd, diagonal);

        return dowmMovement+ rightMovement+ diagonalMovement;
    }

    // Paths if we can move in a diagonal direction too.. 
    static void pathsDiagonally(String pro, int rowStart, int colmStart, int rowEnd, int colmEnd){
        if((rowStart== rowEnd) && (colmStart== colmEnd)){
            System.out.println(pro);
            return;
        }
        
        if(rowStart< rowEnd && colmStart< colmEnd){ // for diagonal movement
            pathsDiagonally(pro+ "S", rowStart+ 1, colmStart+ 1, rowEnd, colmEnd);
        }
        if(rowStart< rowEnd){ // for downwards movement
            pathsDiagonally(pro+ "D", rowStart+ 1, colmStart, rowEnd, colmEnd);
        }
        if(colmStart< colmEnd){ // for rightSide movement
            pathsDiagonally(pro+ "R", rowStart, colmStart+ 1, rowEnd, colmEnd);
        }
    }

    // Putting all diagonal, down, and right paths possible in an ArrayList..
    static ArrayList<String> pathsDiagonalList(String pro, int rowStart, int colmStart, int rowEnd, int colmEnd){
        if((rowStart== rowEnd) && (colmStart== colmEnd)){
            ArrayList<String> list= new ArrayList<>();
            list.add(pro);
            return list;
        }

        ArrayList<String> down= new ArrayList<>();
        ArrayList<String> right= new ArrayList<>();
        ArrayList<String> diagonal= new ArrayList<>();

        if(rowStart< rowEnd){
            down= pathsDiagonalList(pro+ "D", rowStart+ 1, colmStart, rowEnd, colmEnd);
        }

        if(colmStart< colmEnd){
            right= pathsDiagonalList(pro+ "R", rowStart, colmStart+ 1, rowEnd, colmEnd);
        }

        if(rowStart< rowEnd && colmStart< colmEnd){
            diagonal= pathsDiagonalList(pro+ "S", rowStart+ 1, colmStart+ 1, rowEnd, colmEnd);
        }

        down.addAll(right);
        down.addAll(diagonal);

        return down;
    }

    // Paths in obstacled matirx.. suppose in a matrix we cannot move at certain index, then we have to tell the number of paths without that index
    public static int nmbrOfPathsAfterObstacles(int rowStart, int colmStart, int rowEnd, int colmEnd, int noRowIndex, int noColmIndex, int skipped){
        // Base case
        if((rowStart== rowEnd) || (colmStart== colmEnd)){
            return 1;
        }
        
        if((rowStart == noRowIndex) && (colmStart== noColmIndex)){
            if(noRowIndex== rowEnd){
                int skip= nmbrOfPathsAfterObstacles(rowStart, rowEnd, colmStart+ 1, colmEnd, noRowIndex, noColmIndex, skipped+ 1);
            }
            if(noColmIndex== colmEnd){
                int skip= nmbrOfPathsAfterObstacles(rowStart+ 1, rowEnd, colmStart, colmEnd, noRowIndex, noColmIndex, skipped+ 1);
            }
            else{
                int skip= nmbrOfPathsAfterObstacles(rowStart+ 1, rowEnd, colmStart, colmEnd, noRowIndex, noColmIndex, skipped+ 1);
            }
        }

        int down= nmbrOfPathsAfterObstacles(rowStart+ 1, colmStart, rowEnd, colmEnd, noRowIndex, noColmIndex, skipped);
        int right= nmbrOfPathsAfterObstacles(rowStart, colmStart+ 1, rowEnd, colmEnd, noRowIndex, noColmIndex, skipped);

        return down + right- skipped;
    }

    public static int nmbrOfPathsAfterObstacles2(int rowStart, int colmStart, int rowEnd, int colmEnd, int noRowIndex, int noColmIndex){
        // Base case
        if((rowStart== rowEnd) || (colmStart== colmEnd)){
            return 1;
        }

        if((rowStart == noRowIndex) && (colmStart== noColmIndex)){
            return 0;
        }
        
        int down= nmbrOfPathsAfterObstacles2(rowStart+ 1, colmStart, rowEnd, colmEnd, noRowIndex, noColmIndex);
        int right= nmbrOfPathsAfterObstacles2(rowStart, colmStart+ 1, rowEnd, colmEnd, noRowIndex, noColmIndex);

        return down+ right;

    }   

    // Paths after obstruction.. By taking in boolean matrix
    public static int pathsAfterObstructions3(int row, int colm, boolean matrix[][]){
        if((row== 2)||(colm== 2)){
            return 1;
        }

        if(matrix[row][colm]== false){
            return 0;
        }

        int down= pathsAfterObstructions3(row+1, colm, matrix);
        int right= pathsAfterObstructions3(row, colm+1, matrix);
        return down+ right;
    }

    // Paths after obstruction..
    public static void pathsAfterObstructions(String pro, int rowStart, int colmStart, int rowEnd, int colmEnd, int noRowIndex, int noColmIndex){
        if((rowStart== rowEnd) && (colmStart== colmEnd)){
            System.out.println(pro);
            return;
        }

        if((rowStart== noRowIndex) && (colmStart== noColmIndex)){
            return;
        }
        
        if(rowStart< rowEnd){
            pathsAfterObstructions(pro+ "D", rowStart+ 1, colmStart, rowEnd, colmEnd, noRowIndex, noColmIndex);
        }

        if(colmStart< colmEnd){
            pathsAfterObstructions(pro+ "R", rowStart, colmStart+ 1, rowEnd, colmEnd, noRowIndex, noColmIndex);
        }
    }

    /* Paths when we are allowed to move up, down, right and left..
     public static int pathsForAll(int rowStart, int colmStart, int rowEnd, int colmEnd){
        
        DONE IN BACKTRACKING

    }
    */
}
