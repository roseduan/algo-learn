
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


if __name__ == '__main__':
    num = [5, 3]
    insertionSort(num)
    print(num)

    num = [1, 1, 1, 1, 1]
    insertionSort(num)
    print(num)

    num = [int(random.random() * 200) for _ in range(100)]
    insertionSort(num)
    print(num)
