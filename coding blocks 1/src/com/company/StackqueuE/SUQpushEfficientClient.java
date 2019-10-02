package com.company.StackqueuE;

public class SUQpushEfficientClient {
    public static void main(String[] args) throws Exception{
        SUQpushEfficient  queue=new SUQpushEfficient();
        for(int i=1;i<=5;i++){
            queue.push(i*10);
        }
        queue.display();
        System.out.println(queue.top());
        queue.pop();
        System.out.println(queue.top());
        queue.display();

    }
}
