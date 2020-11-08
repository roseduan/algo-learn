
# 最后一个单词的长度

class Solution:

    def lengthOfLastWord(self, s: str) -> int:
        if not s:
            return 0
        s = s.strip()
        res, i = 0, len(s) - 1
        while i >= 0 and s[i] != ' ':
            res, i = res + 1, i - 1
        return res
    