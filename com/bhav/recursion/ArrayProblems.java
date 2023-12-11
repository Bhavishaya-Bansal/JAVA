package com.bhav.Recursion;

import java.util.ArrayList;

public class ArrayProblems {
    public static void main(String[] args) {
        int arr[]= {9, 8, 7, 6, 1, 2, 3};
        int target= 9;
        // System.out.println(sorted(arr, 0));

        // System.out.println(search(arr, target, 0));

        // System.out.println(searchAll(arr, target, 0, new ArrayList<Integer>()));

        // System.out.println(searchAll2(arr, target, 0));

        System.out.println(rotatedBinary(arr, target, 0, arr.length-1));
    }

    // Ques 1: check if an array is sorted or not..
    public static boolean sorted(int arr[], int index){
        // base condn
        if(index== arr.length- 1){
            return true; // if we are reaching the last index it means the elements before this index are sorted
        }
        boolean ans= arr[index]<= arr[index+1] && sorted(arr, index+1); // here we checking for i and i+1 elements as well as are checking the ans from the sorted func which we are running in this step only 
        return ans;
    }

    // Ques 2: linear search using recursion 
    public static int search(int arr[], int target, int index){
        if(index== arr.length-1 && arr[index] != target){
            return -1;
        }
        if(arr[index]== target){
            return index;
        }
        return search(arr, target, index+1);
    }

    // Ques 3: If duplicate value of target is present, returning all indexes containg the element in the array 
    public static ArrayList<Integer> searchAll(int arr[], int target, int index, ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }
        return searchAll(arr, target, index+1, list);
    }

    // Ques 4: returning the list without passing it in the argument
    public static ArrayList<Integer> searchAll2(int arr[], int target, int index){
        ArrayList<Integer> list= new ArrayList<Integer>(); // this arraylist will get created every time, at every recursion function call
        if(index== arr.length){
            return list;
        }

        // this will contain ans for that function call only
        if(arr[index]== target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowRecursionCalls= searchAll2(arr, target, index+1 );
        list.addAll(ansFromBelowRecursionCalls); // add all the below recursion calls list ans also in the current list

        return list;
    }

    // Ques 5: Binary search on rotated sorted array..
    // arr= [5, 6, 7, 8, 9, 1, 2, 3] -> this is a rotated sorted array
    // target = 7..
    public static int rotatedBinary(int arr[], int target, int start, int end){
        if(start> end){
            return -1;
        }

        int mid= start + (end- start)/2;

        if(arr[mid]== target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target<= arr[mid]){
                return rotatedBinary(arr, target, start, mid-1);
                
            }
            else{
                return rotatedBinary(arr, target, mid+1 , end);
            }
        }
        else{
            if(target>= arr[mid] && target<= arr[end]){
                return rotatedBinary(arr, target, mid+1, end);
            }
            else{
                return rotatedBinary(arr, target, start, mid-1);
            }
        }
    }
}
