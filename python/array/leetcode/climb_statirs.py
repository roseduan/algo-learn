
# 爬楼梯


class Solution:
    # 递归
    def climbStairs(self, n: int) -> int:
        if n <= 2:
            return n
        return self.climbStairs(n - 1) + self.climbStairs(n - 2)

    # 递归+备忘录
    def climbStairs2(self, n: int) -> int:

        def helper(x: int) -> int:
            if x <= 2:
                return x
            if x in mem:
                return mem[x]
            res = helper(x - 1) + helper(x - 2)
            mem[x] = res
            return res
        mem = {}
        return helper(n)

    # 动态规划
    def climbStairs3(self, n: int) -> int:
        front, back = 0, 1
        for _ in range(n):
            front, back = back, front + back
        return back
