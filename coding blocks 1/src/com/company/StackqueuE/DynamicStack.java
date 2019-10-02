package com.company.StackqueuE;

public class DynamicStack extends StackUsingArray {
     public DynamicStack() throws Exception{
         this(default_value);
     }
     public DynamicStack(int capacity) throws Exception{
         super(capacity);
     }
     public void push(int value) throws Exception{
         if(this.size()==this.data.length){
             int[] arr=new int[2*this.data.length];
             for(int i=0;i<this.data.length;i++){
                 arr[i]=this.data[i];
             }
             this.data=arr;
         }
         super.push(value);
     }

}
