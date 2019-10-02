package com.company.StackqueuE;

public class queueUsingStackDequeEff {
    private DynamicStack primary;
    private DynamicStack secondry;

    public queueUsingStackDequeEff() throws Exception {
        this.primary = new DynamicStack();
        this.secondry = new DynamicStack();
    }

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
        int a = primary.top();
        return a;
    }

    public void display() {
        primary.display();
    }

    public int size() {
        return this.primary.size();
    }

    public boolean IsEmpty() {
        return this.primary.isempty();
    }
}
