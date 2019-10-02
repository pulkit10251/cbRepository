package com.company.patterns;

import java.util.Scanner;

public class helpRamu {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int[] rick=new int[1005];
        int[] cab=new int[1005];
        for(int i=0;i<t;i++){
            int c1=s.nextInt();
            int c2=s.nextInt();
            int c3=s.nextInt();
            int c4=s.nextInt();
            int n=s.nextInt();
            int m=s.nextInt();

            for (int j=0;j<n;j++){
                rick[j]=s.nextInt();
            }
            for (int j=0;j<m;j++){
                cab[j]=s.nextInt();
            }
            int rickcost=0;
            for(int j=0;j<n;j++){
                rickcost+=Math.min(c1*rick[j],c2);
            }
            rickcost=Math.min(rickcost,c3);

            int cabcost=0;
            for(int j=0;j<m;j++){
                cabcost+=Math.min(c1*cab[j],c2);
            }
            cabcost=Math.min(cabcost,c3);

            int finalans=Math.min(c4,rickcost+cabcost);

            System.out.println(finalans);


        }

    }
}
