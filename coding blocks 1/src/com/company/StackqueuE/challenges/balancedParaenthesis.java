package com.company.StackqueuE.challenges;

import java.util.Scanner;
import java.util.Stack;

public class balancedParaenthesis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String str = s.next();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            if(str.charAt(0)==')'){
                System.out.println("No");
                break;
            }
            if(stack.peek()==')'){
                char a=stack.pop();
                if(stack.peek()=='('){
                    stack.pop();
                }else{
                    stack.push(a);
                }
            }
        }
        if(str.charAt(0)!=')')
        if(stack.isEmpty()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
