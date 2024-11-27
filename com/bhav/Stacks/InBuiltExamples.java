package com.bhav.Stacks;
import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(33);
        stack.push(39);
        stack.push(69);
        stack.push(43);
        stack.push(2);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}