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

        System.out.println(stack);  // Whenever we print our Stack it displays the item from bottom element of the stack to the top element of the stack
        System.out.println(stack.search(69)); // gives index at which the element is present

        System.out.println(stack.empty()); // returns is the stack is empty or not
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}