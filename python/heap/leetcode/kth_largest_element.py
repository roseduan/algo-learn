from typing import List


# 数组中的第k大元素

class Solution:

    # 排序
    def findKthLargest_1(self, nums: List[int], k: int) -> int:
        return sorted(nums)[len(nums) - k]

    # 使用一个堆
    def findKthLargest_2(self, nums: List[int], k: int) -> int:
        pass
