
# 二叉树的层次遍历
# https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
from typing import List


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:

    # 广度优先遍历的方式
    def levelOrder_1(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        queue, res = [root], []
        while len(queue) > 0:
            n, temp = len(queue), []
            for _ in range(n):
                node = queue.pop(0)
                temp.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            res.append(temp)
        return res

    # 深度优先遍历的方式
    def levelOrder_2(self, root: TreeNode) -> List[List[int]]:
        def dfs(node: TreeNode, level, res):
            if not node:
                return
            if level == len(res):
                res.append([])
            res[level].append(node.val)
            dfs(node.left, level + 1, res)
            dfs(node.right, level + 1, res)
        r = []
        dfs(root, 0, r)
        return r
