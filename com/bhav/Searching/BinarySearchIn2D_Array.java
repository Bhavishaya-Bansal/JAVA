package com.bhav.Searching;

import java.util.*;

public class BinarySearchIn2D_Array {
    public static void main(String[] args) {
        int matrix[][]={{10, 16, 14, 22},
                        {15, 19, 23, 27},
                        {20, 24, 28, 32},
                        {25, 29, 33, 37}};


        int matrix2[][]={{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16}};
        
        ArrayList<Integer> ans= search1(matrix, 77);
        ArrayList<Integer> ans2= search2(matrix2, 16);

        System.out.println(ans.toString());
        System.out.println(ans2.toString());
    }

    // Searching in a matrix which is row wise and colm wise independently sorted..
    public static ArrayList<Integer> search1(int arr[][], int target){
        int row=0; 
        int colm= arr[0].length -1;
        ArrayList<Integer> ans= new ArrayList<>();

        while(row< arr.length && colm>=0){
            if(arr[row][colm]== target){
                ans.add(row);
                ans.add(colm);
                return ans;
            }

            else if(arr[row][colm]> target){
                colm--;
            }
            else{
                row++;
            }
        }
        return ans;
    }

    // Searching in a strictly sorted matrix(The first integer of each row is greater than the last integer of the previous row)..
    // Here we are taking the imaginary indexes in our 2D array as they would have been in a 1D array and applying Binary Search directly on it..
    public static ArrayList<Integer> search2(int arr[][], int target){
        int n= arr.length;
        int m= arr[0].length;
        int start= 0;
        int end= n*m- 1;
        ArrayList<Integer> ans= new ArrayList<>();

        if(arr.length== 0){
            return ans;
        }

        while(start<= end){
            int mid= start+ (end- start)/2;
            // We are finding our desired index in 2D array as: RowIndex by: mid divide m & ColmIndex by mid modulo m.. this would give the index which it would be in our 2D array..
            int rowIndex= mid/ m;
            int colmIndex= mid% m;

            if(arr[rowIndex][colmIndex]== target){
                ans.add(rowIndex);
                ans.add(colmIndex);
                return ans;
            }

            else if(arr[rowIndex][colmIndex]> target){
                end= mid- 1;
            }

            else{
                start= mid+ 1;
            }
        }
        return ans;
    }
}
