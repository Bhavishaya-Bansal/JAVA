import java.util.*;

public class BinarySearchUB_LB {
    // This code is for Binary search
    // Lower Bound: This means that the function returns the index of the next smallest number just greater than or equal to that number. If there are multiple values that are equal to the number, lower_bound() returns the index of the first such value.

    /*  Example: 
    Input  : 4 6 10 12 18 18 20 20 30 45
    Output : lower_bound for element 18 at index 4

    Input  : 4 6 10 12 16 20 28
    Output : lower_bound for element 18 at index 5

    Input  : 24 26 40 56
    Output : lower_bound for element 18 at index 0

    Input  : 4 6 10 12 16 17
    Output : lower_bound for element 18 at index 6               */


    // Upper Bound: It returns the index of the first element in the array which has a value greater than key or last if no such element is found. If the element is bigger than the last element of the array then it will return zero OR upper bound does not exist

    /*  Example:
    Input  : 10 20 30 30 40 50
    Output : upper_bound for element 30 is 40 at index 4

    Input  : 10 20 30 40 50
    Output : upper_bound for element 45 is 50 at index 4

    Input  : 10 20 30 40 50
    Output : upper_bound for element 60 does not exists           */


    public static int lowerBound(int arr[], int target){
        int low= 0;
        int high= arr.length- 1;
        int potentialAns= arr.length; // this is our target and the just bigger element than our target are not present in the array.. then this will be our ans.. ex: arr= {10} and target is 20 then our ans will be arr.length that is '2'..

        while(low<= high){
            int mid = low+ (high- low)/2;

            if(arr[mid] >= target){
                potentialAns= mid;
                high = mid- 1;
            }
            else{
                low= mid+ 1;
            }
        }
        return potentialAns;
    }

    public static int upperBound(int arr[], int target){
        int low= 0;
        int high= arr.length- 1;

        while(low<= high){
            int mid= low+ (high- low)/2;

            if(arr[mid] <= target){
                low = mid+ 1; // if our 'arr[mid]== target' then also we have to assign our low to mid+1 as stated by upper bound definition & if our 'arr[mid]< target' then obviously we have to increase our low to mid+1..
            }
            else{
                high = mid-1;
            }
        }
        return low; // because it will be the just bigger element which we will need as ans
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    }
}