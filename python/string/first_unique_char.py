
# 字符串中第一个唯一字符

class Solution:

    #  使用一个哈希表
    def firstUniqChar_1(self, s: str) -> int:
        m = {}
        for c in s:
            m[c] = m.get(c, 0) + 1
        for i, c in enumerate(s):
            if m[c] == 1:
                return i
        return -1

    # 使用一个数组
    def firstUniqChar_2(self, s: str) -> int:
        arr = [0] * 26
        for c in s:
            arr[ord(c) - ord('a')] += 1
        for i, c in enumerate(s):
            if arr[ord(c) - ord('a')] == 1:
                return i
        return -1
        