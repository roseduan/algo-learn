# 字母异位词分组
import collections
from typing import List


class Solution:

    # 排序后使用map进行分组
    def groupAnagrams_1(self, strs: List[str]) -> List[List[str]]:
        m = {}
        for s in strs:
            k = str(sorted(s))
            if k in m:
                m[k].append(s)
            else:
                m[k] = [s]
        return list(m.values())

    # python更加tricky的一种写法
    def groupAnagrams_2(self, strs: List[str]) -> List[List[str]]:
        dic = collections.defaultdict(list)
        for s in strs:
            dic[tuple(sorted(s))].append(s)
        return list(dic.values())
