import java.util.*;

import javax.swing.text.html.HTMLDocument.RunElement;

public class BinarySearchUB_LB {
    

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