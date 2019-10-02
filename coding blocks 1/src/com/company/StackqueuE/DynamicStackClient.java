package com.company.StackqueuE;

public class DynamicStackClient {
    public static void main(String[] args) throws Exception {
        StackUsingArray S1 = new DynamicStack(5);
        for (int i = 1; i <= 5; i++) {
            S1.push(i * 10);
            S1.display();
        }
         S1.push(60);
        S1.push(70);
        S1.push(80);
        S1.display();

        System.out.println(S1.top());
        while(!S1.isempty()){
            S1.pop();
            S1.display();
        }
        //   S1.pop();S1.push(60);
        // S1.display();
        for (int i = 1; i <= 8; i++) {
            S1.push(i * 10);
            S1.display();
        }
        System.out.println(S1.isempty());
       // S1.pop();

        System.out.println(S1.size());
        System.out.println(S1.top());

    }
}
