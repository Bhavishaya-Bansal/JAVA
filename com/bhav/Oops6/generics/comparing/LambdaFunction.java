package com.bhav.Oops6.generics.comparing;
import java.util.*;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();

        for(int i=0; i<5; i++){
            arr.add(i+1);
        }

        arr.forEach((item) -> System.out.println(item*2));

        Operation sum= (a,b) -> a+b;
        Operation sub= (a,b) -> a-b;
        Operation prod= (a,b) -> a*b;

        LambdaFunction calculator = new LambdaFunction();
        System.out.println(calculator.operate(5,3,sum));
        System.out.println(calculator.operate(5,3,sub));
        System.out.println(calculator.operate(5,3,prod));
  
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}

interface Operation{
    int operation(int a, int b);
}