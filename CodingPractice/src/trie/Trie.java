package trie;

public class Trie {
    TrieNode root;
    
    Trie(){
        this.root = new TrieNode();    
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        
        trie.insert("rahul");
        trie.insert("raj");
        trie.insert("ranjan");
        trie.insert("ranjas");
        System.out.println(trie.query("rahul"));
        System.out.println(trie.query("raju"));
    }

    public void insert(String chars){
        TrieNode current = root;
        for (int i = 0; i < chars.length(); i++) {
            if(current.children[chars.charAt(i) - 'a'] == null){
                current.children[chars.charAt(i) - 'a'] = new TrieNode();
                current = current.children[chars.charAt(i) - 'a'];
            }else{
                current = current.children[chars.charAt(i) - 'a'];  
            }
        }
        current.isLeafNode = true;
    }
    
    public boolean query(String queryStr){
        TrieNode current = root;

        for (int i = 0; i < queryStr.length(); i++) {
            if(current.children[queryStr.charAt(i) - 'a'] == null){
                return false;
            }else{
                current = current.children[queryStr.charAt(i) - 'a'];
            }
        }
        return true;
    }
    
}
class TrieNode {

    boolean isLeafNode;
    TrieNode[] children;

    TrieNode(){
        this.isLeafNode = false;
        this.children = new TrieNode[26];
    }
    
}
