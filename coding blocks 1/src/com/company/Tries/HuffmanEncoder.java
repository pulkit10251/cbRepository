package com.company.Tries;
import com.company.Heap.HeapGeneric;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanEncoder {
    HashMap<Character, String> Encoder;
    HashMap<String, Character> Decoder;

    public HuffmanEncoder(String feeder) {
        // 1. create frequency map
        HashMap<Character, Integer> fmap = new HashMap<>();
        for (int i = 0; i < feeder.length(); i++) {
            char cc = feeder.charAt(i);
            if (fmap.containsKey(cc)) {
                int ov = fmap.get(cc);
                ov = ov + 1;
                fmap.put(cc, ov);
            } else {
                fmap.put(cc, 1);
            }

        }
        // 2. create a min heap
        HeapGeneric<Node> minHeap=new HeapGeneric<>(true);
        Set<Map.Entry<Character,Integer>> entryset=fmap.entrySet();
        for(Map.Entry<Character,Integer> entry: entryset){
            Node node =new Node(entry.getKey(),entry.getValue());
            minHeap.add(node);
        }
        // 3. combine nodes until one node is left
        while(minHeap.size()!=1){
            Node minone=minHeap.remove();
            Node mintwo=minHeap.remove();

            Node combined=new Node(minone,mintwo);
            combined.data='\0';
            combined.cost=minone.cost+mintwo.cost;
            minHeap.add(combined);
        }
        Node ft=minHeap.remove();
        this.Decoder=new HashMap<>();
        this.Encoder=new HashMap<>();

        this.initEncoderDecoder(ft,"");
    }
    private void initEncoderDecoder(Node node,String osf){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            this.Encoder.put(node.data,osf);
            this.Decoder.put(osf,node.data);
        }
        this.initEncoderDecoder(node.left,osf+"0");
        this.initEncoderDecoder(node.right,osf+"1");
    }
    public String encode(String source ){
        String rv="";
        for(int i=0;i<source.length();i++){
            String code=this.Encoder.get(source.charAt(i));
            rv=rv+code;
        }
        return rv;
    }
    public String decode(String codedstring ){
        String rv="";
        String key="";
        for(int i=0;i<codedstring.length();i++) {
            key = key + codedstring.charAt(i);
            if (this.Decoder.containsKey(key)) {
                rv = rv + this.Decoder.get(key);
                key = "";
            }
        }
            return rv;

    }


    private class Node implements Comparable<Node> {
        Character data;
        int cost;
        Node left;
        Node right;

        Node(char data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;

        }
        Node(Node left,Node right){
            this.left=left;
            this.right=right;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
}

