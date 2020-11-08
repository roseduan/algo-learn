from typing import List


# 二叉树的前序遍历

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:

    # 递归
    def preorderTraversal_1(self, root: TreeNode) -> List[int]:
        res = []
        self.dfs(root, res)
        return res
       
    def dfs(self, node, res):
        if not node:
            return
        res.append(node.val)
        self.dfs(node.left, res)
        self.dfs(node.right, res)

    # 迭代
    def preorderTraversal_2(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        stack, res = [root], []
        while len(stack) > 0:
            node = stack.pop()
            res.append(node.val)
            if node.right:
                stack.append(node.right)
            if node.left:
                stack.append(node.left)
        return res
