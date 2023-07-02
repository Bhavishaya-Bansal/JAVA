package com.bhav.recursion;

import java.util.Arrays;

// Here we will be doing BUBBLE SORT USING RECURSION..
public class BubbleSortRecursion {
    public static void main(String[] args) {
        int arr[]= {5, 23, 6, 1, 7, 3, 9};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        
    }

    // doing it the same way the pattern 1 was printed.. just adding the swap thing in between..
    public static void sort(int arr[], int row, int colm){
        if(row== 0){
            return ;
        }

        if(colm< row){
            if(arr[colm]> arr[colm+1]){
                int temp= arr[colm];
                arr[colm]= arr[colm+1];
                arr[colm+1]= temp;
            }
            // System.out.println(Arrays.toString(arr)); // just to check the flow of recursion
            // System.out.println();
            sort(arr, row, colm+1);
        }

        else{
            sort(arr, row-1, 0);
        }
    }
}
