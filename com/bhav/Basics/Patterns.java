package com.bhav.Basics;

import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = 4;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
        System.out.println();
        pattern7(n);
        System.out.println();
        pattern8(n);
        System.out.println();
        pattern9(n);
        System.out.println();
        pattern10(n);
        sc.close();
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
        for(int i=1; i<= n; i++){
            int spaces = n-i;
            for(spaces= n-i; spaces>0; spaces--){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int after=2; after<= i; after++){
                System.out.print(after);
            }
            for(int spaces2=0; spaces2< n-i; spaces2++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for(int i= 1; i<= 2*n-1; i++){
            if(i<= n){
                for(int spaces= n-i; spaces>0; spaces--){
                    System.out.print(" ");
                }
                for(int j=i; j>= 1; j--){
                    System.out.print(j);
                }
                for(int after=2; after<= i; after++){
                    System.out.print(after);
                }
                for(int space= 0; space< n-i; space++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            else{
                for(int spaces=0; spaces<i-n; spaces++){
                    System.out.print(" ");
                }
                for(int j= 2*n-i; j>0; j--){
                    System.out.print(j);
                }
                for(int after=2; after<=2*n-i; after++){
                    System.out.print(after);
                }
                System.out.println();
            }
        }
    }

    public static void pattern9(int n){
        n=2*n;
        for(int i=0; i<= n; i++){
            for(int j=0; j<= n; j++){
                int values= Math.min(i, Math.min(j, Math.min(n-i, n-j)));
                System.out.print(values);
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){
        int originalN= n;
        n= 2*n;
        for(int i=0; i<=n; i++){
            for(int j=0; j<= n; j++){
                int values= originalN- Math.min(Math.min(i, j), Math.min(n-i, n-j));
                System.out.print(values+ " ");
            }
            System.out.println();
        }
    }
}
