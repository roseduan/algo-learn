from  typing import List


# 二叉搜索树中第K小的元素

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:

    # 中序遍历后取第K个
    def kthSmallest_1(self, root: TreeNode, k: int) -> int:
        def inorder(node) -> List[int]:
            return inorder(node.left) + [node.val] + inorder(node.right) if node else []
        return inorder(root)[k - 1]
