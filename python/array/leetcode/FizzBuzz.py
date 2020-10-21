from typing import List


# Fizz Buzz
# https://leetcode-cn.com/problems/fizz-buzz


class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        res = []
        for i in range(1, n + 1):
            s = str(i)
            if i % 3 == 0 and i % 5 == 0:
                s = 'FizzBuzz'
            elif i % 3 == 0:
                s = 'Fizz'
            elif i % 5 == 0:
                s = 'Buzz'
            res.append(s)
        return res
