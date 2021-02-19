
# 下一个更大元素I
from typing import List


class Solution:

    # 暴力法
    def nextGreaterElement1(self, nums1: List[int], nums2: List[int]) -> List[int]:
        m, res = {}, []
        for i in range(len(nums2)):
            m[nums2[i]] = i

        for i in range(len(nums1)):
            exist = False
            for j in range(m[nums1[i]] + 1, len(nums2)):
                if nums2[j] > nums1[i]:
                    exist = True
                    res.append(nums2[j])
                    break
            if not exist:
                res.append(-1)
        return res

    # 使用栈+哈希表
    def nextGreaterElement2(self, nums1: List[int], nums2: List[int]) -> List[int]:
        stack, m = [], {}
        for n in nums2:
            while len(stack) > 0 and stack[-1] < n:
                m[stack[-1]] = n
                stack = stack[:-1]
            stack.append(n)

        return [m.get(n, -1) for n in nums1]
