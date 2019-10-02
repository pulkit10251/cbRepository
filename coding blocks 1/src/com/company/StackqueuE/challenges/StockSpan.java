package com.company.StackqueuE.challenges;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] stock=new int[n];
        int[] span=new int[n];
        for(int i=0;i<n;i++){
            stock[i]=s.nextInt();
        }
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        span[0]=1;
        for(int i=1;i<n;i++){
            while (!stack.empty() && stock[stack.peek()]<=stock[i]){
                stack.pop();
            }
            span[i]=stack.empty()?i+1:i-stack.peek();
            stack.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(span[i]+" ");
        }

    }
}
