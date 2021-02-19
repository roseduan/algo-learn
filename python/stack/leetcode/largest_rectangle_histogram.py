
# 柱状图中的最大矩形
from typing import List


class Solution:

    # 暴力法
    def largestRectangleArea1(self, heights: List[int]) -> int:
        res = heights[0]
        for i in range(len(heights)):
            min_height = heights[i]
            for j in range(i, len(heights)):
                min_height = min(min_height, heights[j])
                res = max(res, min_height * (j - i + 1))
        return res

    # 使用一个栈
    def largestRectangleArea2(self, heights: List[int]) -> int:
        stack, res = [-1], 0
        for i in range(len(heights)):
            while len(stack) > 1 and heights[stack[-1]] > heights[i]:
                n = stack[-1]
                stack = stack[:-1]
                res = max(res, heights[n] * (i - stack[-1] - 1))
            stack.append(i)

        if len(stack) > 1:
            k = stack[-1]
            while len(stack) > 1:
                n = stack[-1]
                stack = stack[:-1]
                res = max(res, heights[n] * (k - stack[-1]))
        return res
