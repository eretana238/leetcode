# 1480. Running Sum of 1d Array

Reference: https://leetcode.com/problems/running-sum-of-1d-array/

## Description
```
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
```

## Solution

First thing that came into mind was to do a brute force solution in O(n) time complexity and O(n) space complexity. That is to traverse through each element and add the current element to the sum of the previous. So that will require for a result vector to store the sequence of previous sums and a simple traversing of the nums vector.
```
class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
       vector<int> result = {nums[0]};
        
        for (int i = 1; i < nums.size(); i++)
            result.push_back(result.back() + nums[i]);
        return result;
    }
};  
```
Take a look at the [solution file](./RunningSumOf1DArray.cc)

## Main Points
-  I need to get into the mindset of thinking if any data structure will be useful. 
