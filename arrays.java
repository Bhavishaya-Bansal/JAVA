// import java.util.*;

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

//**** finding the sum of array 

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

// ***** ArrayList *****

import java.util.*;

class arrays{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(); // ArrayList of Integers 
        // ArrayList<Boolean> list2 = new ArrayList<>(); // ArrayList of Boolean
        // ArrayList<String> list3 = new ArrayList<>(); // ArrayList of Strings
        
        // Add elements in ArrayList:
        list.add(1);
        list.add(4);
        list.add(3);

        System.out.println(list);

        // Get elements in ArrayList:
        int element = list.get(0); // called on GET function by index values (here index value called is 0)

        System.out.println(element);

        // Add element in between in an ArrayList:
        list.add(1, 6); // To add elements in between first we have given here is the index on which we want to add our element and then the value we want to add on that element.

        System.out.println(list);

        // Set element: changing an already existing element:
        list.set(0, 5); // same fashion first the index is given then the element is setted

        System.out.println(list);
        
        //  Deleting an element in an ArrayList:
        list.remove(3); // index of which the value we want to remove is provided

        System.out.println(list);
        
        // Size of ArrayList:
        int size = list.size(); // size of the ArrayList is saved in integer "size"
        System.out.println(size);

        // Loops on ArrayList:
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        // Sorting the ArrayList: the direct func:
        Collections.sort(list); // Collections is a package in java which contains multiple funcs
        System.out.println(list);
        
    }
}