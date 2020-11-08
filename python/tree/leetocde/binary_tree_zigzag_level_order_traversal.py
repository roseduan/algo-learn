from typing import List


# 二叉树的锯齿形层次遍历

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:

    # 广度优先搜索
    def zigzagLevelOrder_1(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        queue, res, level = [root], [], 0
        while len(queue) > 0:
            n, temp, level = len(queue), [], level + 1
            for _ in range(n):
                node = queue.pop(0)
                temp.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            if level % 2 == 0:
                temp.reverse()
            res.append(temp)
        return res

    # 深度优先搜索
    def zigzagLevelOrder_2(self, root: TreeNode) -> List[List[int]]:
        res = []
        self.dfs(root, 0, res)
        return res

    def dfs(self, node, level, res):
        if not node:
            return
        if len(res) == level:
            res.append([])
        res[level].insert(0 if level % 2 == 1 else len(res[level]), node.val)
        self.dfs(node.left, level + 1, res)
        self.dfs(node.right, level + 1, res)
