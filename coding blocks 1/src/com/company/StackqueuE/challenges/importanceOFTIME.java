package com.company.StackqueuE.challenges;

import java.util.Scanner;
import java.util.Stack;

public class importanceOFTIME {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> time = new Stack<Integer>();
        Stack<Integer> original = new Stack<Integer>();
        Stack<Integer> helper = new Stack<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int b = s.nextInt();
            time.push(b);
        }
        for (int i = 0; i < n; i++) {
            int b = s.nextInt();
            original.push(b);
        }
        int tc=0;
        for (int i = 0; i < n; i++) {
            while(time.get(i)!=original.get(i)){
                while(time.peek()!=time.get(i)){
                    helper.push(time.pop());
                }
                int ce=time.pop();
                while(!helper.empty()){
                    time.push(helper.pop());
                }
                time.push(ce);
                tc++;
            }
            if(time.get(i)==original.get(i)){
                tc++;
            }


        }
        System.out.println(tc);


    }
}
