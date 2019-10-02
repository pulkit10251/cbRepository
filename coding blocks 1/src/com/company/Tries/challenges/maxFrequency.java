package com.company.Tries.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class maxFrequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int ci=A[i];
            if(map.containsKey(ci)){
                int ov= map.get(A[i]);
                ov=ov+1;
                map.put(ci,ov);

            }else{
                map.put(ci,1);
            }
        }
        int max=0;
        int maxi=0;
        Set<Map.Entry<Integer, Integer>> entryies=map.entrySet();
        for(Map.Entry<Integer,Integer> entry: entryies){
            if(max<entry.getValue()){
                max=entry.getValue();
                maxi=entry.getKey();
            }
        }
        System.out.println(maxi);

    }
}
