# 归并排序
from typing import List


def merge_sort(data: List[int]) -> None:
    merge_sort_helper(data, 0, len(data) - 1)


def merge_sort_helper(nums: List[int], p, r):
    if p >= r:
        return
    q = (p + r) // 2
    merge_sort_helper(nums, p, q)
    merge_sort_helper(nums, q + 1, r)
    merge(nums, p, q, r)


def merge(nums: List[int], p, q, r):
    temp = []
    i, j = p, q + 1
    while i <= q and j <= r:
        if nums[i] < nums[j]:
            temp.append(nums[i])
            i += 1
        else:
            temp.append(nums[j])
            j += 1
    if i <= q:
        temp[len(temp):] = nums[i:q + 1]
    else:
        temp[len(temp):] = nums[j:r + 1]
    nums[p:r + 1] = temp[:]
