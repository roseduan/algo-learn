
# 颜色排序
from typing import List


class Solution:

    # 使用计数排序
    def sortColors_1(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        zero, one, two = [0] * nums.count(0), [1] * nums.count(1), [2] * nums.count(2)
        nums[:] = zero + one + two

    # 双指针法
    def sortColors_2(self, nums: List[int]) -> None:
        pass


if __name__ == '__main__':
    res = [1, 1, 2, 1, 1]
    print(res.count(1))
