package com.company.Linklist;

public class linkedlistQueue {
    private linklist Queue;
    public linkedlistQueue(){
        this.Queue=new linklist();
    }
    public int size(){
        return this.Queue.size();
    }
    public boolean IsEmpty(){
        return this.Queue.IsEmpty();
    }
    public void Enqueue(int item){
        this.Queue.addLast(item);
    }
    public int dequeue() throws Exception{
        return this.Queue.removeFirst();
    }
    public int front() throws Exception{
        return this.Queue.getFirst();
    }
    public void display(){
        this.Queue.display();
    }
}
