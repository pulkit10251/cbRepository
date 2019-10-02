package com.company.recursion.print;

import java.util.Scanner;

public class recursionsmaller {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        printp(A,A,"");
    }
    public static void printp(String A,String B,String res){
        if(A.length()==0){
            if(res.compareTo(B)<0)
                System.out.println(res);
            return;
        }

        for(int i=0;i<A.length();i++){
            char cc=A.charAt(i);
            String ros=A.substring(0,i)+A.substring(i+1);
            printp(ros,B,res+cc);
        }
    }
}
