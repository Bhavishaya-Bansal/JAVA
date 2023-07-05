package com.bhav.Arrays;

import java.util.*;

// Check if the array is sorted or not
public class SortedOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[]= new int[size];

        for(int i = 0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        boolean isAscending = true;
        for(int i = 0; i<size-1; i++){
            if(arr[i]>arr[i+1]){
                isAscending = false;    
            }
        }

        if(isAscending){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
        sc.close();
    }
}