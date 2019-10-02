package com.company.Tries.challenges;

import java.util.*;

public class ExistorNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        for (int j = 0; j < k; j++) {
            int n = s.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = s.nextInt();
            }
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(A[i]);
            }
            int p=s.nextInt();
            Queue<Integer> queue=new LinkedList<>();
            for(int i=0;i<p;i++){
                queue.add(s.nextInt());
            }
            while(!queue.isEmpty()){
                if(set.contains(queue.remove())){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }

        }
    }
}
