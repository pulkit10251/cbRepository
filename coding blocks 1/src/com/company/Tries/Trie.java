package com.company.Tries;

import javax.xml.soap.Node;
import java.util.*;

public class Trie {
    private class Node {
        char data;
        HashMap<Character, Node> children;
        boolean IsTerminal;

        Node(char data, boolean IsTerminal) {
            this.data = data;
            this.IsTerminal = IsTerminal;
            this.children = new HashMap<>();
        }
    }

    private int numWords;
    private Node root;

    Trie() {
        this.root = new Node('\0', false);
        this.numWords = 0;
    }

    public int numWords() {
        return this.numWords;
    }

    public void addWord(String word) {
        this.addWord(this.root, word);
    }

    private void addWord(Node parent, String word) {
        if (word.length() == 0) {
            if (parent.IsTerminal) {

            } else {
                parent.IsTerminal = true;
                this.numWords++;
            }
            return;
        }
        char cc = word.charAt(0);
        String ros = word.substring(1);
        Node child = parent.children.get(cc);
        if (child == null) {
            child = new Node(cc, false);
            parent.children.put(cc, child);
        }
        this.addWord(child, ros);
    }

    public void display() {
        this.display(this.root, "");
    }

    private void display(Node node, String osf) {
        if (node.IsTerminal) {
            String todisplay = osf.substring(1) + node.data;
            System.out.println(todisplay);

        }
        Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
        for (Map.Entry<Character, Node> entry : entries) {
            this.display(entry.getValue(), osf + node.data);
        }

    }

    public boolean Search(String word) {
        return this.Search(this.root, word);
    }

    private boolean Search(Node parent, String word) {
        if(word.length()==0){
            if(parent.IsTerminal){
                return true;
            }else{
                return false;
            }
        }
        char cc = word.charAt(0);
        String ros = word.substring(1);
        Node child = parent.children.get(cc);
        if (child == null) {
            return false;
        }
        return this.Search(child,ros);
    }
    public void remove(String word){
        this.remove(this.root,word);
    }
    private void remove(Node parent,String word){
        if(word.length()==0){
            if(parent.IsTerminal){
                parent.IsTerminal=false;
                this.numWords--;
            }else{

            }
            return;
        }
        char cc = word.charAt(0);
        String ros = word.substring(1);
        Node child = parent.children.get(cc);
        if (child == null) {
            return;
        }
        this.remove(child,ros);
        if(!child.IsTerminal && child.children.size()==0){
            parent.children.remove(cc);
        }
    }
//    public String[] wordsbyPrifix(String prefix){
//        char[] cArray=prefix.toCharArray();
//        Node node=root;
//        Node tn=null;
//        int index=0;
//        do{
//            tn=node.children.get(cArray[index]);
//            if(tn==null){
//                return null;
//            }
//            index++;
//            node=tn;
//
//        }while (index< cArray.length);
//        List<String> words=new ArrayList<String>();
//        Deque<Node> DQ = new ArrayDeque<Node>();
//        DQ.addLast(node);
//        while (!DQ.isEmpty()){
//            Node first=DQ.removeFirst();
//            if(first.IsTerminal){
//                words.add(first.children.);
//            }
//        }
//    }
}

