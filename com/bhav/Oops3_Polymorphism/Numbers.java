package com.bhav.Oops3_Polymorphism;

public class Numbers {
    double sum(double a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
         return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2, 3);
        obj.sum(1, 4, 8);
        // obj.sum(4,4,5,5); // ****error**** bcs there are no 4 arguments given for any func
        // In this constructor overloading is defined.. 
        
    }
}
