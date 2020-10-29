# 电话号码的字母组合
from typing import List


class Solution:

    letters = {
        '2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl',
        '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'
    }

    def letterCombinations(self, digits: str) -> List[str]:
        res = []
        if not digits:
            return res
        self.helper(0, digits, [], res)
        return res

    def helper(self, i, digits, cur, res):
        if i == len(digits):
            res.append(''.join(cur))
        else:
            for v in self.letters[digits[i]]:
                cur.append(v)
                self.helper(i + 1, digits, cur, res)
                cur.pop()
