from typing import List


# 在排序数组中查找元素的第一个和最后一个位置

class Solution:

    # 遍历的方式
    def searchRange_1(self, nums: List[int], target: int) -> List[int]:
        res = [-1, -1]
        for i in range(len(nums)):
            if nums[i] == target:
                if i == 0 or nums[i - 1] != nums[i]:
                    res[0] = i
                if i == len(nums) - 1 or nums[i] != nums[i + 1]:
                    res[1] = i
        return res


    # 二分查找
    def searchRange_2(self, nums: List[int], target: int) -> List[int]:
        pass
    