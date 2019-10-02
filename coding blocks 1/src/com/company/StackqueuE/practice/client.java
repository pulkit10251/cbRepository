package com.company.StackqueuE.practice;

public class client {
    public static void main(String[] args) {
        System.out.println("----------case1--------------");
        student s=new student();
        System.out.println(s.a);
        System.out.println(s.A);
        s.fun();
        s.fun1();
        System.out.println("----------case2--------------");
        ssstudent r=new ssstudent();
        System.out.println(r.A);
        System.out.println(r.a);
        System.out.println(r.b);
        System.out.println(r.c);
        s.fun();
        s.fun1();
        System.out.println("----------case2--------------");
        student t=new ssstudent();
        System.out.println(t.A);
        System.out.println(t.a);
       // System.out.println(t.);//System.out.println(t.);
        s.fun();
        s.fun1();

    }
}
