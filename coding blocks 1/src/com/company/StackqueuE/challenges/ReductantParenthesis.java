package com.company.StackqueuE.challenges;

import java.util.Scanner;
import java.util.Stack;

public class ReductantParenthesis {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)==')'){
                stack.push(str.charAt(i));
            }
        }
        int count=0;
        char c=')';


    }
}
