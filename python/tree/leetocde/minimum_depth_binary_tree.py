
# 二叉树的最小深度


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:

    # 递归
    def minDepth_1(self, root: TreeNode) -> int:
        if not root:
            return 0
        left, right = self.minDepth_1(root.left), self.minDepth_1(root.right)
        return left + right + 1 if left == 0 or right == 0 else min(left, right) + 1


    # 广度优先搜索
    def minDepth_2(self, root: TreeNode) -> int:
        queue, res = [root], 0
        while root and len(queue) > 0:
            n, res = len(queue), res + 1
            for _ in range(n):
                node = queue.pop(0)
                if not node.left and not node.right:
                    return res
                for child in [node.left, node.right]:
                    if child:
                        queue.append(child)
        return 0
