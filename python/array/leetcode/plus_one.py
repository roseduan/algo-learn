# 加一
from typing import List


class Solution:

    def plusOne_1(self, digits: List[int]) -> List[int]:
        for i in range(len(digits) - 1, -1, -1):
            if digits[i] < 9:
                digits[i] += 1
                return digits
            digits[i] = 0
        return [1] + digits

    # 这nm还是高票答案，简单粗暴，但是其他语言貌似不行的，会数据溢出
    def plusOne_2(self, digits: List[int]) -> List[int]:
        s, res = '', []
        for n in digits:
            s += str(n)
        for i in str(int(s) + 1):
            res.append(int(i))
        return res
