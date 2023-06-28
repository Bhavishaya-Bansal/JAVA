package com.bhav.recursion;

public class Problems {
    public static void main(String[] args) {
        int n= 23;

        // System.out.println("Printing N to 1");
        // print(n);

        System.out.println("Printing 1 to N..");
        printRev(n);

    }

    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    public static void printRev(int n){
        if(n==0){
            return ;
        }
        printRev(n-1);
        System.out.println(n);
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int ans= 0;
        int rem= n% 10;
        ans = ans + rem;
        n= n/10;
        sum(n);
        return ans;
    }
}
