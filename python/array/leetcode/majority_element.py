from typing import List


# 多数元素


class Solution:

    # 排序之后取中间值
    def majorityElement_1(self, nums: List[int]) -> int:
        return sorted(nums)[len(nums) // 2]

    # 使用一个哈希表
    def majorityElement_2(self, nums: List[int]) -> int:
        m = {}
        for n in nums:
            m[n] = m.get(n, 0) + 1
            if m[n] > len(nums) // 2:
                return n
    
    # 摩尔投票法
    def majorityElement_3(self, nums: List[int]) -> int:
        pass
