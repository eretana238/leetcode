class Solution:
    def maxScore(self, s: str) -> int:
        max_score = 0
        for i in range(1,len(s)):
            total_score = s[:i].count('0') + s[i:].count('1')
            if total_score > max_score:
                max_score = total_score
        return max_score

sol = Solution()
print(sol.maxScore('00111'))