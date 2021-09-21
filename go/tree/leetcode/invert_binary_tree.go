package leetcode

// 翻转二叉树

// 递归
func invertTree(root *TreeNode) *TreeNode {
	if root == nil {
		return root
	}
	root.Left, root.Right = root.Right, root.Left
	invertTree(root.Right)
	invertTree(root.Left)
	return root
}
