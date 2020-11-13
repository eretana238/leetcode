import java.util.ArrayList;

/**
 * Solution
 */
public class Solution {

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0; 
        double max = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double res=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
                res=Math.max(res,sum);
        }
        return res/k;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(arr, 4));
    }
}