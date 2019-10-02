package com.company.functionandArray.challenges;
import java.util.Scanner;

public class kthroot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        for(int row=1;row<=p;row++){
            double n=s.nextDouble();
            double k=s.nextInt();
            for(double i=1;i<Integer.MAX_VALUE;i++){
                double h= Math.pow(i,k);
                double l= Math.pow(i+1,k);
                if(h<=n &&l>n){
                    System.out.println((int) i);
                    break;
                }
            }
        }
    }
}
