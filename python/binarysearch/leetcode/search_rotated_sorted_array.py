from typing import List


# 搜索旋转排序数组

class Solution:

    def search(self, nums: List[int], target: int) -> int:
        lo, hi = 0, len(nums)-1
        while lo <= hi:
            mid = (lo + hi) // 2
            if nums[mid] == target:
                return mid

            if nums[0] <= nums[mid]:
                if nums[0] <= target < nums[mid]:
                    hi = mid - 1
                else:
                    lo = mid + 1
            else:
                if nums[mid] < target <= nums[-1]:
                    lo = mid + 1
                else:
                    hi = mid - 1
        return -1
        