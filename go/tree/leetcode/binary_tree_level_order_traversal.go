package leetcode

//二叉树的层次遍历

//广度优先
func binaryTreeLevelOrder1(root *TreeNode) [][]int {
	var res [][]int
	queue := []*TreeNode{root}
	for len(queue) > 0 {
		var lis []int
		n := len(queue)

		for i := 0; i < n; i++ {
			node := queue[0]
			queue = queue[1:]
			lis = append(lis, node.Val)

			if node.Left != nil {
				queue = append(queue, node.Left)
			}
			if node.Right != nil {
				queue = append(queue, node.Right)
			}
		}
		res = append(res, lis)
	}

	return res
}

//深度优先
func levelOrder2(root *TreeNode) [][]int {
	var res [][]int
	levelOrderHelper(root, 0, &res)
	return res
}

func levelOrderHelper(root *TreeNode, level int, res *[][]int) {
	if root == nil {
		return
	}

	if level == len(*res) {
		*res = append(*res, []int{})
	}

	(*res)[level] = append((*res)[level], root.Val)
	levelOrderHelper(root.Left, level+1, res)
	levelOrderHelper(root.Right, level+1, res)
}
