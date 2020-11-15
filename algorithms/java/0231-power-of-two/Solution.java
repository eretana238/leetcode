/**
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * An integer n is a power of two, if there exists an integer x such that n == 2^x.
 * 
 * Example 1:
 * Input: n = 1
 * Output: true
 * Explanation: 2^0 = 1
 * 
 * Example 2:
 * Input: n = 16
 * Output: true
 * Explanation: 2^4 = 16
 * 
 * Example 3:
 * Input: n = 3
 * Output: false
 * 
 * Example 4:
 * Input: n = 4
 * Output: true
 * 
 * Example 5:
 * Input: n = 5
 * Output: false
 */

class Solution {
    public static boolean isPowerOfTwo(int n) {
        if(n == 0)
            return false;
        while(true) {
            if(n == 1)
                break;
            if(n % 2 != 0 && n != 1)
                return false;
            n /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(10));
        System.out.println(isPowerOfTwo(16));
    }
}