package com.bhav.Sorting;

import java.util.Arrays;
// code for SELECTION SORT

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]= {4, 5, 2, 3, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i< arr.length; i++){
            // find the max element in the array and swap with it's correct index
            int last= arr.length- i- 1;
            int maxIndex= getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last); 
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max= start; // assume max is at start
        for(int i=start ; i<= end; i++){
            if(arr[max]< arr[i]){
                max= i;
            }
        }
        return max;
    }
}
