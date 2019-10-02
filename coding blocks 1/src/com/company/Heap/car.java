package com.company.Heap;

public class car implements Comparable<car> {
    int price;
    int speed;
    String color;

    car(int price, int speed, String color){
        this.price=price;
        this.speed=speed;
        this.color=color;
    }

    @Override
    public String toString() {
        return "price : "+this.price + "  speed : "+this.speed+"  color : "+this.color+"\n";
    }

    @Override
    public int compareTo(car other) {
      return this.speed-other.speed;
     //   return other.price-this.price;
        //return this.color.compareTo(other.color);
    }
}
