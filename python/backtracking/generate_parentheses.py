
# 括号生成
from typing import List


class Solution:
    # 深度优先的思路解决
    def generateParenthesis1(self, n: int) -> List[str]:
        res = []
        self.helper(n, 0, 0, '', res)
        return res

    def helper(self, n, left, right, cur, res):
        if len(cur) == 2 * n:
            res.append(cur)
            return
        if left < n:
            self.helper(n, left + 1, right, cur + '(', res)
        if right < left:
            self.helper(n, left, right + 1, cur + ')', res)

    # 广度优先的思路
    def generateParenthesis2(self, n: int) -> List[str]:
        pass
