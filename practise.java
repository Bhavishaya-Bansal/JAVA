class Practise {
    public static void main(String args[]) {
        int arr[]= {9, 5, 3, 35, 26, 11};
        int arr2[]= {23, 34, 45, 56, 17, 19};
        boolean ans= isCircular(arr2);
        System.out.println(ans);
    }

    public static boolean isCircular(int arr[]){
        int count= 0;

        if(arr[0]< arr[arr.length-1]){
            for(int i= 1; i< arr.length; i++){
                if(arr[i-1]< arr[i]){
                    count++;
                }   
            }
            if(count == 1){
                return true;
            }
            else{
                return false;
            }
        }

        for(int i= 1; i< arr.length; i++){
            if(arr[i-1]> arr[i]){
                count++;
            }   
        }
        if(count == 1){
            if(arr[0]> arr[arr.length- 1]){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
} 