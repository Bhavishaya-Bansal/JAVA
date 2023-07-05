package com.bhav.Arrays;

import java.util.*;

//Finding the index of the number user is entering
public class FindIndexOfNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("enter the number you want to search ");
        int num = sc.nextInt();

        for(int i =0;i<size;i++){
            if(arr[i]==num){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}