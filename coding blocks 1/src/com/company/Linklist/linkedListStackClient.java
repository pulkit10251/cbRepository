package com.company.Linklist;

public class linkedListStackClient {
    public static void main(String[] args) throws Exception{
        linkedlistStackk stack=new linkedlistStackk();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.pop();
        System.out.println(stack.top());
        stack.display();

    }
}
