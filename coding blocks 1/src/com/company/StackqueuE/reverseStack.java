package com.company.StackqueuE;

public class reverseStack {
    public static void main(String[] args) throws Exception{
        StackUsingArray stack=new StackUsingArray(5);
        StackUsingArray helper=new StackUsingArray(5) ;
        for(int i=1;i<=5;i++){
            stack.push(i*10);
        }
        stack.display();
        reverseStack(stack,helper,0);
        stack.display();
    }
    public static void reverseStack (StackUsingArray stack,StackUsingArray helper,int index) throws Exception{
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
