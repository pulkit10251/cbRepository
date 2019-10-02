package com.company.recursion.chalenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class recursionsubsequences {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int k=0;k<n;k++) {
            String P=s.next();
            ArrayList<String> ans = new ArrayList<String>(getss(P));
            for (int i = 0; i < ans.size() - 1; i++) {
                for (int j = i + 1; j < ans.size(); j++) {
                    if (ans.get(i).compareTo(ans.get(j)) > 0) {
                        Collections.swap(ans, i, j);
                    }
                }
            }
            for (int i = 1; i < ans.size(); i++) {
                System.out.println(ans.get(i));
            }
        }

    }
    public static ArrayList<String> getss(String A){
        if(A.length()==0){
            ArrayList<String> baseresult=new ArrayList<>();
            baseresult.add("");
            return baseresult;

        }

        char c=A.charAt(0);
        String B=A.substring(1);
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> recursion=getss(B);
        for(int i=0;i<recursion.size();i++){
            result.add(recursion.get(i));
            result.add(c+recursion.get(i));
        }
        return  result;
    }
}
