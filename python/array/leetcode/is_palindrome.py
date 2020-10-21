
# 验证回文串
# https://leetcode-cn.com/problems/valid-palindrome

class Solution:
    def isPalindrome(self, s: str) -> bool:
        if len(s) <= 1:
            return True
        i, j = 0, len(s) - 1
        while i < j:
            if not s[i].isalnum():
                i += 1
                continue
            if not s[j].isalnum():
                j -= 1
                continue
            if s[i].lower() != s[j].lower():
                return False
            i, j = i + 1, j - 1
        return True
