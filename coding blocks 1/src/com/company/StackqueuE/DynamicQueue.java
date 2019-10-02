package com.company.StackqueuE;

public class DynamicQueue extends QueueusingArray {

    public DynamicQueue() throws Exception{
        this(default_capacity);
    }
    public DynamicQueue(int Capacity) throws Exception{
        super(Capacity);
    }
    public void enqueue(int value) throws Exception{
        if(this.size()==this.data.length){
            int[] arr=new int[2*data.length];
            for(int i=0;i<this.size;i++){
                int ai=(i+this.front)%this.data.length;
                arr[i]=this.data[ai];
            }
            this.data=arr;
        }
        super.enqueue(value);
    }

}
