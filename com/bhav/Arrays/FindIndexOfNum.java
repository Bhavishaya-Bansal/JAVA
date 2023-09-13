package com.bhav.Arrays;

import java.util.*;

//Finding the index of the number user is entering.. Using Linear Search..
public class FindIndexOfNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        boolean flag= false;

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();

        // Printing the first index where the target appears ..
        for(int i= 0; i< size; i++){
            if(arr[i]==num){
                System.out.println(i);
                flag= true;
                break;
            }
        }

        if(flag== false){
            System.out.println("Not present in the array");
        }
        sc.close();
    }
}