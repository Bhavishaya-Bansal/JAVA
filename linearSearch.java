// import java.util.*;

// public class linearSearch{
//     public static void main(String args[]){

//         int nums[]= {23, 19, 14, 16, 18, 65, 69};
//         int target = 65;
//         int ans = Search(nums, target);
//         System.out.println(ans);

//     }

//     // Search in the array by going at every index of array 
//     // if element if found return the element else return -1
//     static int Search(int arr[], int target){
//         if(arr.length==0){
//             return -1;
//         }
//         for(int index =0; index<arr.length; index++){
//             // check for element at every index in the array
//             int element = arr[index];
//             if(element == target){
//                 return index;
//             }           
//         }
//         return -1; // this line executes if none of the above line executes hence the target does not exist in array
//     }
// }

// Ques 1: Searching for an element in a string 

// public class linearSearch{
//     public static void main(String args[]){
//         String name = "bhav";
//         char target = 'h';
//         System.out.println(searchInString(name, target));
//     }

//     static boolean searchInString(String str, char target){
//         if(str.length() == 0){
//             return false;
//         }
//         for(int index= 0; index<str.length(); index++){
//             if(target == str.charAt(index)){
//                 return true;
//             }
//         }
//         return false;
//     }

// }


public class linearSearch{
    public static void main(String args[]){
        int arr[]= { 18, 71, 66, 43, 87, 64, 9, 101};
        // int target= 71;
        // int rangeStart= 1; // ques 3
        // int rangeEnd = 4; // ques 3
        // System.out.println(searchInRange(arr, rangeStart, rangeEnd, target)); // ques3
        System.out.println(searchMax(arr)); 
    }
    // Ques 3: Search in a particular range: means that the search domain is fixed
    static int searchInRange(int arr[], int start, int end, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=start; i<end; i++){
            if(target == arr[i]){
                return 1;
            } 
        }
        return -1;
    }
    // Ques 4: Find the maximum number in the array
    static int searchMax(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int ans = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}