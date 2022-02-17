package leetcode

// 二叉树的右视图

// 广度优先
func rightSideView1(root *TreeNode) []int {
	var res []int
	if root == nil {
		return res
	}

	queue := []*TreeNode{root}
	for len(queue) > 0 {
		size := len(queue)
		for size > 0 {
			size--
			node := queue[0]
			queue = queue[1:]
			if size == 0 {
				res = append(res, node.Val)
			}
			if node.Left != nil {
				queue = append(queue, node.Left)
			}
			if node.Right != nil {
				queue = append(queue, node.Right)
			}
		}
	}
	return res
}

// 深度优先
func rightSideView2(root *TreeNode) []int {
	var res []int
	rightSideViewHelper(root, &res, 0)
	return res
}

func rightSideViewHelper(root *TreeNode, res *[]int, level int) {
	if root == nil {
		return
	}
	if level == len(*res) {
		*res = append(*res, root.Val)
	}
	rightSideViewHelper(root.Right, res, level+1)
	rightSideViewHelper(root.Left, res, level+1)
}
