from typing import List

# 三数之和


class Solution:

    # 暴力法，三层循环
    # 超出时间限制
    def threeSum_1(self, nums: List[int]) -> List[List[int]]:
        res, s = [], set()
        for i in range(len(nums) - 2):
            for j in range(i + 1, len(nums) - 1):
                for k in range(j + 1, len(nums)):
                    if nums[i] + nums[j] == -nums[k]:
                        t = tuple(sorted((nums[i], nums[j], nums[k])))
                        if t not in s:
                            res.append([nums[i], nums[j], nums[k]])
                            s.add(t)
        return res

    # 排序之后，使用双指针
    def threeSum_2(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []
        for i, v in enumerate(nums):
            if v > 0:
                break
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            j, k = i + 1, len(nums) - 1
            while j < k:
                if nums[j] + nums[k] < -v:
                    j += 1
                elif nums[j] + nums[k] > -v:
                    k -= 1
                else:
                    res.append([nums[i], nums[j], nums[k]])
                    j, k = j + 1, k - 1
                    while j < k and nums[j] == nums[j - 1]:
                        j += 1
                    while j < k and nums[k] == nums[k + 1]:
                        k -= 1
        return res


if __name__ == '__main__':
    print('a')