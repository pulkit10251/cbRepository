package com.company.StackqueuE;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 8, 6, 7, 5};
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s1.isEmpty() && arr[i] > s1.peek()) {
                int rv=s1.pop();
                System.out.println(rv+" --> "+arr[i]);
                System.out.println(s1);
            }
            s1.push(arr[i]);
            System.out.println(s1);
        }
        while(!s1.isEmpty()){
            int a=s1.pop();
            System.out.println(a+" --> "+"-1");
            System.out.println(s1);

        }

    }
}
