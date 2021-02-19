
# 括号的分数

class Solution(object):

    def scoreOfParentheses_1(self, S):
        stack = [0]
        for val in S:
            if val == '(':
                stack.append(0)
            else:
                v = stack.pop()
                stack[-1] += max(2 * v, 1)
        return stack.pop()

    def scoreOfParentheses_2(self, S):
        stack = []
        for val in S:
            if val == '(':
                stack.append(val)
            else:
                k = 0
                while stack[-1] != '(':
                    k += stack[-1]
                    stack = stack[:-1]
                stack[-1] = 1 if k == 0 else 2 * k
        return sum(stack)
