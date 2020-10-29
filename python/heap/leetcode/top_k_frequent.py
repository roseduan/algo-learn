
# 前k个高频元素
from typing import List


class Solution:

    # 使用一个哈希表计数后排序
    def topKFrequent_1(self, nums: List[int], k: int) -> List[int]:
        m = {}
        for n in nums:
            m[n] = m.get(n, 0) + 1
        s = sorted(m.items(), key=lambda x: x[1], reverse=True)
        return [s[i][0] for i in range(k)]

    # map计数之后不排序，使用一个堆
    def topKFrequent_2(self, nums: List[int], k: int) -> List[int]:
        m = {}
        for n in nums:
            m[n] = m[n] + 1 if n in m else 1
        return []
