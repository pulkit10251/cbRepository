package com.company.Graph;

import java.util.HashMap;

public class graphClient {
    public static void main(String[] args) {
        graph gph=new graph();
        gph.addVertex("A");
        gph.addVertex("B");
        gph.addVertex("C");
        gph.addVertex("D");
        gph.addVertex("E");
        gph.addVertex("F");
        gph.addVertex("G");

        gph.addEdge("A","B",2);
        gph.addEdge("A","D",10);
        gph.addEdge("B","C",3);
        gph.addEdge("C","D",1);
        gph.addEdge("D","E",8);
        gph.addEdge("E","F",5);
        gph.addEdge("E","G",6);
        gph.addEdge("F","G",4);

        gph.display();
//        System.out.println(gph.numVertex());
//        System.out.println(gph.numEdges());
//
//        System.out.println(gph.containEdges("A","B"));
//        System.out.println(gph.containEdges("A","C"));
//        gph.removeEdge("G","F");
//        gph.display();
//
//        gph.removeVertex("B");
//        gph.display();
       // System.out.println(gph.HasPath("A","F",new HashMap<>()));
        //gph.removeVertex("E");
        //gph.display();

        //System.out.println(gph.HasPath("A","F",new HashMap<>()));
      //  System.out.println(gph.bfs("A","F"));
        //gph.removeEdge("A","D");
       // gph.display();

        //System.out.println(gph.bfs("A","F"));
    //    System.out.println(gph.dfs("A","F"));

//         gph.bft();
//         System.out.println("--------------------------------------------");
//
////         gph.removeEdge("D","E");
////
////
////         gph.bft();
//     //   gph.dft();
//      //  System.out.println(gph.IsCyclic());
//        System.out.println(gph.IsConnected());
//        System.out.println(gph.IsTree());
//
////        gph.removeEdge("B","C");
////        gph.removeEdge("E","F");
////        System.out.println(gph.IsTree());
//        System.out.println(gph.getConnected());
//        gph.removeEdge("D","E");
//        System.out.println(gph.getConnected());
//        gph.addVertex("K");
//        System.out.println(gph.getConnected());

        gph.prims().display();
        System.out.println(gph.Dijkstra("A"));
    }
}
