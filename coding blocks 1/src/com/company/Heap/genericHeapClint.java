package com.company.Heap;

public class genericHeapClint {
    public static void main(String[] args) {
        car[] cars=new car[5];
        cars[0]=new car(1000,400,"white");
        cars[1]=new car(2000,130,"black");
        cars[2]=new car(3000,100,"blue");
        cars[3]=new car(4000,90,"yellow");
        cars[4]=new car(5000,120,"grey");

        HeapGeneric<car> heapg=new HeapGeneric<>();
        heapg.add(cars[0]);
        heapg.add(cars[1]);
        heapg.add(cars[2]);
        heapg.add(cars[3]);
        heapg.add(cars[4]);
        heapg.display();
        System.out.println(heapg.remove());
        heapg.display();
        System.out.println(heapg.remove());
        heapg.display();
        System.out.println(heapg.remove());
        heapg.display();
        System.out.println(heapg.remove());
        heapg.display();
        System.out.println(heapg.remove());
        heapg.display();
    }
}
