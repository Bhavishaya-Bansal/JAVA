package com.bhav.Queue;

public class CircularQueue {
    protected int data[];
    private static final int DEFAULT_SIZE= 10;

    protected int front = 0; // pointer -> pointing towards the front 
    protected int end= 0; // pointer -> pointing towards the end
    private int size=0;

    public CircularQueue(){
        this(DEFAULT_SIZE); // calling another constructor with a constructor
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; 
    }

    public boolean isEmpty() {
        return size == 0; 
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        // internally our circular queue is a lsit only.. suppose our end is at the last element(data.length) so if we direcly increase our end index it will give us index out of bound.. therefore to move our end to the correct index(here which would be 0) we can get the remainder of end and length of the list, which will give us the correct index
        data[end]= item;
        end++;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception(" Circular queue is Empty");
        }
        int removed= data[front];
        front= front++;
        front = front % data.length;
        size--;

        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Circular queue is Empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty haii bhaii");
            return;
        }
        // we are using here a do while lopp because here if we will use a for loop in the end somehow our end and front would point at the same element so we will first 'do' the thing then check if our 'i' is less than or equal to end or not 
        int i = front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i = i % data.length;
        } while(i != end);
        System.out.println("End");
    }
}