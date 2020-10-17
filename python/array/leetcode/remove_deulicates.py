
# 删除排序数组中的重复项
from typing import List


class Solution:
    # 新开一个数组来存储
    def removeDuplicates_1(self, nums: List[int]) -> int:
        if len(nums) <= 1:
            return len(nums)
        temp = [nums[0]]
        for n in nums:
            if n != temp[-1]:
                temp.append(n)
        nums[:] = temp[:]
        return len(temp)

    # 双指针
    def removeDuplicates_2(self, nums: List[int]) -> int:
        i, j = 0, 1
        while j < len(nums):
            if nums[i] == nums[j]:
                j += 1
            else:
                nums[i + 1] = nums[j]
                i, j = i + 1, j + 1
        return i + 1


if __name__ == '__main__':
    data1 = [9, 9]
    data2 = [1, 3, 2]
    data2[:] = data1[:]
    print(data2)
