package com.bhav.Oops6.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object data[];
    private static int DEFAULT_SIZE= 10;
    private int size = 0; // also working as index value 

    public CustomGenArrayList(){
        data= new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++]= num;
    }

    
    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object temp[]= new Object[data.length*2];
        // Copy the current items in new array

        for(int i =0; i<data.length; i++){
            temp[i]= data[i];
        }
        data= temp;
    }

    public T remove(){
        T removed= (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index]= value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList [data=" + Arrays.toString(data) + ", DEFAULT_SIZE=" + DEFAULT_SIZE + ", size=" + size
                + "]";
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>(); 
        // list.add(3);
        // list.add(5);
        // list.add(6);

        for(int i=0; i<14; i++){
            list.add(2*i);
        }

        System.out.println(list);
        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
        // list3.add("absdha"); // ***error*** as we are trying to add a string in a int type ArrayList which is not possible

        
    }
}
