package com.company.backtracking.backtrackingchallenges;

public class printpermutation {
    public static void main(String[] args) {
        printp("ABA","",0);
    }
    public static void printp(String A,String res,int count){
       if(A.length()==0){
           System.out.println(res);
           return;
       }

        for(int i=0;i<A.length();i++){
            char cc=A.charAt(i);
            String ros=A.substring(0,i)+A.substring(i+1);
            printp(ros,res+cc,count);
        }
    }
}
