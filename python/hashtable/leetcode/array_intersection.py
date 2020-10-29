
# 求两个数组的交集
from typing import List


class Solution:

    # 使用一个set
    def intersection_1(self, nums1: List[int], nums2: List[int]) -> List[int]:
        m, res = set(nums1), []
        for n in nums2:
            if n in m:
                res.append(n)
                m.remove(n)
        return res

    # 比较tricky的方式，使用python自带的取交集运算符
    def intersection_2(self, nums1: List[int], nums2: List[int]) -> List[int]:
        return list(set(nums1) & set(nums2))
