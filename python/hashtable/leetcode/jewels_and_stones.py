
# 宝石与石头

class Solution:

    # 使用一个哈希表
    def numJewelsInStones_1(self, J: str, S: str) -> int:
        s, res = set(J), 0
        for c in S:
            if c in s:
                res += 1
        return res

    # 另一种写法
    def numJewelsInStones_2(self, J: str, S: str) -> int:
        s = set(J)
        return sum(c in s for c in S)
