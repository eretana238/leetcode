// Author : eretana238
// Reference : https://leetcode.com/problems/thousand-separator/

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