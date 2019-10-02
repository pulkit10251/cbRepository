package com.company.StackqueuE;


public class StackUsingJavaClient {
    public static void main(String[] args) throws Exception {
        StackUsingArray S1 = new StackUsingArray(5);
        for (int i = 1; i <= 5; i++) {
            S1.push(i * 10);
        }
        S1.display();
        S1.pop();
        S1.pop();
        S1.display();
        S1.push(10);
        S1.push(20);
        S1.display();

    }
}
