
# 有效的括号

class Solution:

    # 暴力法
    def isValid_1(self, s: str) -> bool:
        n = len(s)
        while len(s) > 0:
            s = s.replace('()', '', -1).replace('[]', '', -1).replace('{}', '', -1)
            if len(s) == n:
                return False
            n = len(s)
        return True

    # 使用一个栈   
    def isValid_2(self, s: str) -> bool:
        dic = {')': '(', ']': '[', '}': '{'}
        stack = []
        for c in s:
            if c not in dic:
                stack.append(c)
            else:
                if len(stack) == 0 or stack.pop() != dic[c]:
                    return False
        return len(stack) == 0
