package com.company.Tries.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] A = new int[n];
        int[] B = new int [n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i]=s.nextInt();
            }
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int ci = A[i];
            if (map1.containsKey(ci)) {
                int ov = map1.get(ci);
                ov = ov + 1;
                map1.put(ci, ov);
            } else {
                map1.put(ci, 1);
            }
        }
        for (int i = 0; i < B.length; i++) {
            int ci = B[i];
            if (map2.containsKey(ci)) {
                int ov = map2.get(ci);
                ov = ov + 1;
                map2.put(ci, ov);
            } else {
                map2.put(ci, 1);
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (map2.containsKey(A[i])) {
                if (map1.get(A[i]) > 1 && map2.get(A[i]) > 1) {
                    int v1 = map1.get(A[i]);
                    int v2 = map2.get(A[i]);
                    map1.put(A[i], v1 - 1);
                    map2.put(A[i], v2 - 1);
                    list.add(A[i]);
                } else if(map1.get(A[i])==1 && map2.get(A[i])>0){
                    list.add(A[i]);
                    map1.remove(A[i]);
                    map2.remove(A[i]);
                }else if(map2.get(A[i])==1 && map1.get(A[i])>0){
                    list.add(A[i]);
                    map1.remove(A[i]);
                    map2.remove(A[i]);
                }
                else{
                    list.add(map1.remove(A[i]));
                    map2.remove(A[i]);
                }
            }

        }
       // System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
