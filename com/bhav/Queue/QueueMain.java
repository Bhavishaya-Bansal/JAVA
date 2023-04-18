package com.bhav.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        // CustomQueue queue = new CustomQueue(5);
        // queue.insert(3);
        // queue.insert(15);
        // queue.insert(45);
        // queue.insert(78);
        // queue.insert(69);

        // queue.display();
        // System.out.println(queue.remove());
        // queue.display();


        CircularQueue cqueue = new CircularQueue(5);
        cqueue.insert(33);
        cqueue.insert(45);
        cqueue.insert(67);
        cqueue.insert(87);
        cqueue.insert(99);

        cqueue.display();
        System.out.println(cqueue.remove());
        cqueue.insert(11);
        cqueue.display();

    }
}
