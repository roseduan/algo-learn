
# 括号的分数

class Solution(object):

    def scoreOfParentheses(self, S):
        stack = [0]
        for val in S:
            if val == '(':
                stack.append(0)
            else:
                v = stack.pop()
                stack[-1] += max(2 * v, 1)
        return stack.pop()
