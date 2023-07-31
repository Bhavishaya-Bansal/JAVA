package com.bhav.Recursion;

import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean matrix[][]= {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        
        // allPaths("", 0, 0, matrix);

        int path[][]= new int[matrix.length][matrix[0].length];
        printPathWithNmbrs("", 0, 0, matrix, path, 1);
    }

    // Paths if we can move in all directions.. up, down, left, right..

    // BUT THIS CODE WILL GIVE US STACK OVERFLOW ERROR AS WE WILL BE GOING ON AND ON AND ON ON THE SAME PATH AGAIN AND AGAIN..

    // To solve this prblm we need backtracking..

    public static void allPaths(String pro, int row, int colm, boolean matrix[][]){
        if((row== 2)&&(colm== 2)){
            System.out.println(pro);
            return;
        }

        if(matrix[row][colm]== false){ // if it is false it means if it is visited.. then return 
            return;
        }

        // but if it is not false.. it means we are considering this index in our path and we will make it false;
        matrix[row][colm]= false;

        if(row< 2){
            allPaths(pro+ "D", row+ 1, colm, matrix);
        }

        if(colm< 2){
            allPaths(pro+ "R", row, colm+ 1, matrix);
        }

        if(row> 0){
            allPaths(pro+ "U", row- 1, colm, matrix);
        }

        if(colm> 0){
            allPaths(pro+ "L", row, colm- 1, matrix);
        }

        // but when we are getting out of the recursion call(when the function gets over)
        // So before the function gets removed, also remove the changes made by that function
        matrix[row][colm]= true;
        
    }

    // Printing the path array with numbers as the move in the array
    public static void printPathWithNmbrs(String pro, int row, int colm, boolean matrix[][], int path[][], int step){
        // In base condn.. we want to print the path
        if((row== 2)&&(colm== 2)){
            path[row][colm]= step; // the last step is also a step.. so we need to add it
            // Printing the path
            for(int arr[]: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(pro);
            System.out.println();
            return;            
        }

        if(matrix[row][colm]== false){ // if it is false it means if it is visited.. then return 
            return;
        }

        // but if it is not false.. it means we are considering this index in our path and we will make it false;
        matrix[row][colm]= false;

        path[row][colm]= step; // my path at row and olm will be equal to the step at which we are right now

        if(row< 2){
            printPathWithNmbrs(pro+ "D", row+ 1, colm, matrix, path, step+1); // at every function call our step would be increasing
        }

        if(colm< 2){
            printPathWithNmbrs(pro+ "R", row, colm+ 1, matrix, path, step+1); // at every function call our step would be increasing
        }

        if(row> 0){
            printPathWithNmbrs(pro+ "U", row- 1, colm, matrix, path, step+1); // at every function call our step would be increasing
        }

        if(colm> 0){
            printPathWithNmbrs(pro+ "L", row, colm- 1, matrix, path, step+1); // at every function call our step would be increasing
        }

        // but when we are getting out of the recursion call(when the function gets over)
        // So before the function gets removed, also remove the changes made by that function
        matrix[row][colm]= true;

        // while backtracking we will put our indexes back to zero..
        path[row][colm]= 0;
        
    }


    static void allPaths2(String pro, int rowStart, int colmStart, int rowEnd, int colmEnd){
        if((rowStart== rowEnd) && (colmStart== colmEnd)){
            System.out.println(pro);
            return;
        }

        if(rowStart< rowEnd){
            allPaths2(pro+ "D", rowStart+ 1, colmStart, rowEnd, colmEnd);
        }

        if(colmStart< colmEnd){
            allPaths2(pro+ "R", rowStart, colmStart+ 1, rowEnd, colmEnd);
        }

        if(rowStart> 0){
            allPaths2(pro+ "U", rowStart- 1, colmStart, rowEnd, colmEnd);
        }

        if(colmStart> 0){
            allPaths2(pro+ "L", rowStart, colmStart- 1, rowEnd, colmEnd);
        }
    }
    // HERE COMES THE LOGIC OF BACKTRACKING..
}
