package com.company.StackqueuE;

public class REverseQueue {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue=new DynamicQueue();
        for(int i=1;i<=6;i++){
            queue.enqueue(i*10);
        }
        queue.display();
        reverseQueue(queue);
        queue.display();
    }
    public static void reverseQueue(DynamicQueue q) throws Exception{
        if(q.IsEmpty()){
            return;
        }
        int element=q.dequeue();
        reverseQueue(q);
        q.enqueue(element);
    }
}
