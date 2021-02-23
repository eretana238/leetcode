'''
 202. Happy Number
 '''
class Solution:
    def isHappy(self, n: int) -> bool:
        nums = set()
        global_sum = 0
        while not n in nums:
            if n == 1:
                return True
            nums.add(n)
            n = self.sum_squares(n)
        return False


        return False
            
    def sum_squares(self, n: int):
        result = 0
        while n:
            digit = n % 10
            n -= digit
            digit = digit ** 2
            result += digit
            n = n / 10
        return result


sol = Solution()
print(sol.isHappy(920))