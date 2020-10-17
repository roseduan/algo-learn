
# 两个数组的交集II
from typing import List


class Solution:
    # 使用哈希表来解决
    def intersect_1(self, nums1: List[int], nums2: List[int]) -> List[int]:
        m, res = {}, []
        for i, v in enumerate(nums1):
            m[v] = m[v] + 1 if v in m else 1
        for n in nums2:
            if n in m and m[n] > 0:
                res.append(n)
                m[n] -= 1
        return res

    # 排序之后使用双指针
    def intersect_2(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums1.sort(), nums2.sort()
        i, j, res = 0, 0, []
        while i < len(nums1) and j < len(nums2):
            if nums1[i] == nums2[j]:
                res.append(nums1[i])
                i, j = i + 1, j + 1
            elif nums1[i] < nums2[j]:
                i += 1
            else:
                j += 1
        return res
