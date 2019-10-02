package com.company.StackqueuE.challenges;

import java.util.Scanner;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> helper=new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(A[i]);
        }
        reverseStack(stack,helper,0);
        for(int i=stack.size()-1;i>=0;i--){
            System.out.println(stack.get(i)+" ");
        }

    }
    public static void reverseStack(Stack<Integer> stack,Stack<Integer> helper,int index){
        if(stack.isEmpty()){
            return;
        }
        int tp=stack.pop();
        reverseStack(stack,helper,index+1);
        helper.push(tp);
        if(index==0)
        while(!helper.isEmpty()){
            stack.push(helper.pop());
        }
    }
}
