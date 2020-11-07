
# 颠倒二进制位


class Solution:
    def reverseBits(self, n: int) -> int:
        res, power = 0, 31
        while n:
            print(n)
            res += (n & 1) << power
            n = n >> 1
            power -= 1
        return res
