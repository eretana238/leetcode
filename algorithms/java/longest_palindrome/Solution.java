import java.util.HashMap;
import java.util.Map;

/**
 * 409. Longest Palindrome
 * 
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 * 
 * Example 1:
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * 
 * Example 2:
 * Input: s = "a"
 * Output: 1
 * 
 * Example 3:
 * Input: s = "bb"
 * Output: 2
 * 
 */

public class Solution {
    public int longestPalindrome(String s) {
        boolean hasOne = false;
        int length = 0;
        int maxOdd = 0;
        HashMap<Character, Integer> dictionary = new HashMap<>();
        // setup dictionary of characters
        for(char c: s.toCharArray()) {
            if(dictionary.containsKey(c)) {
                dictionary.replace(c, dictionary.get(c)+1);
            }
            else {
                dictionary.put(c,1);
            }
        }
        System.out.println(dictionary);

        for(Map.Entry<Character, Integer> entry: dictionary.entrySet()) {
            // add the evens, remove from dictionary 
            if(entry.getValue() % 2 == 0) {
                length += entry.getValue();
                // dictionary.remove(entry.getKey());
            }
            // find odds
            else {
                if(entry.getValue() > maxOdd) {
                    if(entry.getValue() == 1) {
                        length++;
                        maxOdd = 1;
                    }
                    else {
                        if(maxOdd != 0)
                            length += maxOdd-1;
                        maxOdd = entry.getValue();
                    }
                }
                else{
                    length += entry.getValue()-1;
                }
            }
            // find max odd 
        }
        if(maxOdd != 1)
            return length + maxOdd;
        return length;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int length = sol.longestPalindrome("bbbbbccc");
        System.out.println(length);
    }
}