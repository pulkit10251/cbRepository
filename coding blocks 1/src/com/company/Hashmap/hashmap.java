package com.company.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("USA",200);
        map.put("UK",150);
        map.put("India",300);
        map.put("China",350);
        System.out.println(map);
        System.out.println(map.get("India"));

        map.put("sweden",125 );
        System.out.println(map);
        System.out.println(map.remove("USA"));
        System.out.println(map);
        map.put("India",325);
        System.out.println(map);
        System.out.println( map.containsKey("India"));
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key);
        }
        Collection<Integer> value=map.values();
        for(Integer val:value){
            System.out.println(val);
        }
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+"\t"+": "+entry.getValue());
        }

    }
}
