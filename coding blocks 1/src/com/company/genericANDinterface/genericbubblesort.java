package com.company.genericANDinterface;

import java.util.Comparator;
import java.util.Scanner;

public class genericbubblesort {
    public static void main(String[] args) {
        car[] cars=new car[5];
        cars[0]=new car(1000,100,"white");
        cars[1]=new car(2000,130,"black");
        cars[2]=new car(3000,100,"blue");
        cars[3]=new car(4000,90,"yellow");
        cars[4]=new car(5000,120,"grey");
        bsort(cars);
        display(cars);
        bsort(cars,new carSpeedComparator());
        display(cars);
        bsort(cars,new carPriceComparator());
        display(cars);
        bsort(cars,new carColorComparator());
        display(cars);
    }
    public static <T> void display(T[] arr){
        for(T var:arr){
            System.out.print(var+" ");
            System.out.println();
        }
        System.out.println();
    }
    public static <T extends Comparable<T>> void bsort(T[] A) {
        Scanner s = new Scanner(System.in);
        int counter = 0;
        while (counter < A.length - 1) {
            for (int j = 0; j < A.length - 1 - counter; j++) {
                if (A[j].compareTo(A[j + 1])>0) {
                    T temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
            counter++;
        }
    }
    public static <T> void bsort(T[] A, Comparator<T> comparator) {
        Scanner s = new Scanner(System.in);
        int counter = 0;
        while (counter < A.length - 1) {
            for (int j = 0; j < A.length - 1 - counter; j++) {
                if (comparator.compare(A[j],A[j+1])>0) {
                    T temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
            counter++;
        }
    }


}
