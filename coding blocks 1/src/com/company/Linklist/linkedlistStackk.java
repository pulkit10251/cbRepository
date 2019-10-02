package com.company.Linklist;

public class linkedlistStackk {
    private linklist stack;
    public linkedlistStackk(){
        this.stack=new linklist();
    }
    public int size(){
        return this.stack.size();
    }
    public boolean isEmpty(){
        return this.stack.IsEmpty();
    }
    public void push(int item){
        this.stack.addFirst(item);
    }
    public int pop() throws Exception{
        return this.stack.removeFirst();
    }
    public int top() throws Exception {
        return  this.stack.getFirst();
    }
    public void display(){
        this.stack.display();
    }

}
