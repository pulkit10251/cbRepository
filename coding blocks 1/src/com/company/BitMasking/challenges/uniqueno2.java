package com.company.BitMasking.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class uniqueno2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>() ;
        for(int i=0;i<n;i++){
            int cc=A[i];
            if(map.containsKey(cc)){
                int ov=map.get(cc);
                int nv=ov+1;
                map.put(cc,nv);
            }else{
                map.put(cc,1);
            }
        }
      //  System.out.println(map);

        ArrayList<Integer> list=new ArrayList<>(map.keySet());
        for(int i:list){
            if(map.get(i)==1){
                System.out.print(i+" ");
            }
        }
    }
}
