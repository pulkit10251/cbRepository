package com.company.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int[] A={5,1,3,4,7,3};
        int[] B={2,4,3,5,7,10,15,3};
        ArrayList<Integer> list=intersection(A,B);
        System.out.println(list);


    }
    public static ArrayList<Integer> intersection(int[] A,int[] B){
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            map.put(A[i],false);
        }
        for(int i=0;i<B.length;i++){
            if(map.containsKey(B[i])){
                map.put(B[i],true);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        Set<Map.Entry<Integer,Boolean>> entries=map.entrySet();
        for(Map.Entry<Integer,Boolean> entry:entries){
            if(entry.getValue()){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
