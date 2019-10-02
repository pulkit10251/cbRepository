package com.company.backtracking.backtrackingchallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class trickypermutation {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String A = s.next();
        ArrayList<String> result = new ArrayList<>(getp(A));
        for (int i = 0; i < result.size() - 1; i++) {
            for (int j = i + 1; j < result.size(); j++) {
                if (result.get(i).compareTo(result.get(j)) > 0) {
                    Collections.swap(result, i, j);
                }
            }
        }
        String[] B = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            B[i] = result.get(i);
        }
//        for (int i = 0; i < B.length; i++) {
//            int j;
//            for (j = 0; j < i; j++)
//                if (B[i].equals(B[j])) {
//                    break;
//                }
//            if (i == j){
//                System.out.println(B[i]);
//        }
//    }
    int n=result.size();
        for (int i=0; i<n; i++)
        {

            while (i < n-1 && B[i].equals(B[i+1]))
                i++;

            System.out.println(B[i]);
        }


    }
    public static ArrayList<String> getp(String A){
        if(A.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;

        }
        char c=A.charAt(0);
        String B=A.substring(1);
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> recursion=getp(B);
        for(String a:recursion){
            for(int j=0;j<=a.length();j++){
               String val=a.substring(0,j)+c+a.substring(j);
               result.add(val);
            }

        }
        return result;
    }
}
