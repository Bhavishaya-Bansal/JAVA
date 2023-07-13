package com.bhav.Queue;

public class CircularQueue {
    protected int data[];
    private static final int DEFAULT_SIZE= 10;

    protected int front = 0; // pointer -> pointing towards the end
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
        // interanlly our circular queue 
        data[end++]= item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception(" CIrcular queue is Empty");
        }
        int removed= data[front++];
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
        int i = front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i = i % data.length;
        } while(i != end);
        System.out.println("End");
    }
}