
# 求x的平方根

class Solution:

    def mySqrt(self, x: int) -> int:
        lo, hi = 1, x
        while lo <= hi:
            mid = (lo + hi) // 2
            if mid * mid < x:
                lo = mid + 1
            elif mid * mid > x:
                hi = mid - 1
            else:
                return mid
        return hi
