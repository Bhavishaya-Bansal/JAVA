package com.bhav.Recursion;

public class Recursion {
    public static void main(String args[]){
        // System.out.println(fibo(11));
        mssg(5);

    }

    static int fibo(int n){
        // base condn..
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static void mssg(int i){
        if(i==0){
            return;
        }
        System.out.println("Hello "+ i);
        mssg(i-1);
    }
    
}