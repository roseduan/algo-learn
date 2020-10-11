from typing import List

# 合并有序数组


class Solution:

    # 将nums2添加到nums1中，再重新排序
    def merge1(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        nums1[m:] = nums2[:]
        nums1.sort()

    # 使用一个临时数组，再双指针遍历
    def merge2(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        temp = []
        i, j = 0, 0
        while i < m and j < n:
            if nums1[i] < nums2[j]:
                temp.append(nums1[i])
                i += 1
            else:
                temp.append(nums2[j])
                j += 1
        if i < m:
            temp[len(temp):] = nums1[i:m]
        else:
            temp[len(temp):] = nums2[j:n]
        nums1[:] = temp[:]

    # 倒序双指针法
    def merge3(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i, j, k = m - 1, n - 1, len(nums1) - 1
        while i >= 0 and j >= 0:
            if nums1[i] < nums2[j]:
                nums1[k] = nums2[j]
                j -= 1
            else:
                nums1[k] = nums1[i]
                i -= 1
            k -= 1
        if j >= 0:
            nums1[:k+1] = nums2[:j+1]
