package com.company.DynamicProgramming.Challenges;

import java.util.Scanner;

public class LcsPrint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        lcsIS(s1,s2,s1.length() ,s2.length());
    }

    public static void lcsIS(String s1, String s2,int m,int n) {
        int[][] strg = new int[m + 1][n + 1];
        strg[s1.length()][s2.length()] = 0;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <=n; j++) {
                if (i == 0 || j == 0) {
                    strg[i][j] = 0;
                }else
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    strg[i][j] = strg[i - 1][j - 1] + 1;
                } else {
                    strg[i][j] = Math.max(strg[i - 1][j], strg[i][j - 1]);
                }

            }
        }
        int index=strg[m][n];
        int temp=index;
        char[] lcs=new char[index+1];
        lcs[index]='\0';

        int i=m,j=n;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                lcs[index-1]=s1.charAt(i-1);
                i--;
                j--;

                index--;
            }
            else if (strg[i-1][j]> strg[i][j-1]){
                i--;
            }else{
                j--;
            }

        }
        for(int k=0;k<lcs.length;k++){
            System.out.print(lcs[k]);
        }

    }
}
