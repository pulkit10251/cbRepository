package com.company.genericANDinterface;

public class generic {
    public static void main(String[] args) {
        Integer[] A={10,20,30,40,50,60};
        String[] B={"pulkit","sharma","is","the","best"};
        display(A);
        display(B);
        car[] cars=new car[5];
        cars[0]=new car(1000,100,"white");
        cars[1]=new car(2000,130,"black");
        cars[2]=new car(3000,100,"blue");
        cars[3]=new car(4000,90,"yellow");
        cars[4]=new car(5000,120,"grey");
        display(cars);

    }
    public static <T> void display(T[] arr){
        for(T var:arr){
            System.out.print(var+" ");
        }
        System.out.println();
    }
}
