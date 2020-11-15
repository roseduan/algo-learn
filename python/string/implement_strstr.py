# 实现 strStr()
# https://leetcode-cn.com/problems/implement-strstr


class Solution:

    # BF 算法，其他的几种太复杂了，暂时不去动（BM、KMP。。。）
    def strStr_1(self, haystack: str, needle: str) -> int:
        for i in range(len(haystack) - len(needle) + 1):
            j = 0
            while j < len(needle):
                if needle[j] != haystack[i + j]:
                    break
                j += 1
            if j == len(needle):
                return i
        return -1
