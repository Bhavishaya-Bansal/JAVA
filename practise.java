import java.util.*;

class practise{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]= {23, 4, 1, 54}; 
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int counter=0;
        for(int i=0; i<nums.length; i++){
            if(isEven(nums[i]));
            counter++;
        }
        return counter;
    }

    static boolean isEven(int n){
        int count =0;
        while(n> 0){
            count++;
            n= n/10;
        }
        if(count %2 == 0){
            return true;
        }
        return false;
    }
}