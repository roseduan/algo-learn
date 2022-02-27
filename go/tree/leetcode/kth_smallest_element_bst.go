package leetcode

// 二叉搜索树中第k小的元素

// 中序遍历取第k个
func kthSmallest1(root *TreeNode, k int) int {
	var inorder func(node *TreeNode)
	var vals []int
	inorder = func(node *TreeNode) {
		if node == nil {
			return
		}
		inorder(node.Left)
		vals = append(vals, node.Val)
		inorder(node.Right)
	}

	inorder(root)
	return vals[k-1]
}

// 中序遍历优化，遍历到第k个时就是结果
func kthSmallest2(root *TreeNode, k int) int {
	var stack []*TreeNode
	var cur = root
	for len(stack) > 0 || cur != nil {
		for cur != nil {
			stack = append(stack, cur)
			cur = cur.Left
		}
		node := stack[len(stack)-1]
		stack = stack[:len(stack)-1]
		k--
		if k == 0 {
			return node.Val
		}
		cur = node.Right
	}
	return 0
}
