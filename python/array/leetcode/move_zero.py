from typing import List


# 移动零


class Solution:

    # 新开一个数组
    def moveZeroes1(self, nums: List[int]) -> None:
        temp, k = [0] * len(nums), 0
        for n in nums:
            if n != 0:
                temp[k] = n
                k += 1
        nums[:] = temp[:]

    # 双指针解法
    def moveZeroes2(self, nums: List[int]) -> None:
        k = 0
        for i, v in enumerate(nums):
            if v != 0:
                nums[i], nums[k] = nums[k], nums[i]
                k += 1
