package com.company.functionandArray;

import java.util.Scanner;

public class arraydemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=null;
        arr=new int[5];
        arr[0]=s.nextInt();
        arr[2]=80;
        arr[4]=100;
        for(int j=0;j<5;j++)
            System.out.println(arr[j]);
    }
}
