package com.company.StackqueuE.challenges;

import java.util.Scanner;
import java.util.Stack;

public class PrateekSirAndCoding {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            if(a==2){
                int b=s.nextInt();
                stack.push(b);
            }else
            if(a==1){
                if(stack.empty()) {
                    System.out.println(stack.pop());
                }
                else{
                    System.out.println("No Code");
                }
            }
        }
    }
}
