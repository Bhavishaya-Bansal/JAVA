import java.util.*;
class Practise {
    public static void main(String args[]) {
        // pattern22(4, 0);  
        int arr[]= {1, 2 ,4};
        // System.out.println(sortedArray(arr, 0));;
        
        // System.out.println(searching(arr, 0 , 5));

        System.out.println(turnIn(arr, 3, 0, new ArrayList<Integer>()));
    }

    public static void pattern11(int row, int colm){
        if(row== 1){
            System.out.print("*");
            return;
        }

        if(colm< row){
            System.out.print("* ");
            pattern11(row, colm+1);
        }

        else{
            System.out.println();
            pattern11(row-1, 0);
        }
    }

    public static void pattern22(int row, int colm){
        if(row== 1){
            System.out.print("*");
            return;
        }

        if(colm< row){
            pattern22(row, colm+1);
            System.out.print("* ");
        }

        else{
            pattern22(row-1, 0);
            System.out.println();
        }
    }

    public static boolean sortedArray(int arr[], int index){
        if(index== arr.length- 1){
            return true;
        }
        boolean ans= false;
        if(arr[index]< arr[index+1]){
            ans= true;
        }
        ans= ans && sortedArray(arr, index+1);
        return ans;
    }

    // Linear search using recursion..
    public static int searching(int arr[], int index, int target){
        if(index== arr.length){
            return -1;
        }

        if(arr[index]!= target){
            return searching(arr, index+1, target);
        }

        else{
            return index;
        }
    }

    public static ArrayList<Integer> turnIn(int arr[], int target, int index, ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
            return turnIn(arr, target, index+1 , list);
        }

        else{
            return turnIn(arr, target, index+1, list);
        }
    }
    
}