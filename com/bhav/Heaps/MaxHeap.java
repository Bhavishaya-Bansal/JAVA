package com.bhav.Heaps;

import java.util.*;

public class MaxHeap<T extends Comparable<T>> {
    private ArrayList<T> list;

    // constructor..
    public MaxHeap(){
        list= new ArrayList<>();
    }

    // Swap Function
    public void swap(int first, int second){
        T temp= list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    public int parent(int index){
        return (index-1) / 2;
    }

    public int left(int index){
        return (2* index)+ 1;
    }
    
    public int right(int index){
        return (2* index)+ 2;
    }

    public void insert(T value){
        list.add(value);

        upHeap(list.size()- 1);
    }

    private void upHeap(int index) {
        // Base case
        if(index==0){
            return;
        }
        int p = parent(index);

        if(list.get(index).compareTo(list.get(p))> 0){
            swap(index, p);
            upHeap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("You are removing out of an empty heap");
        }

        T val= list.get(0);

        T last= list.remove(list.size()- 1);

        if(!list.isEmpty()){
            list.set(0, last);
        }

        downHeap(0);

        return val;
    }

    private void downHeap(int index) {
        int max= index;

        int left= left(index);
        int right= right(index);

        if(left< list.size()){
            // if our left is greater than the max i.e. the parent element then our max would be the left one
            if(list.get(left).compareTo(list.get(max))> 0){
                max= left;
            }
        }

        if(right< list.size()){
            // if our right is greater than the max i.e. the parent element then our max would be the right one
            if(list.get(right).compareTo(list.get(max))> 0){
                max= right;
            }
        }

        if(max!= index){
            swap(max, index);
            downHeap(max);
        }
    }
    
}
