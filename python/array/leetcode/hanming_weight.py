

class Solution:

    def hammingWeight_1(self, n: int) -> int:
        res = 0
        while n > 0:
            res += 1
            n &= (n - 1)
        return res


    def hammingWeight_2(self, n: int) -> int:
        return bin(n).count('1')