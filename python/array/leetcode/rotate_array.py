# 旋转数组
from typing import List


class Solution:
    # 借助一个额外的数组处理
    def rotate_1(self, nums: List[int], k: int) -> None:
        n, k = len(nums), k % len(nums)
        temp = nums[n - k:]
        for i in range(n - k):
            temp.append(nums[i])
        nums[:] = temp[:]

    # 倒序处理
    def rotate_2(self, nums: List[int], k: int) -> None:
        def helper(arr: List[int], p, q):
            while p < q:
                arr[p], arr[q] = arr[q], arr[p]
                p, q = p + 1, q - 1

        n, k = len(nums), k % len(nums)
        nums.reverse()
        helper(nums, 0, k - 1)
        helper(nums, k, n - 1)
