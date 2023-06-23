import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = 5;

        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        pattern6(n);
    }

    public static void pattern1(int n){
        for(int i=1; i<= n; i++){
            for(int j=1; j<= n; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i= 1; i<= n; i++){
            for(int j= 1; j<= i; j++){
                System.out.print("x"+" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i=1; i<= n; i++){
            for(int j= n-i+1; j> 0; j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i=1; i<= n; i++){
            for(int j=1; j<= i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        // int j=0;
        for(int i=0; i<=(2*n-1); i++){
            if(i>n){
                for(int j=2*n-i; j>0;j--){
                    System.out.print("*"+ " ");
                }
                // System.out.println();
            }
            else{
                for(int j=0; j<i; j++){
                    System.out.print("*"+ " ");
                }
                // System.out.println();
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i= 0; i<=(2*n-1); i++){
            if(i<=n){
                for(int spaces=n-i; spaces> 0; spaces--){
                    System.out.print(" ");
                }
                for(int j=0; j< i; j++){
                    System.out.print( "*"+" ");
                }
            }
            else{
                for(int spaces=0; spaces<i-n; spaces++){
                    System.out.print(" ");
                }
                for(int j= 2*n-i; j>0; j--){
                    System.out.print("*"+ " ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        
    }
}
