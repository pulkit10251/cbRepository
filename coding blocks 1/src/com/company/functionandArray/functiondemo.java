package com.company.functionandArray;

public class functiondemo {
    public static int val=20;
    public static void add(int a,int b){
        int sum=a+b+val;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        add(a , b);
        System.out.println(val);
        int val=40;
        System.out.println(val);
        System.out.println(functiondemo.val);
    }
}
