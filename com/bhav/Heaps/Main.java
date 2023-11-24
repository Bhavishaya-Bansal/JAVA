package com.bhav.Heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        MinHeap<Integer> heap1= new MinHeap<>();

        heap1.insert(34);
        heap1.insert(45);
        heap1.insert(22);
        heap1.insert(89);
        heap1.insert(76);
        
        // System.out.println(heap1.remove());
        System.out.println(heap1.remove());

        ArrayList<Integer> sortedHeap= heap1.heapsort();
        System.out.println(sortedHeap);
        
    }
}
