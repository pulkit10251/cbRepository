package com.company.Graph.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class beutifulVertices {
    private class Vertex {
        HashMap<Integer, Integer> nbrs = new HashMap<>();
    }

    HashMap<Integer, Vertex> vtces;

    public beutifulVertices() {
        vtces = new HashMap<>();
    }
    public void addVertex(Integer vname) {
        Vertex vtx = new Vertex();
        vtces.put(vname, vtx);
    }
    public void addEdge(Integer vname1, Integer vname2, int cost) {
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);
        if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
            return;
        }
        vtx1.nbrs.put(vname2, cost);
        vtx2.nbrs.put(vname1, cost);


    }
    public void display() {
        System.out.println("----------------------------------------------");
        ArrayList<Integer> keys = new ArrayList<>(vtces.keySet());
        for (Integer key : keys) {
            Vertex vtx = vtces.get(key);
            System.out.println(key + "  :  " + vtx.nbrs);
        }
        System.out.println("----------------------------------------------");
    }
    public int beautiVertices(){
        int count=0;
        ArrayList<Integer> lists=new ArrayList<>(vtces.keySet());
        for(Integer list :lists){
            if(vtces.get(list).nbrs.size()>1){
                count++;
            }
        }

        return  count;

    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        beutifulVertices gph=new beutifulVertices();
        int n=s.nextInt();
        int m=s.nextInt();
        for(int i=0;i<m;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            if(!gph.vtces.containsKey(x) )
            gph.addVertex(x);
            if(!gph.vtces.containsKey(y))
            gph.addVertex(y);

            gph.addEdge(x,y,6);
        }
        gph.display();
        System.out.println(gph.beautiVertices());

    }
}
