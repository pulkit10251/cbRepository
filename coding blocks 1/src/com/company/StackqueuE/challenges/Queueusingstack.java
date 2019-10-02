package com.company.StackqueuE.challenges;

import java.util.Scanner;
import java.util.Stack;

public class Queueusingstack {
    public static void main(String[] args) throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Queueusingstack A=new Queueusingstack();
        for(int i=0;i<n;i++){
            A.enqueue(i);
        }
        A.display();
        A.dequeue();
        A.display();
    }
     Stack<Integer> primary=new Stack<>();
     Stack<Integer> secondry=new Stack<>();

    public void enqueue(int item) throws Exception {
        while (primary.size() != 0) {
            secondry.push(primary.pop());
        }
        primary.push(item);
        while (secondry.size() != 0) {
            primary.push(secondry.pop());
        }
    }

    public int dequeue() throws Exception {
        int a = primary.pop();
        return a;
    }

    public int front() {
        int a = primary.peek();
        return a;
    }

    public void display() {
        for(int i=primary.size()-1;i>=0;i--){
            System.out.print(primary.get(i)+" ");
        }
        System.out.println();
    }

    public int size() {
        return primary.size();
    }

    public boolean IsEmpty() {
        return primary.isEmpty();
    }
}
