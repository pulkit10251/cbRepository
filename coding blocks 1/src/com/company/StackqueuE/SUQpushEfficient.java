package com.company.StackqueuE;

public class SUQpushEfficient {
    DynamicQueue primary;
    DynamicQueue secondary;

    public SUQpushEfficient() throws Exception{
        this.primary=new DynamicQueue();
        this.secondary=new DynamicQueue();
    }
    public int size(){
        return this.primary.size();
    }
    public boolean IsEmpty(){
        return this.primary.IsEmpty();
    }
    public void push(int item) throws Exception{
        primary.enqueue(item);
    }
    public int pop() throws Exception{
        while(primary.size()!=1){
            secondary.enqueue(primary.dequeue());
        }
        int rv=primary.dequeue();
        while(!secondary.IsEmpty()){
            primary.enqueue(secondary.dequeue());
        }
        return rv;
    }
    public int top() throws Exception{
        while(primary.size()!=1){
            secondary.enqueue(primary.dequeue());
        }
        int rv=primary.dequeue();
        secondary.enqueue(rv);
        while(!secondary.IsEmpty()){
            primary.enqueue(secondary.dequeue());
        }
        return rv;
    }
    public void display()throws Exception{
        reverseQueue(this.primary);
        primary.display();
        reverseQueue(this.primary);
    }
    private static void reverseQueue(DynamicQueue q) throws Exception{
        if(q.IsEmpty()){
            return;
        }
        int element=q.dequeue();
        reverseQueue(q);
        q.enqueue(element);
    }
}
