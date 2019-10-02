package com.company.StackqueuE;

public class queueUsingStackDequeEffClient {
    public static void main(String[] args) throws Exception {
        queueUsingStackDequeEff stack =new queueUsingStackDequeEff();
        for(int i=1;i<=5;i++){
            stack.enqueue(i*10);

        }
        stack.display();
        stack.dequeue();
        stack.dequeue();
        stack.display();
        stack.enqueue(10);
        stack.enqueue(20);
        stack.display();
    }
}

