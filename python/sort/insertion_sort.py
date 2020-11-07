
# 插入排序
import random
from typing import List


def insertionSort(data: List[int]):
    length = len(data)
    if length <= 1:
        return

    for i in range(length - 1):
        j, k = i + 1, data[i + 1]
        while j > 0 and data[j - 1] > k:
            data[j] = data[j - 1]
            j -= 1
        data[j] = k
