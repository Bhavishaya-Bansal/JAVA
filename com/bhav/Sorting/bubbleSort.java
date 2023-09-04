package com.bhav.Sorting;

import java.util.*;

public class bubbleSort {
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }   

    static void bubble(int arr[]){
        boolean swapped; // we used sawapped because even for already sorted array the whole program is running, so for not that to happen we have introduced swapped
        // run the steps n-1 times
        for(int i =0; i<arr.length; i++){
            swapped = false;
            // for each step, max item wil come at the last respective index
            for(int j=1; j< arr.length-i; j++){
                // swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp= arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swapped = true; // made true here because swapping is made
                }
            }
            // if we did not swap for particular value of i, it means the array is sorted hence stop the program
            if(!swapped){ // it means !false i.e. = true.. it means if(swapped == false)
                break;
            }
        }
    }
}
