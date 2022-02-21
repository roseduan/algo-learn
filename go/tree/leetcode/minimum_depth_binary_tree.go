package leetcode

// 二叉树的最小深度

// 深度优先
func minDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minDepth(root.Left)
	r := minDepth(root.Right)
	if l == 0 || r == 0 {
		return l + r + 1
	}
	return min(l, r) + 1
}

func min(x, y int) int {
	if x < y {
		return x
	}
	return y
}

// 广度优先
func minDepth2(root *TreeNode) int {
	if root == nil {
		return 0
	}
	que := []*TreeNode{root}
	depth := 0
	for len(que) > 0 {
		size := len(que)
		depth++
		for size > 0 {
			size--
			node := que[0]
			que = que[1:]
			if node.Left == nil && node.Right == nil {
				return depth
			}
			if node.Left != nil {
				que = append(que, node.Left)
			}
			if node.Right != nil {
				que = append(que, node.Right)
			}
		}
	}
	return depth
}
