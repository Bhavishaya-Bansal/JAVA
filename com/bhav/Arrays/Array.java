package com.bhav.Arrays;

import java.util.*;

// Inputing in array and printing the array..

public class Array {
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);

    //     int size = sc.nextInt();
    //     int numbers[] = new int[size];
        
    //     for(int i= 0; i<size ; i++){
    //         numbers[i]= sc.nextInt();
    //     }

    //     for(int i =0; i<size; i++){
    //         System.out.print(numbers[i] + " ");
    //     }

    //     System.out.println();
    //     System.out.println(Arrays.toString(numbers)); // another way to print the array it can be done by toString function. It also prints the array in same way 

    //     sc.close();
    // }
// }

// Inputing the 'names'(String) in an array..

// import java.util.*;

// public class Array {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String names[]= new String[size];
        
//         for(int i=0; i<size; i++){
//             names[i]= sc.next();
//         }
//         for(int i = 0; i<size; i++){
//             System.out.println(names[i]);
//         }
//         sc.close();
//     }
// }

// public class Array {
//     // In this function a new array 'input' is being created therefore our pointer point it to it and the value change will also be done in the new 'input' array created not the one that is passed
    public static void change(int input[]){ 
    input = new int[5]; // new array being created.. therefore points to a new object
    input[0] = 15;
    }

    public static void main(String args[]){
        int arr[] = new int[5];
        change(arr);
        System.out.println("output is "+arr[0]); // hence at last no change is made
    }
}
