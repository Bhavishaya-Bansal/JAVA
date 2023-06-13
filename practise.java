import java.util.*;

class practise{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[][]= {
            {23, 4, 1, 54},
            {65, 34, 0},
            {6543, 5, 99},
            {23, 65}
        };
        int target = 100;
        int ans[] = searchInMatrix(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchInMatrix(int arr[][], int target){
        if(arr.length==0){
            return new int[]{0,0};
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]== target){
                    return new int[]{i, j};
                }
                
            }
        }
        return new int[]{-1,-1};
    }
}