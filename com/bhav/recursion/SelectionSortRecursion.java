package com.bhav.recursion;

import java.util.Arrays;

// Code for selection sort using recursion
public class SelectionSortRecursion {
    public static void main(String[] args) {
        int arr[]= {4, 12, 6, 1, 23, 5, 2, 6, 0};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int row, int colm, int max) {
        if(row==0){
            return;
        }
        if(colm< row){
            if(arr[colm]>arr[max]){
                sort(arr, row, colm+1, colm);
            }
            else{
                sort(arr, row, colm+1, max);
            }
        }
        else{
            int temp= arr[max];
            arr[max]= arr[row-1];
            arr[row-1]= temp;

            sort(arr, row-1, 0, 0);

        }
    }
}
