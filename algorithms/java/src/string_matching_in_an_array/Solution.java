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
    
    public static List<String> stringMatching(String[] words) {
        for(int i = 0; i < words.length; i++) {
            
        }
    }
    public static void main(String[] args) {

        String[] words = {"mass", "as", "hero", "superhero"};
        List<String> matched = stringMatching(words);
        for(String match:matched)
            System.out.println(match);
    }
}