import java.util.Arrays;

/**
 * 977. Squares of a Sorted Array
 * 
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 * 
 * Example 1:
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */

public class Solution {
    public static int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            B[i] = (int)Math.pow(A[i], 2);
        }
        Arrays.sort(B);
        return B;
    }
    public static void main(String[] args) {
        int[] A = {-4, -1, 0, 3, 10};
        int[] results = sortedSquares(A);
        for(int result: results) {
            System.out.println(result);
        }
    }
}