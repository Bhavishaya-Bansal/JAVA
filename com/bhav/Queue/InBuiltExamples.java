package com.bhav.Queue;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
        // Queue is not a class of its own.. it is an inetrface. So we use LinkedList class to define Queue..
        Queue<Integer> queue = new LinkedList<>(); // We have wrote here LinkedList as LL implemets queue
        queue.add(3);
        queue.add(15);
        queue.add(45);
        queue.add(78);
        queue.add(69);
        System.out.println(queue.peek()); // peek just gets the item but does not removes it from the queue... 
        // // By default if we use any operation it works on the first element of the queue.. Ex: peek -> displays the first item in the queue OR remove -> removes the first item in the queue 
        System.out.println(queue.remove()); // 3 gets removed
        System.out.println(queue.remove()); // 15 gets removed
        
        System.out.println(queue);
        System.out.println(queue.remove(45)); // Returns if the element is present in the queue or not and also if the element is present it removes the particular element
        System.out.println(queue);
        

        System.out.println(queue.remove()); // 78 gets removed

        // Deque<Integer> deque= new ArrayDeque<>(); // comes in ArrayDeque class
        // deque.add(78);
        // deque.add(45);
        // deque.addLast(69);
        // deque.add(44);
        // deque.removeFirst();
        // there are many more operations

    }
}
