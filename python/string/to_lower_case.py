

# 转换成小写字母

class Solution:

    def toLowerCase(self, str: str) -> str:
        res = ''
        for c in str:
            if 65 <= ord(c) <= 90:
                res += chr(ord(c) + 32)
            else:
                res += c
        return res
