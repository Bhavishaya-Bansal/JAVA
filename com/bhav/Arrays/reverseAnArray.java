package com.bhav.Arrays;

import java.util.*;

public class reverseAnArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        // Reversing the array..
        for(int i=0; i< size/2; i++){
            int temp= arr[i];
            arr[i]= arr[size- i- 1];
            arr[size- i- 1]= temp;
        }

        for(int i=0; i< size; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));
    }
}
