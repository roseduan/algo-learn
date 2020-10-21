
# 二叉树的最大深度
# https://leetcode-cn.com/problems/maximum-depth-of-binary-tree

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:

    # 递归的方式
    def maxDepth(self, root: TreeNode) -> int:
        return 0 if not root else max(self.maxDepth(root.left), self.maxDepth(root.right)) + 1

    # 广度优先遍历的方式
    def maxDepth_2(self, root: TreeNode) -> int:
        if not root:
            return 0
        queue, level = [root], 0
        while len(queue) > 0:
            n = len(queue)
            for i in range(n):
                node = queue.pop(0)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            level += 1
        return level
