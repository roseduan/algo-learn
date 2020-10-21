
# 最长公共前缀
from typing import List


class Solution:

    # 暴力法
    def longestCommonPrefix_1(self, strs: List[str]) -> str:
        if not strs:
            return ''
        res, k = '', 0
        while True:
            temp = []
            for s in strs:
                if k < len(s):
                    temp.append(s[k])
            temp.sort()
            if len(temp) != len(strs) or temp[0] != temp[-1]:
                return res
            k += 1
            res += temp[0]

    # 另一种写法
    def longestCommonPrefix_2(self, strs: List[str]) -> str:
        if not str or len(strs) == 0:
            return ''
        for i in range(len(strs[0])):
            c = strs[0][i]
            for j in range(1, len(strs)):
                if i == len(strs[j]) or strs[j][i] != c:
                    return strs[0][:i]
        return strs[0]
