package com.company.recursion.chalenges;

import java.util.Scanner;

public class movetolast {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String ans=move(A,'x',0);
        System.out.println(ans);
    }
    public static String move(String A,char ch,int i){
        if(i==A.length()){
            return A;
        }

        if(A.charAt(i)==ch){
            String rec=A.substring(0,i)+A.substring(i+1)+ch;
            A=rec;
        }
        String ans=move(A,'x',i+1);
        return ans;
    }
}
