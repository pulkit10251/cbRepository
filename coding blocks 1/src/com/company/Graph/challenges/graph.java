package com.company.Graph.challenges;

import com.company.Heap.HeapGeneric;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class graph {
    private class Vertex {
        HashMap<String, Integer> nbrs = new HashMap<>();
    }

    HashMap<String, Vertex> vtces;

    public graph() {
        vtces = new HashMap<>();
    }

    public int numVertex() {
        return this.vtces.size();
    }

    public void addVertex(String vname) {
        Vertex vtx = new Vertex();
        vtces.put(vname, vtx);
    }

    public void removeVertex(String vname) {
        Vertex vtx = vtces.get(vname);
        ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
        for (String key : keys) {
            Vertex nbrVtx = vtces.get(key);
            nbrVtx.nbrs.remove(vname);
        }
        vtces.remove(vname);
    }

    public boolean containVertex(String Vname) {
        return this.vtces.containsKey(Vname);
    }

    public int numEdges() {
        int count = 0;
        ArrayList<String> keys = new ArrayList<>(vtces.keySet());
        for (String key : keys) {
            Vertex vtx = vtces.get(key);
            count = count + vtx.nbrs.size();
        }
        return count / 2;
    }

    public boolean containEdges(String vname1, String vname2) {
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);
        if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
            return false;
        }
        return true;
    }

    public void addEdge(String vname1, String vname2, int cost) {
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);
        if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
            return;
        }
        vtx1.nbrs.put(vname2, cost);
        vtx2.nbrs.put(vname1, cost);


    }

    public void removeEdge(String vname1, String vname2) {
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);
        if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
            return;
        }
        vtx1.nbrs.remove(vname2);
        vtx2.nbrs.remove(vname1);
    }

    public void display() {
        System.out.println("----------------------------------------------");
        ArrayList<String> keys = new ArrayList<>(vtces.keySet());
        for (String key : keys) {
            Vertex vtx = vtces.get(key);
            System.out.println(key + "  :  " + vtx.nbrs);
        }
        System.out.println("----------------------------------------------");
    }

    public boolean HasPath(String vname1, String vname2, HashMap<String, Boolean> process) {
        process.put(vname1, true);
        if (containEdges(vname1, vname2)) {
            return true;
        }
        Vertex vtx = vtces.get(vname1);

        ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());

        for (String key : keys) {
            if (!process.containsKey(key) && HasPath(key, vname2, process)) {
                return true;
            }
        }
        return false;
    }

    private class Pair {
        String vname;
        String psf;
    }

    public boolean bfs(String src, String dst) {
        HashMap<String, Boolean> processed = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();

        Pair sp = new Pair();
        sp.vname = src;
        sp.psf = src;

        queue.addLast(sp);

        while (!queue.isEmpty()) {
            Pair rp = queue.removeFirst();
            if (processed.containsKey(rp.vname)) {
                continue;
            }
            processed.put(rp.vname, true);

            if (containEdges(rp.vname, dst)) {
                System.out.println(rp.psf + dst);
                return true;
            }
            Vertex rpvtx = vtces.get(rp.vname);
            ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

            for (String nbr : nbrs) {
                if (!processed.containsKey(nbr)) {
                    Pair np = new Pair();
                    np.vname = nbr;
                    np.psf = rp.psf + nbr;
                    queue.add(np);
                }

            }
        }
        return false;

    }


    public boolean dfs(String src, String dst) {
        HashMap<String, Boolean> processed = new HashMap<>();
        LinkedList<Pair> stack = new LinkedList<>();

        Pair sp = new Pair();
        sp.vname = src;
        sp.psf = src;

        stack.addFirst(sp);

        while (!stack.isEmpty()) {
            Pair rp = stack.removeFirst();
            if (processed.containsKey(rp.vname)) {
                continue;
            }
            processed.put(rp.vname, true);

            if (containEdges(rp.vname, dst)) {
                System.out.println(rp.psf + dst);
                return true;
            }
            Vertex rpvtx = vtces.get(rp.vname);
            ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

            for (String nbr : nbrs) {
                if (!processed.containsKey(nbr)) {
                    Pair np = new Pair();
                    np.vname = nbr;
                    np.psf = rp.psf + nbr;
                    stack.addFirst(np);
                }

            }
        }
        return false;

    }

    public void bft() {
        HashMap<String, Boolean> processed = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        for (String key : keys) {
            if (processed.containsKey(key)) {
                continue;
            }
            Pair sp = new Pair();
            sp.vname = key;
            sp.psf = key;

            queue.addLast(sp);

            while (!queue.isEmpty()) {
                Pair rp = queue.removeFirst();
                if (processed.containsKey(rp.vname)) {
                    continue;
                }
                processed.put(rp.vname, true);


                System.out.println(rp.vname + " via " + rp.psf);
                Vertex rpvtx = vtces.get(rp.vname);
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

                for (String nbr : nbrs) {
                    if (!processed.containsKey(nbr)) {
                        Pair np = new Pair();
                        np.vname = nbr;
                        np.psf = rp.psf + nbr;
                        queue.add(np);
                    }

                }
            }
        }
    }

    public void dft() {
        HashMap<String, Boolean> processed = new HashMap<>();
        LinkedList<Pair> stack = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        for (String key : keys) {
            if (processed.containsKey(key)) {
                continue;
            }
            Pair sp = new Pair();
            sp.vname = key;
            sp.psf = key;

            stack.addFirst(sp);

            while (!stack.isEmpty()) {
                Pair rp = stack.removeFirst();
                if (processed.containsKey(rp.vname)) {
                    continue;
                }
                processed.put(rp.vname, true);


                System.out.println(rp.vname + " via " + rp.psf);
                Vertex rpvtx = vtces.get(rp.vname);
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

                for (String nbr : nbrs) {
                    if (!processed.containsKey(nbr)) {
                        Pair np = new Pair();
                        np.vname = nbr;
                        np.psf = rp.psf + nbr;
                        stack.addFirst(np);
                    }

                }
            }
        }
    }

    public boolean IsCyclic() {
        HashMap<String, Boolean> processed = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        for (String key : keys) {
            if (processed.containsKey(key)) {
                continue;
            }
            Pair sp = new Pair();
            sp.vname = key;
            sp.psf = key;

            queue.addLast(sp);

            while (!queue.isEmpty()) {
                Pair rp = queue.removeFirst();
                if (processed.containsKey(rp.vname)) {
                    return true;
                }
                processed.put(rp.vname, true);


                //System.out.println(rp.vname +" via "+rp.psf);
                Vertex rpvtx = vtces.get(rp.vname);
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

                for (String nbr : nbrs) {
                    if (!processed.containsKey(nbr)) {
                        Pair np = new Pair();
                        np.vname = nbr;
                        np.psf = rp.psf + nbr;
                        queue.add(np);
                    }

                }
            }
        }
        return false;
    }

    public boolean IsConnected() {
        int flag = 0;
        HashMap<String, Boolean> processed = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        for (String key : keys) {
            if (processed.containsKey(key)) {
                continue;
            }
            flag++;
            Pair sp = new Pair();
            sp.vname = key;
            sp.psf = key;

            queue.addLast(sp);

            while (!queue.isEmpty()) {
                Pair rp = queue.removeFirst();
                if (processed.containsKey(rp.vname)) {
                    continue;
                }
                processed.put(rp.vname, true);


//                System.out.println(rp.vname +" via "+rp.psf);
                Vertex rpvtx = vtces.get(rp.vname);
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

                for (String nbr : nbrs) {
                    if (!processed.containsKey(nbr)) {
                        Pair np = new Pair();
                        np.vname = nbr;
                        np.psf = rp.psf + nbr;
                        queue.addLast(np);
                    }

                }
            }
        }
        if (flag >= 2) {
            return false;
        } else {
            return true;
        }
    }

    public boolean IsTree() {
        return !IsCyclic() && IsConnected();
    }

    public ArrayList<ArrayList<String>> getConnected() {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        HashMap<String, Boolean> processed = new HashMap<>();
        LinkedList<Pair> queue = new LinkedList<>();

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        for (String key : keys) {
            if (processed.containsKey(key)) {
                continue;
            }
            ArrayList<String> subans = new ArrayList<>();
            Pair sp = new Pair();
            sp.vname = key;
            sp.psf = key;

            queue.addLast(sp);

            while (!queue.isEmpty()) {
                Pair rp = queue.removeFirst();
                if (processed.containsKey(rp.vname)) {
                    continue;
                }
                processed.put(rp.vname, true);

                subans.add(rp.vname);
                Vertex rpvtx = vtces.get(rp.vname);
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

                for (String nbr : nbrs) {
                    if (!processed.containsKey(nbr)) {
                        Pair np = new Pair();
                        np.vname = nbr;
                        np.psf = rp.psf + nbr;
                        queue.add(np);
                    }

                }
            }
            ans.add(subans);
        }
        return ans;
    }

    public class PrimsPair implements Comparable<PrimsPair> {
        String vname;
        String acqvname;
        int cost;

        @Override
        public int compareTo(PrimsPair o) {
            return o.cost - this.cost;
        }
    }

    public graph prims() {

        graph mst = new graph();
        HashMap<String, PrimsPair> map = new HashMap<>();
        HeapGeneric<PrimsPair> heap = new HeapGeneric<>();

        for (String key : vtces.keySet()) {
            PrimsPair np = new PrimsPair();
            np.vname = key;
            np.acqvname = null;
            np.cost = Integer.MAX_VALUE;

            heap.add(np);
            map.put(key, np);
        }

        while (!heap.IsEmpty()) {
            PrimsPair rp = heap.remove();
            map.remove(rp.vname);

            if (rp.acqvname == null) {
                mst.addVertex(rp.vname);
            } else {
                mst.addVertex(rp.vname);
                mst.addEdge(rp.vname, rp.acqvname, rp.cost);
            }

            for (String key : vtces.get(rp.vname).nbrs.keySet()) {
                if (map.containsKey(key)) {
                    int oc = map.get(key).cost;
                    int nc = vtces.get(rp.vname).nbrs.get(key);

                    if (nc < oc) {
                        PrimsPair gp = map.get(key);
                        gp.acqvname = rp.vname;
                        gp.cost = nc;

                        heap.updadePriority(gp);
                    }

                }
            }
        }


        return mst;
    }

    public class DijkstraPair implements Comparable<DijkstraPair> {
        String vname;
        String psf;
        int cost;

        @Override
        public int compareTo(DijkstraPair o) {
            return o.cost - this.cost;
        }
    }

    public HashMap<String,Integer> Dijkstra(String src) {

        HashMap<String,Integer> ans=new HashMap<>();
        HashMap<String, DijkstraPair> map = new HashMap<>();
        HeapGeneric<DijkstraPair> heap = new HeapGeneric<>();

        for (String key : vtces.keySet()) {
            DijkstraPair np = new DijkstraPair();
            np.vname = key;
            np.psf = "";
            np.cost = Integer.MAX_VALUE;
            if(key.equals(src)){
                np.cost=0;
                np.psf=key;
            }
            heap.add(np);

            map.put(key,np);
        }

        while (!heap.IsEmpty()) {
            DijkstraPair rp = heap.remove();
            map.remove(rp.vname);
            ans.put(rp.vname,rp.cost);
            for (String key : vtces.get(rp.vname).nbrs.keySet()) {
                if (map.containsKey(key)) {
                    int oc = map.get(key).cost;
                    int nc = rp.cost+vtces.get(rp.vname).nbrs.get(key);

                    if (nc < oc) {
                        DijkstraPair gp = map.get(key);
                        gp.psf = rp.psf+key;
                        gp.cost = nc;

                        heap.updadePriority(gp);
                    }

                }
            }
        }


        return ans;
    }



}
