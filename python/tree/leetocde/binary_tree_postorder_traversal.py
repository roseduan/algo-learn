
# 二叉树的后序遍历

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:

    # 递归
    def postorderTraversal_1(self, root: TreeNode) -> List[int]:
        def dfs(node, res):
            if node:
                dfs(node.left, res)
                dfs(node.right, res)
                res.append(node.val)
        res = []
        dfs(root, res)
        return res

    # 迭代
    def postorderTraversal_2(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        stack, res = [root], []
        while len(stack) > 0:
            node = stack.pop()
            res.insert(0, node.val)
            if node.left:
                stack.append(node.left)
            if node.right:
                stack.append(node.right)
        return res
