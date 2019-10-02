package com.company.Hashmap;

import com.company.genericANDinterface.LinkedList;
import com.sun.javaws.HtmlOptions;

public class HashTable<K,V> {
    private class HTPair{
        K key;
        V value;
        HTPair(K key ,V value ){
            this.key=key;
            this.value=value;
        }
        public boolean equals(Object other){
            HTPair op=(HTPair) other;
            return this.key.equals(op.key);
        }
        public String toString(){
            return "{"+this.key+"-"+this.value+"}";
        }
    }
    public static final int DEFAULT_CAPACITY=10;
    private LinkedList<HTPair>[] BucketArray;
    private int size;
    public HashTable(){
        this(DEFAULT_CAPACITY);
    }
    public HashTable(int Capacity){
        this.BucketArray=(LinkedList<HTPair>[]) new LinkedList[Capacity];
        this.size=0;
    }
    public void put(K key,V value) throws Exception{
        int bi=HashFunction(key);
        LinkedList<HTPair> bucket=this.BucketArray[bi];
        HTPair pta=new HTPair(key, value);
        if(bucket==null){
            bucket=new LinkedList<>();
            bucket.addLast(pta);
            this.BucketArray[bi]=bucket;
            this.size++;
        }else{
            int findAt=bucket.find(pta);
            if(findAt==-1){
                bucket.addLast(pta);
                this.size++;
            }else{
                HTPair pair=bucket.getAt(findAt);
                pair.value=value;
            }
        }

        double lambda=(this.size*1.0)/this.BucketArray.length;
        if(lambda>2){
            rehash();
        }
    }
    private void rehash() throws Exception{
        LinkedList<HTPair> [] oba=this.BucketArray;
        this.BucketArray=(LinkedList<HTPair>[]) new LinkedList[2*oba.length];
        for(LinkedList<HTPair> ob:oba){
            while(ob!=null &&!ob.IsEmpty()){
                HTPair pair=ob.removeFirst();
                this.put(pair.key,pair.value);
            }
        }
    }
    public V get(K key) throws Exception{
        int bi=HashFunction(key);
        LinkedList<HTPair> bucket=this.BucketArray[bi];
        HTPair ptf=new HTPair(key,null);
        if(bucket==null){
            return null;
        }else{
            int findAt=bucket.find(ptf);
            if(findAt==-1){
                return null;
            }else{
                HTPair pair=bucket.getAt(findAt);
                return pair.value;
            }
        }
    }
    private int HashFunction(K key){
        int hc=key.hashCode();
        hc=Math.abs(hc);
        int bi=hc%this.BucketArray.length;
        return bi;
    }
    public void diplay() throws Exception{
        System.out.println("===========================================================");
        for(LinkedList<HTPair> bucket:this.BucketArray){
            if(bucket!=null && !bucket.IsEmpty() ){
                bucket.display();
            }else{
                System.out.println("NULL");
            }
        }
        System.out.println("===========================================================");
    }
    public V remove(K key)throws Exception{
        int bi=HashFunction(key);
        LinkedList<HTPair> bucket=this.BucketArray[bi];
        HTPair ptf=new HTPair(key,null);
        if(bucket==null){
            return null;
        }else{
            int findAt=bucket.find(ptf);
            if(findAt==-1){
                return null;
            }else{
                HTPair pair=bucket.getAt(findAt);
                bucket.removeAt(findAt);
                this.size--;
                return pair.value;
            }
        }
    }

}
