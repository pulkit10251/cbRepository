package com.company.DynamicProgramming;

public class DPlcs {
    public static long start;
    public static long end;
    public static void startAlgo(){
        start=System.currentTimeMillis();
    }
    public static long endAlgo(){
        end=System.currentTimeMillis();
        return end-start;
    }
    public static void main(String[] args) {
        String str1="abababccbaaabbbasds";
        String str2="ababcgdhavsbaababbs";
        startAlgo();
        System.out.println(lcs(str1,str2));
        System.out.println("lcs Normal took time "+endAlgo()+" ms");
        startAlgo();
        System.out.println(lcsIS(str1,str2));
        System.out.println("lcs Iterative took time "+endAlgo()+" ms");
    }
    public static int  lcs(String str1, String str2){
        if(str1.length()==0 || str2.length()==0){
            return 0;
        }
        int count=0;
        String ros1=str1.substring(1);
        String ros2=str2.substring(1);

        if(str1.charAt(0)==str2.charAt(0)){
            count=1+lcs(ros1,ros2);
        }else{
            int fac1=lcs(ros1,str2);
            int fac2=lcs(str1,ros2);
            count=Math.max(fac1,fac2);
        }
        return count;
    }
    public static int lcsIS(String s1,String s2){
        int[][] strg=new int[s1.length()+1][s2.length()+1];
        strg[s1.length()][s2.length()]=0;
        for(int i=s1.length();i>=0;i--){
            for(int j=s2.length();j>=0;j--){
                if(i==s1.length() || j==s2.length()){
                    strg[i][j]=0;
                    continue;
                }
                if(s1.charAt(i)==s2.charAt(j)){
                    strg[i][j]=strg[i+1][j+1]+1;
                }else{
                    strg[i][j]=Math.max(strg[i+1][j],strg[i][j+1]);
                }

            }
        }
        return strg[0][0];
    }
}
