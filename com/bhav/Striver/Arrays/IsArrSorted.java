package com.bhav.Striver.Arrays;

import java.util.Arrays;

public class IsArrSorted {
    public static void main(String[] args){
        int arr[]= {1, 2, 3, 44, 5, 6, 7, 8, 9, 10};
        int arr1[] ={1, 2, 2, 3, 4, 5, 5, 5, 6, 6, 8, 21};
        boolean sorted= isSorted(arr);
        System.out.println(sorted); 

        int ans[]= uniques(arr1);
        System.out.println(Arrays.toString(ans));
    }

    private static boolean isSorted(int[] arr){
        for(int i= 0; i< arr.length- 1; i++){
            if(arr[i]> arr[i+1]){
                return false;
            }
        }
        return true;
    }  
    
    // Place all the unique elements at first index in sorted array
    public static int[] uniques(int arr[]){
        int j= 0;
        for(int i= 1; i< arr.length; i++){
            if(arr[i] != arr[j]){
                int temp= arr[i];
                arr[i]= arr[j+1];
                arr[j+1]= temp;
                j++;
            }
        }
        return arr;
    }

}

