// import javax.swing.plaf.synth.SynthSpinnerUI;

// code to check if a number is prime or not

// public class mathsForDSA {
//     public static void main(String[] args){
//         int n = 40;
//         System.out.println(prime(n));
//     }
//     static boolean prime(int n){
//         if(n<=1){
//             return false;
//         }
//         int c= 2;
//         while(c*c <= n){ // this means that up until c is less than root n 
//             if(n%c == 0){
//                 return false;
//             }
//             c++;
//         }
        
//         return true;
//     }
// }

// code to print only primes till number n : seive..

public class mathsForDSA{
    public static void main(String[] args) {
        int n = 37;
        boolean arr[] = new boolean[n+1];
        seive(n, arr);
    }

    static void seive(int n, boolean arr[]){
        for (int i = 2; i*i < n; i++) {
            if(arr[i]==false){
                for(int j= i*2; j<= n; j+=i){
                    arr[j]= true;
                }
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]==false){
                System.out.println(i);
            }
        }
    }
}