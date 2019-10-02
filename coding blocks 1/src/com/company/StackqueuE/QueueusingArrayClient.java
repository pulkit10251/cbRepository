package com.company.StackqueuE;

public class QueueusingArrayClient {
    public static void main(String[] args) throws Exception{
        QueueusingArray Q1=new QueueusingArray(5);
        for(int i=1;i<=5;i++){
            Q1.enqueue(i*10);
            Q1.display();
        }
        //  Q1.enqueue(60);
        System.out.println(Q1.size());
        System.out.println(Q1.front());
        Q1.dequeue();
        System.out.println(Q1.size());
        Q1.dequeue();
        System.out.println(Q1.size());
        System.out.println(Q1.front());
        Q1.enqueue(10);
        Q1.enqueue(20);
        System.out.println(Q1.front());
        Q1.display();
    }
}
