package com.company.Heap;

import java.util.ArrayList;
import java.util.HashMap;

public class HeapGeneric<T extends Comparable<T>> {
    ArrayList<T> data;
    boolean isMin;
    public HeapGeneric(){
        this(false);
    }
    public HeapGeneric(boolean isMin){
        this.data=new ArrayList<>();
        this.isMin=isMin;
    }
    HashMap<T,Integer>  map=new HashMap<>();

    public void add(T item) {
        data.add(item);
        map.put(item,this.data.size()-1);
        upheapify(data.size() - 1);
    }

    private void upheapify(int ci) {
        int pi = (ci - 1) / 2;
        if (Islarger(data.get(ci),data.get(pi))>0) {
            swap(ci, pi);
            upheapify(pi);
        }

    }

    private void swap(int i, int j) {
        T ith = data.get(i);
        T jth = data.get(j);
        data.set(i, jth);
        data.set(j, ith);
        map.put(ith,j);
        map.put(jth,i);
    }

    public void display() {
        System.out.println(data);
    }

    public int size() {
        return this.data.size();
    }

    public boolean IsEmpty() {
        return this.data.isEmpty();
    }

    public T remove() {
        swap(0, this.data.size() - 1);
        T rv = this.data.remove(data.size() - 1);
        downheapify(0);
        map.remove(rv);
        return rv;
    }

    private void downheapify(int pi) {
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;
        int mini = pi;

        if (lci < this.data.size() && Islarger(data.get(lci) , data.get(mini))>0) {
            mini = lci;
        }
        if (rci < this.data.size() && Islarger(data.get(rci) , data.get(mini))>0 ){
            mini = rci;
        }
        if (mini != pi) {
            swap(pi, mini);
            downheapify(mini);
        }
    }
    public T get(){
        return this.data.get(0);
    }
    public int Islarger(T t,T o){
        return t.compareTo(o);
    }


    public void updadePriority(T pair){
        int index=map.get(pair);

        upheapify(index);
    }
}
