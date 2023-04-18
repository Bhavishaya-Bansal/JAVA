package com.bhav.Stacks;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5); // We can only add 5 items

        // stack.push(33);
        // stack.push(39);
        // stack.push(69);
        // stack.push(43);
        // stack.push(2);
        // stack.push(66); // In CustomStack as we tried to insert it beyond limit it gave us Stack is Full 

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop()); // This will throw our custom exception

        CustomDynamicStack dstack = new CustomDynamicStack(5); // We can add as many items as we wantbcs the stack here is dynmaic

        dstack.push(33);
        dstack.push(39);
        dstack.push(69);
        dstack.push(43);
        dstack.push(2);
        dstack.push(66); 
        dstack.push(65); 
        dstack.push(667); 
        dstack.push(63); 
        dstack.push(56); // here no insertion limit is there so we can insert as many items we want

        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
    } 
}
