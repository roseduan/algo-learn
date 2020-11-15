
# x的n次方

class Solution:

    # 分治递归
    def myPow_1(self, x: float, n: int) -> float:
        return self.helper(x, n) if n > 0 else 1 / self.helper(x, -n)

    def helper(self, x, n) -> float:
        if n == 0:
            return 1
        if n == 1:
            return x
        res = self.helper(x, n // 2)
        return res * res if n % 2 == 0 else res * res * x
