package com.company.StackqueuE;

public class SUQpopEfficient {
    DynamicQueue primary;
    DynamicQueue secondry;

    public SUQpopEfficient() throws Exception {
        this.primary=new DynamicQueue();
        this.secondry=new DynamicQueue();
    }
    public int size(){
        return this.primary.size();
    }
    public boolean IsEmpty(){
        return this.primary.IsEmpty();
    }
    public void push(int item) throws Exception{
        while(this.primary.size!=0){
            this.secondry.enqueue(this.primary.dequeue());
        }
        this.primary.enqueue(item);
        while(this.secondry.size()!=0){
            this.primary.enqueue(this.secondry.dequeue());
        }
    }
    public int pop() throws Exception{
        return this.primary.dequeue();
    }
    public int top() throws Exception{
        return  this.primary.front();
    }
    public void display(){
        this.primary.display();
    }
}
