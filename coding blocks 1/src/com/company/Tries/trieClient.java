package com.company.Tries;

public class trieClient {
    public static void main(String[] args) {
        Trie trie =new Trie();
        trie.addWord("arts");
        trie.addWord("art");
        trie.addWord("bug");
        trie.addWord("bug");
        trie.addWord("boy");
        trie.addWord("sea");
        trie.addWord("seen");
        trie.addWord("see");
        trie.addWord("amit");
        trie.display();
        System.out.println(trie.Search("art"));
        System.out.println(trie.Search("pulkit"));
        System.out.println("====================================");
        trie.remove("art");
        trie.display();
        System.out.println("====================================");
        trie.remove("arts");
        trie.display();

    }
}
