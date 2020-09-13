import java.util.ArrayList;
import java.util.List;

/**
 * 1408. String Matching in an Array
 * 
 * Given an array of string words. Return all strings in words which is substring of another word in any order. 
 * String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].
 * Example 1:
 * Input: words = ["mass","as","hero","superhero"]
 * Output: ["as","hero"]
 * Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
 * ["hero","as"] is also a valid answer.
 */

public class Solution {
    
    public List<String> stringMatching(String[] words) {
        List<String> matches = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            for(int j = i; j < words.length; j++) {
                if(i != j && words[i].contains(words[j])) {
                    matches.add(words[i]);
                    break;
                }
                
            }
        }
        return matches;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"mass", "as", "hero", "superhero"};
        List<String> matched = sol.stringMatching(words);
        for(String match:matched)
            System.out.println(match);
    }
}