package com.company.recursion.print;

public class printsubsequence {
    public static void main(String[] args) {
        printss("ABA","");
       // printsswAscii("ab","");
    }
    public static void printss(String A,String res){
        if(A.length()==0){
            System.out.println(res);
            return;
        }
        char cc=A.charAt(0);
        String ros=A.substring(1);
        printss(ros,res);
        printss(ros,res+cc);

    }
    public static void printsswAscii(String A,String result){
        if(A.length()==0){
            System.out.print(result+",");
            return;
        }

        char cc=A.charAt(0);
        int a=cc;
        String ros=A.substring(1);
        printsswAscii(ros,result);
        printsswAscii(ros,result+cc);
        printsswAscii(ros,result+a);

    }
}
