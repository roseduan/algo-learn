
# 有效的字母异位词

class Solution:

    # 排序
    def isAnagram_1(self, s: str, t: str) -> bool:
        return sorted(s) == sorted(t)

    # 使用一个哈希表
    def isAnagram_2(self, s: str, t: str) -> bool:
        if len(s) > len(t):
            return self.isAnagram_2(t, s)
        m = {}
        for c in s:
            m[c] = m[c] + 1 if c in m else 1
        for c in t:
            if c not in m or m[c] < 1:
                return False
            m[c] -= 1
        return True
