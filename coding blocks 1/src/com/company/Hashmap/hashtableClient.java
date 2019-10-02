package com.company.Hashmap;

public class hashtableClient {
    public static void main(String[] args) throws Exception {
        HashTable<String,Integer> map=new HashTable<>(5);
        map.put("USA",200);
        map.put("UK",150);
        map.put("India",300);
        map.put("China",350);
        map.diplay();
        map.put("Sweden",100);
        map.diplay();
        map.put("India",325);
        map.diplay();
        System.out.println( map.get("India"));
        System.out.println("==============================remove===============================");
        System.out.println(map.remove("India"));
        map.diplay();
    }
}
