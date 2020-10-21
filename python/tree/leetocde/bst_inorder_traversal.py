from typing import List

# 二叉树的中序遍历
# https://leetcode-cn.com/problems/binary-tree-inorder-traversal


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    
    # 递归
    def inorderTraversal_1(self, root: TreeNode) -> List[int]:
        def helper(node: TreeNode, res):
            if not node:
                return
            helper(node.left, res)
            res.append(node.val)
            helper(node.right, res)
        res = []
        helper(root, res)
        return res

    # 迭代
    def inorderTraversal_2(self, root: TreeNode) -> List[int]:
        stack, cur, res = [], root, []
        while len(stack) > 0 or cur:
            while cur:
                stack.append(cur)
                cur = cur.left
            node = stack.pop()
            res.append(node.val)
            cur = node.right
        return res
