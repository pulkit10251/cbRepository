package com.company.StackqueuE;

public class QueueusingArray {
    protected int[] data;
    protected int front;
    protected int size;
    public static final int default_capacity=10;
    QueueusingArray() throws Exception{
        this(default_capacity);
    }
    QueueusingArray(int Capacity) throws Exception{
        if(Capacity<0){
            throw new Exception("Not a valid Capacity");
        }
        this.data=new int[Capacity];
        this.front=0;
        this.size=0;
    }
    public int size(){
        return this.size;
    }
    public boolean IsEmpty(){
        if(this.size==0){
            return true;
        }
        return false;
    }
    public int front() throws Exception{
        if(IsEmpty()){
            throw new Exception("Stack is empty");
        }
        int a=this.data[front];
        return a;
    }
    public void enqueue(int value) throws Exception{
        if(this.size==this.data.length){
            throw new Exception("Stack is full");
        }
        int ai=(this.front+this.size)%this.data.length;
        this.data[ai]=value;
        this.size++;
    }
    public int dequeue() throws Exception{
        if(IsEmpty()){
            throw new Exception("Stack is empty");
        }
        int a=this.data[front];
        this.data[front]=0;
        this.front=(this.front+1)%this.data.length;
        this.size--;
        return a;
    }
    public void display(){
        for(int i=0;i<this.size;i++){
            int ai=(this.front+i)%this.data.length;
            System.out.print(this.data[ai]+"==>");
        }
        System.out.println("END");
    }
}
