package leetcode

// 求根节点到叶子节点数字之和

// 深度优先
func sumNumbers(root *TreeNode) int {
	return sumNumbersHelper(root, 0)
}

func sumNumbersHelper(root *TreeNode, prev int) int {
	if root == nil {
		return 0
	}
	sum := prev*10 + root.Val
	if root.Left == nil && root.Right == nil {
		return sum
	}
	return sumNumbersHelper(root.Left, sum) + sumNumbersHelper(root.Right, sum)
}

// 广度优先
func sumNumbers1(root *TreeNode) int {
	if root == nil {
		return 0
	}

	que := []*TreeNode{root}
	vals := []int{root.Val}
	var res int
	for len(que) > 0 {
		n := len(que)
		for i := 0; i < n; i++ {
			node, v := que[0], vals[0]
			que, vals = que[1:], vals[1:]
			if node.Left == nil && node.Right == nil {
				res += v
			}
			if node.Left != nil {
				que = append(que, node.Left)
				vals = append(vals, node.Left.Val+v*10)
			}
			if node.Right != nil {
				que = append(que, node.Right)
				vals = append(vals, node.Right.Val+v*10)
			}
		}
	}
	return res
}
