package com.bhav.Arrays;

// import java.util.*;

// Inputting in array and printing the array..

// public class arrays {
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     int size = sc.nextInt();
//     int numbers[] = new int[size];
    
//     for(int i= 0; i<size ; i++){
//         numbers[i]= sc.nextInt();
//     }

//     for(int i =0; i<size; i++){
//         System.out.print(numbers[i] + " ");
//     }

//     System.out.println(Arrays.toString(numbers)); // another way to print the array it can be done by toString function. It also prints the array in same way 

//     sc.close();    
// }
// }

// import java.util.*;

// public class arrays {
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

// min and max in an array

// import java.util.*;

// public class arrays{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size= sc.nextInt();
//         int arr[]= new int[size];

//         for(int i= 0; i<size ; i++){
//             arr[i]= sc.nextInt();
//         }

//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;

//         for(int i =0 ; i<size; i++){
//             if(arr[i]<min){
//                 min = arr[i];
//             }
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         System.out.println("min value is " + min);
//         System.out.println("max value is " + max);
//         sc.close();

//     }
// }

// import java.util.*;

// public class arrays{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[]= new int[size];

//         for(int i = 0; i<size; i++){
//             arr[i]= sc.nextInt();
//         }

//         boolean isAscending = true;

//         for(int i = 0; i<size-1; i++){
//             if(arr[i]>arr[i+1]){
//                 isAscending = false;
               
//             }
//         }

//         if(isAscending){
//             System.out.println("the array is sorted");
//         }
//         else{
//             System.out.println("array is not sorted");
//         }

//         sc.close();
//     }
// }

// import java.util.*;

// public class arrays{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         boolean arr[] = new boolean[5];
//         System.out.println(arr[0]);
//         sc.close();
//     }
// }

//**** finding the sum of array ****

// import java.util.*;

// public class arrays{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int test= sc.nextInt();
//         int size= sc.nextInt();
//         int arr[]= new int[size];
//         int sum=0;

//         for(int i=0; i<size; i++){
//             arr[i]= sc.nextInt();
//         }

//         for(int i=0; i<size; i++){
//             sum = sum + arr[i];
//         }
//         System.out.println(sum);

//         sc.close();
//     }
// }

//**** fininding the numbers index user is entering

// import java.util.*;

// public class arrays{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[]= new int[size];

//         for(int i=0; i<size; i++){
//             arr[i]=sc.nextInt();
//         }
        
//         System.out.println("enter the number you want to search ");
//         int num = sc.nextInt();

//         for(int i =0;i<size;i++){
//             if(arr[i]==num){
//                 System.out.println(i);
//                 break;
//             }
//         }
//         sc.close();
//     }
// }

// ppulate the array

// import java.util.*;

// public class arrays{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[]= new int[size];

//         for(int i =0; i<size;i++){
//             System.out.println(arr.);
//         }

//         sc.close();
//     }
// }

// public class arrays {
//     public static void change(int input[]){
//     input = new int[5];
//     input[0] = 15;
//     }

//     public static void main(String args[]){
//         int arr[] = new int[5];
//         change(arr);
//         System.out.println("output is "+arr[0]);
//     }
// }
