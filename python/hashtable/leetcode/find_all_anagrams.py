from typing import List
from copy import copy


# 找到字符串中所有的字母异位词

class Solution:

    # 排序的方式
    def findAnagrams_1(self, s: str, p: str) -> List[int]:
        res, p = [], sorted(p)
        for i in range(len(s) - len(p) + 1):
            if sorted(s[i:len(p) + i]) == p:
                res.append(i)
        return res

    # 使用哈希表
    def findAnagrams_2(self, s: str, p: str) -> List[int]:
        res = []
        for i in range(len(s) - len(p) + 1):
            if self.valid(p, s[i:len(p) + i]):
                res.append(i)
        return res

    def valid(self, p, s) -> bool:
        m = [0] * 26
        for c in p:
            m[ord(c) - ord('a')] += 1
        for c in s:
            if m[ord(c) - ord('a')] == 0:
                return False
            m[ord(c) - ord('a')] = m[ord(c) - ord('a')] - 1
        return True
