
# 是否存在重复元素
from typing import List


class Solution:
    # set判重
    def containsDuplicate_1(self, nums: List[int]) -> bool:
        return len(set(nums)) != len(nums)

    # 排序，然后遍历
    def containsDuplicate_2(self, nums: List[int]) -> bool:
        nums.sort()
        for i in range(len(nums) - 1):
            if nums[i] == nums[i + 1]:
                return True
        return False
