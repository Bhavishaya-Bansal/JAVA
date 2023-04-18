package com.bhav.Stacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1; // Created a pointer to traverse thru the stack-array we have created

    public CustomStack(){
        this(DEFAULT_SIZE); // calling another constructor with a constructor
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){ // method to insert an item 
        if(isFull()){
            System.out.println("The stack is full");
            return false;
        }

        ptr++;
        data[ptr]= item;
        return true;
    }

    public int pop() throws StackException{ // func created to remove an item of int type
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack.");
        }

        // int removed = data[ptr];
        // ptr--;
        // return removed;

        // In simple terms these upper 3 statements are: 
        return data[ptr--];
    }

    public int peek() throws StackException{ // To peek what is at the top of the stack
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack.");
        }

        return data[ptr];
    }

    public boolean isFull() {
        return ptr== data.length-1; // ptr is at last index if we do ptr++ it will go out of bound
    }

    public boolean isEmpty() {
        return ptr== -1; 
    }

}
