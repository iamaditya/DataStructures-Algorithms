package com.DataStructure.Tries;

class Trie{
    Trie[] arr;
    boolean endofword;

    public Trie(){
        arr = new Trie[26];
        endofword = false;
    }

}
public class Main {

    public static void insert(Trie root, String key){
        Trie CurrNode = root;

        for (int i=0;i<key.length();i++){
            char ch = key.charAt(i);

            if(CurrNode.arr[ch-'a'] == null){
                Trie newNode = new Trie();
                CurrNode.arr[ch-'a'] = newNode;
            }
            CurrNode = CurrNode.arr[ch-'a'];
        }
        CurrNode.endofword = true;
    }


    public static boolean search(Trie root, String key){
        Trie currNode = root;


        for(int i=0;i<key.length();i++){
            char ch = key.charAt(i);

            if(currNode.arr[ch- 'a'] == null) return false;
            currNode = currNode.arr[ch - 'a'];
        }

        return currNode.endofword;
    }
    public static void main(String[] args) {
        String key = "aditya";
        String keys = "adi";

        Trie root = new Trie();

        insert(root, key);

        boolean ans  = search(root, keys);
        System.out.println(keys+" : "+ans);
    }
}
