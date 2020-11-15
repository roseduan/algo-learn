
# 翻转字符串中的单词


class Solution:
    def reverseWords(self, s: str) -> str:
        return ' '.join(reversed(s.split()))
        