package com.bhav.Sorting;

import java.util.*;
// CODE FOR INSERTION SORT

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]= {5, 2, 6, 1, 7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j= i+1; j> 0; j--){ // running the 'j' pointer from last as we have to insert the element at 'j' at the correct index
                if(arr[j]< arr[j-1]){
                    swap(arr, j, j-1); // swap the j'th and (j-1)'th element
                }
                else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
    
}
