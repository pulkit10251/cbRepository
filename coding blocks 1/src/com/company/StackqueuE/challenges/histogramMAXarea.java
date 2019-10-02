package com.company.StackqueuE.challenges;

import java.util.Scanner;
import java.util.Stack;

public class histogramMAXarea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int a=s.nextInt();
        int[] hist=new int[a];
        for(int j=0;j<a;j++){
            hist[j]=s.nextInt();
        }
        int n = hist.length;
        int maxArea = 0;
        int tp;
        int i = 0;
        while (i < n) {
            if (stack.empty() || hist[stack.peek()] <= hist[i]) {
                stack.push(i++);
            } else {
                tp = stack.peek();
                stack.pop();
                int Area = hist[tp] * (stack.empty() ? i : i - stack.peek() - 1);
                if (maxArea < Area) {
                    maxArea = Area;
                }
            }
        }
        while (!stack.empty()) {
            tp = stack.peek();
            stack.pop();
            int Area = hist[tp] * (stack.empty() ? i : i- stack.peek() - 1);
            if (maxArea < Area) {
                maxArea = Area;
            }
        }

        System.out.println(maxArea);
    }
}
