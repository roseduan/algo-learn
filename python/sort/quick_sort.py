from typing import List


# 快速排序


def quick_sort(data: List[int]):
    quick_sort_helper(data, 0, len(data) - 1)


def quick_sort_helper(data, lo, hi):
    if lo >= hi:
        return
    mid = partition(data, lo, hi)
    quick_sort_helper(data, lo, mid - 1)
    quick_sort_helper(data, mid + 1, hi)


def partition(data, lo, hi) -> int:
    pivot = data[hi]
    i, j = lo, lo
    while j < hi:
        if data[j] < pivot:
            data[i], data[j] = data[j], data[i]
            i += 1
        j += 1
    data[i], data[hi] = data[hi], data[i]
    return i
