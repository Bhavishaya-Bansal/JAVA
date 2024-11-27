package com.bhav.Striver.Arrays;

import java.util.*;

class Main{
    public static void main(String []args){
        // Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();
        // int arr[]= new int[n];

        // for(int i= 0; i< n; i++){
        //     arr[i]= sc.nextInt();

        // }

        int arr1[]= {100, 2 ,32,3 ,4, 5, 6, 787,787,787,787,3,4, 6,6, 10000, 10000, 10000, 10000};

        // int max= maximum(arr1);
        // System.out.println(max);

        int sec= secondLargest(arr1);
        System.out.println(sec);

        int secLargest= secLargestBetter(arr1);
        System.out.println(secLargest);
    }

    public static int maximum(int[] arr) {
        int max= 0;
        for(int i= 0; i< arr.length; i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }

    public static int secondLargest(int arr[]){
        int max= 0;
        int ans= 0;
        // int pos= 0;
        for(int i= 0;i< arr.length; i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i]< max && arr[i]> ans){
                ans= arr[i];
            }
        }
        return ans;
    }

    public static int secLargestBetter(int arr[]){
        int max= arr[0];
        int ans= -1;
        for(int i=0 ; i< arr.length; i++){
            if(arr[i]> max){
                ans= max;
                max= arr[i];
            }
        }
        return ans;
    }

}