import random
from typing import List

# 冒泡排序


def bubbleSort1(data: List[int]):
    length = len(data)
    if length <= 1:
        return

    for i in range(length):
        for j in range(length - i - 1):
            if data[j] > data[j + 1]:
                data[j], data[j + 1] = data[j + 1], data[j]


# 另一种写法
def bubbleSort2(data: List[int]):
    length = len(data)
    if length <= 1:
        return

    for i in range(length):
        swap = False
        for j in range(length - i - 1):
            if data[j] > data[j + 1]:
                data[j], data[j + 1] = data[j + 1], data[j]
                swap = True
        if not swap:
            break
