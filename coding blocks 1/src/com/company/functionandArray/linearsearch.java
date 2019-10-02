package com.company.functionandArray;

import java.util.Scanner;

public class linearsearch {
    Scanner s=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("enter no. of element of array");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=null;
        arr=new int[n];
        getval(arr);
        int p=linearsrch(arr);
        if(p==-1)
            System.out.println("element not found");
        else
            System.out.println("element found at "+(p+1)+" position");
    }
    public static int linearsrch(int[] arr){
        Scanner s=new Scanner(System.in);
        System.out.println("enter element to be searched for:");
        int val=s.nextInt();
        int g=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val)
                g=i;
        }
        if(g!=-1)
            return g;
        else
            return -1;
    }
    public static void getval(int[] arr ){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
    }

}
