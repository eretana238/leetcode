// Author : eretana238
// Reference : https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
public:
    int fib(int n) {
        int a = 0;
        int b = 1;
        int tot = 1;
        
        if (n <= 1) return n;
        
        for (int i = 2; i <= n; i++) {
            tot = a + b;
            a = b;
            b = tot;
        }
        return tot;
    }
};