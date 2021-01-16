package leetcode

//递归
func isSymmetric1(root *TreeNode) bool {
	return symmetricHelper(root, root)
}

func symmetricHelper(left, right *TreeNode) bool {
	if left == nil && right == nil {
		return true
	}

	if left == nil || right == nil || left.Val != right.Val {
		return false
	}

	return symmetricHelper(left.Left, right.Right) && symmetricHelper(left.Right, right.Left)
}

//广度优先
func isSymmetric2(root *TreeNode) bool {
	queue := []*TreeNode{root, root}

	for len(queue) > 0 {
		x, y := queue[0], queue[1]
		queue = queue[2:]
		if x == nil && y == nil {
			continue
		}
		if x == nil || y == nil || x.Val != y.Val {
			return false
		}

		queue = append(queue, x.Left, y.Right, x.Right, y.Left)
	}

	return true
}
