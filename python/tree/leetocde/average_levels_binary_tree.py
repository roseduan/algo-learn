from typing import List


# 二叉树的层平均值

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:

    # 广度优先
    def averageOfLevels_1(self, root: TreeNode) -> List[float]:
        queue, res = [root], []
        while len(queue) > 0:
            n, count = len(queue), 0
            for i in range(n):
                node = queue.pop(0)
                count += node.val
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            res.append(count / n)
        return res
