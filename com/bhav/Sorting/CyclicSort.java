package com.bhav.Sorting;

import java.util.*;
// This is the code for CYCLIC SORT.. Cyclic sort algorithm is used to sort array which contains elements in the range 1 to n..

public class CyclicSort {
    public static void main(String[] args) {
        int arr[]= {2, 4, 5, 1, 3, 6, 8, 7, 9}; // works only for array containing elements 1 to n..
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int arr[]){
        int i =0;
        while(i< arr.length){
            int correctIndex= arr[i]- 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
