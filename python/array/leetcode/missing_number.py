
# 丢失的数字
# https://leetcode-cn.com/problems/missing-number

class Solution:

    # 排序之后再依次遍历查找
    def missingNumber_1(self, nums: List[int]) -> int:
        nums.sort()
        for i, v in enumerate(nums):
            if i != v:
                return i
        return len(nums)

    # 使用一个哈希表
    def missingNumber_1(self, nums: List[int]) -> int:
        s = set(nums)
        for n in range(len(nums) + 1):
            if n not in s:
                return n
