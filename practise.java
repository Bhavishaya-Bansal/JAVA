import java.util.*;
class Practise {
    public static void main(String args[]) {
        int arr[]= {10, 2, -5};
        int ans[] = fnc(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] fnc(int[] arr) {
        Stack<Integer> st= new Stack<>();
        
        st.push(arr[0]);

        for(int i=1; i< arr.length; i++){

            if(st.peek()== Math.abs(arr[i])){
                st.pop();
            }

            if(st.peek()> 0){
                if(arr[i]< 0){
                    arr[i]= 0 - arr[i];
                    if(st.peek()> arr[i]){
                        continue;
                    }
                    else{
                        st.pop();
                        st.push(arr[i]);
                        
                    }
                }
                else{
                    st.push(arr[i]);
                }
            }

            else{
                if(arr[i]> 0){
                    arr[i]= 0 - arr[i];
                    if(st.peek()< arr[i]){
                        continue;
                    }
                    else{
                        st.pop();
                        st.push(arr[i]);
                    }
                }
                else{
                    st.push(arr[i]);
                }
            }
        }

        int help[]= new int[st.size()];
        int ans[]= new int[st.size()];

        int i=0;
        while(!st.isEmpty()){
            help[i]= st.pop();
            i++;
        }

        for(int k= 0; k< help.length; k++){
            ans[k]= help[help.length- 1- k];
        }

        return ans;
    }
}