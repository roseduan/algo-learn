# 验证二叉搜索树

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:

    def __init__(self):
        self.prev = None

    # 中序遍历，然后看数据是否完全有序
    def isValidBST_1(self, root: TreeNode) -> bool:
        def inOrder(node: TreeNode):
            if not node:
                return
            inOrder(node.left)
            res.append(node.val)
            inOrder(node.right)

        res = []
        inOrder(root)
        return sorted(set(res)) == res

    # 中序遍历，无需保存全部的数据，前后数据比较即可
    def isValidBST_2(self, root: TreeNode) -> bool:
        if not root:
            return True
        if not self.isValidBST_2(root.left):
            return False
        if self.prev and self.prev.val >= root.val:
            return False
        self.prev = root
        return self.isValidBST_2(root.right)

    # 递归的方式
    def isValidBST_3(self, root: TreeNode) -> bool:
        def helper(node: TreeNode, mi, ma):
            if not node:
                return True
            if node.val >= ma or node.val <= mi:
                return False
            return helper(node.left, mi, node.val) and helper(node.right, node.val, ma)

        return helper(root, float('-inf'), float('inf'))
