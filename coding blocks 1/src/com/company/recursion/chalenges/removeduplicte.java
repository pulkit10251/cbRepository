package com.company.recursion.chalenges;

import java.util.Scanner;

public class removeduplicte {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String ans=format(A,0);
        System.out.println(ans);
    }
    public static String format(String A,int i){

        if(i==A.length()){
            return A;
        }
        if(i==A.length()-1){
            return A.substring(0,i+1);
        }
        if(A.charAt(i)==A.charAt(i+1)){
            String rec = A.substring(0,i)+A.substring(i+1);
            A = rec;
            }



        String ans=format(A,i+1);
        return ans;
    }
}
