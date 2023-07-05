package com.bhav.Arrays;

//**** finding the sum of array ****

import java.util.*;

public class SumOfArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        int size= sc.nextInt();
        int arr[]= new int[size];
        int sum=0;

        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0; i<size; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

        sc.close();
    }
}
