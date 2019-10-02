package com.company.StackqueuE;

public class StackUsingArray {
    protected int[] data;
    protected int top;
    public static final int default_value=10;
    public StackUsingArray()throws Exception{
        this(default_value);
    }
    public StackUsingArray(int Capacity) throws Exception{
        if(Capacity<1){
            throw new Exception("Not a permisible size of array");
        }

        this.data=new int[Capacity];
        this.top=-1;
    }
    public int size(){
        return this.top+1;
    }
    public int top(){
        int Top=this.data[top];
        return Top;
    }
    public void push(int value) throws Exception{
        if(this.size()==this.data.length){
            throw new Exception("Stack is full");
        }
        this.top++;
        this.data[top]=value;

    }
    public int pop() throws Exception{
        if(this.size()==0){
            throw new Exception("Stack is Empty");
        }
        int a=this.data[top];
        this.data[top]=0;
        this.top--;
        return a;
    }
    public boolean isempty(){
        if(this.size()==0){
            return true;
        }
        return false;
    }
    public void display(){
        for(int i=this.top;i>=0;i--){
            System.out.print(this.data[i]+" ,");
        }
        System.out.println("END");
    }
}
