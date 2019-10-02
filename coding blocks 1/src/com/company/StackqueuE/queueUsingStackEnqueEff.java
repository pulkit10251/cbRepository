package com.company.StackqueuE;

public class queueUsingStackEnqueEff {
    private DynamicStack primary;
    private DynamicStack secondary;

    public queueUsingStackEnqueEff() throws Exception{
        this.primary=new DynamicStack();
        this.secondary=new DynamicStack();
    }
    public int size(){
       return  this.primary.size();
    }
    public boolean IsEmpty(){
        return this.primary.isempty();
    }

    public void  enqueue(int item) throws Exception{
        this.primary.push(item);
    }
    public int dequeue() throws Exception{
        while(primary.size()!=1){
            secondary.push(primary.pop());
        }
        int a=this.primary.pop();
        while(!secondary.isempty()){
            primary.push(secondary.pop());
        }
        return a;

    }
    public int front() throws Exception{
        while(primary.size()!=1){
            secondary.push(primary.pop());
        }
        int a=primary.top();
        while(!secondary.isempty()){
            primary.push(secondary.pop());
        }
       return a;
    }
    public void display() throws Exception{
        reverseStack(this.primary,this.secondary,0);
        this.primary.display();
        reverseStack(this.primary,this.secondary,0);
    }

    public static void reverseStack(DynamicStack stack,DynamicStack helper,int index) throws Exception{
        if(stack.isempty()){
            return;
        }
        int ai=stack.pop();
        reverseStack(stack,helper,index+1);
        helper.push(ai);
        if(index==0){
            while(!helper.isempty())
                stack.push(helper.pop());
        }
    }

}

