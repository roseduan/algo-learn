from typing import List

# 装水最多的容器


class Solution:
    # 暴力法，两次遍历寻找最大值
    def maxArea1(self, height: List[int]) -> int:
        res = 0
        for i in range(len(height) - 1):
            for j in range(i + 1, len(height)):
                area = min(height[i], height[j]) * (j - i)
                if area > res:
                    res = area
        return res

    # 双指针法
    def maxArea2(self, height: List[int]) -> int:
        res, i, j = 0, 0, len(height) - 1
        while i < j:
            res = max(res, min(height[i], height[j]) * (j - i))
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return res
