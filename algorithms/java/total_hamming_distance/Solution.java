/**
 * 477. Total Hamming Distance
 * 
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Now your job is to find the total Hamming distance between all pairs of the given numbers.
 * Example:
 * Input: 4, 14, 2
 * Output: 6
 * Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (justshowing the four bits relevant 
 * in this case). So the answer will be: HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
 */

class Solution {
    /**
     * Goes through all the bits and compares them to the number given and finds the distance 
     * @param nums
     * @return result
     */
    public static int totalHammingDistance(int[] nums) {
        int result = 0;
        for(int i = 0; i < 32; i++) {
            int count = 0;
            for(int num: nums) count += (num >> i) & 1;
            result += count * (nums.length - count);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4,14,2};
        int result = totalHammingDistance(nums);
        System.out.println(result);
    }
}