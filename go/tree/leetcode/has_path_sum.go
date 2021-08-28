package leetcode

// 路径总和

func hasPathSum(root *TreeNode, targetSum int) bool {
	if root == nil {
		return false
	}
	if root.Left == nil && root.Right == nil {
		return targetSum == root.Val
	}
	return hasPathSum(root.Left, targetSum-root.Val) || hasPathSum(root.Right, targetSum-root.Val)
}

// 广度优先搜索
func hasPathSum2(root *TreeNode, targetSum int) bool {
	if root == nil {
		return false
	}

	queue := []*TreeNode{root}
	queueVal := []int{root.Val}
	for len(queue) > 0 {
		node, val := queue[0], queueVal[0]
		queue, queueVal = queue[1:], queueVal[1:]
		if node.Left == nil && node.Right == nil {
			if val == targetSum {
				return true
			}
		}
		if node.Left != nil {
			queue = append(queue, node.Left)
			queueVal = append(queueVal, node.Left.Val+val)
		}
		if node.Right != nil {
			queue = append(queue, node.Right)
			queueVal = append(queueVal, node.Right.Val+val)
		}
	}
	return false
}
