package com.company.Linklist;

public class linkedlistQueueClient {
    public static void main(String[] args) throws Exception {
        linkedlistQueue queue=new linkedlistQueue();
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println(queue.front());
    }
}
