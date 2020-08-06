import java.util.HashMap;

public class WordDictionary {
    /** Initialize your data structure here. */
    public class Node {
        HashMap<Character,Node> child;
        boolean endOfWord;
        
        public Node() {
            child = new HashMap<Character,Node>(26);
            endOfWord = false;
        }
    }
    
    Node root;
    boolean finishedWord;
    
    public WordDictionary() {
        root = new Node();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        Node curr = root;
        for(char c: word.toCharArray()) {
            Node place = curr.child.getOrDefault(c, new Node());
            curr.child.put(c,place);
            curr = place;
        }
        curr.endOfWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        Node curr = root;
        recursion(word, curr);
        return finishedWord;
    }
    /** Helper to recurse for backtracking */
    public void recursion(String word, Node curr) {
        if(word.isEmpty()) {
            if(curr.endOfWord)
                finishedWord = true;
            else 
                finishedWord = false;
            return;
        }
        if(word.charAt(0) != '.') {
            if(curr.child.containsKey(word.charAt(0)))
                recursion(word.substring(1), curr.child.get(word.charAt(0)));
        }
        else{
            for(char c: curr.child.keySet()) {
                System.out.println(c);
                recursion(word.substring(1), curr.child.get(c));
            }
        }
        return;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */