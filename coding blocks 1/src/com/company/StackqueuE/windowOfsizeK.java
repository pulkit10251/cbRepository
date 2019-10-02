package com.company.StackqueuE;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class windowOfsizeK {
    public static void main(String[] args) {
        int[] arr={12,-1,-7,8,-15,30,16,28};
        Queue<Integer> queue =new LinkedList<>();
        int i;
        for(i=0;i<3;i++){
            if(arr[i]<0){
                queue.add(i);
            }
        }
        for(;i<arr.length;i++){
            if(!queue.isEmpty()){
                System.out.println(arr[queue.peek()]);
            }else{
                System.out.println(0);
            }
            while (!queue.isEmpty() && queue.peek()<=i-3){
                queue.remove();
            }
            if(arr[i]<0){
                queue.add(i);
            }
        }



    }
}
