package com.bhav.Recursion;

public class PatternProblems {
    public static void main(String[] args) {

        // pattern1(4, 0);
        
        // pattern2(1, 0, 4);

        againPattern2(4, 0);
    }


    // PATTERN 1
    // * * * * 
    // * * * 
    // * * 
    // *
    public static void pattern1(int row, int colm){
        if(row==0){
            return;
        }
        if(colm<row){
            System.out.print("*"+ " ");
            pattern1(row, colm+1);
        }
        else{
            System.out.println();
            pattern1(row-1, 0);
        }
    }

    // PATTERN 2
    // *
    // * *
    // * * *
    // * * * *
    public static void pattern2(int row, int colm, int lines){
        if(row>lines){
            return;
        }
        if(colm < row){
            System.out.print("*"+ " ");
            pattern2(row, colm+1, lines);
        }
        else{
            System.out.println();
            pattern2(row +1 , 0, lines);
        }
    }

    // Another way to solve pattern2:
    // *
    // * *
    // * * *
    // * * * *
    public static void againPattern2(int row,int colm){
        if(row==0){
            return ;
        }
        if(colm< row){
            againPattern2(row, colm+1);
            System.out.print("*"+ " ");
        }
        else{
            againPattern2(row-1, 0);
            System.out.println();
        }
    }
}
