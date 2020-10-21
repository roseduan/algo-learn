
# 对称二叉树
# https://leetcode-cn.com/problems/symmetric-tree/


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:

    # 递归的方式，深度优先
    def isSymmetric_1(self, root: TreeNode) -> bool:
        def helper(a, b) -> bool:
            if not a and not b:
                return True
            if not a or not b or a.val != b.val:
                return False
            return helper(a.left, b.right) and helper(a.right, b.left)
        return helper(root, root)

    # 使用一个队列，广度优先
    def isSymmetric_2(self, root: TreeNode) -> bool:
        def helper(node1: TreeNode, node2: TreeNode) -> bool:
            queue = [node1, node2]
            while len(queue) > 0:
                n1, n2 = queue.pop(0), queue.pop(0)
                if not n1 and not n2:
                    continue
                if not n1 or not n2 or n1.val != n2.val:
                    return False
                queue.append(n1.left), queue.append(n2.right)
                queue.append(n1.right), queue.append(n2.left)
            return True
        return helper(root, root)
