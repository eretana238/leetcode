import java.util.ArrayList;
import java.util.List;

/**
 * 442. Find All Duplicates in an Array
 * 
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 * Could you do it without extra space and in O(n) runtime?
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * [7,3,2,4,8,2,3,1]
 * Output:
 * [2,3]
 */

public class Solution {
    /**
     * 
     * @param nums the array of integers to check for duplicates
     * @return List of duplicates
     * Traverses through the array of integers and keeps track of them by setting the numbers in their respective 
     * indexes negative, if finding an negative number at that index, then its a duplicate
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            int id = Math.abs(nums[i])-1;
            if(nums[id] < 0) 
                duplicates.add(++id);
            else
                nums[id] = -nums[id];
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] testArr = {4,3,2,7,8,2,3,1};
        Solution sol = new Solution();
        List<Integer> duplicates = sol.findDuplicates(testArr);
        for(int duplicate: duplicates) {
            System.out.println(duplicate);
        }
    }
}