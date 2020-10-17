
# 是否存在重复元素II
from typing import List


class Solution:

    # 暴力法，依次遍历
    def containsNearbyDuplicate_1(self, nums: List[int], k: int) -> bool:
        for i in range(len(nums) - 1):
            for j in range(i + 1, len(nums)):
                if j - i > k:
                    break
                if nums[j] == nums[i]:
                    return True
        return False

    # 使用一个哈希表
    def containsNearbyDuplicate_2(self, nums: List[int], k: int) -> bool:
        m = {}
        for i, v in enumerate(nums):
            if v in m and i - m[v] <= k:
                return True
            m[v] = i
        return False
