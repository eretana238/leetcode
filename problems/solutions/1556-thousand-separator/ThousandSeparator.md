# 1556. Thousand Separator

Reference: https://leetcode.com/problems/thousand-separator/

## Description
```
Given an integer n, add a dot (".") as the thousands separator and return it in string format.

Example 1:

Input: n = 987
Output: "987"
Example 2:

Input: n = 1234
Output: "1.234"

Constraints:
0 <= n <= 231 - 1
```

## Solution
Did a brute force approach solution, iterating thorugh the string representation and finding every third digit from the back to add a period.
```
class Solution {
public:
    string thousandSeparator(int n) {
        string s = to_string(n);
        string result;
        for (int i = 0; i < s.size(); ++i) {
            if (i > 0 && (s.size() - i) % 3 == 0)
                result += ".";
            result += s[i];
        }
        return result;
    }
};
```
Take a look at the [solution file](./ThousandSeparator.cc)

## Main Points
- I just needed to understand (through code) where the period had to be placed
- Trying some sudo code could help organize the ideas for the pattern.
