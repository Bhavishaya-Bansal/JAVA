package com.bhav.recursion;

public class recursion {
    public static void main(String args[]){
        System.out.println(fibo(7));
    }

    static int fibo(int n){
        // base condn
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    
}