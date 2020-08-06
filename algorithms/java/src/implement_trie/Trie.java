import java.util.HashMap;

public class Trie {
    /** Initialize your data structure here. */
    class TrieNode {
        HashMap<Character,TrieNode> child;
        boolean endOfWord;

        public TrieNode() {
            child = new HashMap<Character,TrieNode>(26);
            endOfWord = false;
        }
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current = root;
        for(char c: word.toCharArray()) {
            TrieNode node = current.child.getOrDefault(c, new TrieNode());
            current.child.put(c, node);
            current = node;
        }
        current.endOfWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode current = root;
        for(char c: word.toCharArray()) {
            if(!current.child.containsKey(c))
                return false;
            current = current.child.get(c);
        }
        return current.endOfWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(char c: prefix.toCharArray()) {
            if(!current.child.containsKey(c))
                return false;
            current = current.child.get(c);
        }
        return true;
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */