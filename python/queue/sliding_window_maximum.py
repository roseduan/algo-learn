from typing import List


# 滑动窗口的最大值

class Solution:

    # 暴力法
    # 超出时间限制
    def maxSlidingWindow_1(self, nums: List[int], k: int) -> List[int]:
        res = []
        for i in range(len(nums) - k + 1):
            res.append(max(nums[i:i + k]))
        return res
    
    # 使用一个队列
    def maxSlidingWindow_2(self, nums: List[int], k: int) -> List[int]:
        res, queue = [], []
        for i, v in enumerate(nums):
            while len(queue) > 0 and v > nums[queue[-1]]:
                queue.pop(-1)
            queue.append(i)

            while len(queue) > 0 and queue[0] <= i - k:
                queue.pop(0)
            if i >= k - 1:
                res.append(nums[queue[0]])
        return res
 