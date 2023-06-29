package com.bhav.recursion;

import java.util.ArrayList;

public class ArrayProblems {
    public static void main(String[] args) {
        int arr[]= {3, 2, 18, 1, 9,18, 18};
        int target= 18;
        // System.out.println(sorted(arr, 0));

        // System.out.println(search(arr, target, 0));

        System.out.println(searchAll(arr, target, 0, new ArrayList<Integer>()));
    }

    // check if an array is sorted or not
    public static boolean sorted(int arr[], int index){
        // base condn
        if(index== arr.length- 1){
            return true; // if we are reaching the last index it means the elements before this index are sorted
        }
        boolean ans= arr[index]< arr[index+1] && sorted(arr, index+1); // here we checking for i and i+1 elements as well as are checking the ans from the sorted func which we are running in this step only 
        return ans;
    }

    // linear search using recursion 
    public static int search(int arr[], int target, int index){
        if(index== arr.length-1 && arr[index] != target){
            return -1;
        }
        if(arr[index]== target){
            return index;
        }
        return search(arr, target, index+1);
    }

    
    public static ArrayList<Integer> searchAll(int arr[], int target, int index, ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }
        return searchAll(arr, target, index+1, list);
    }
}
