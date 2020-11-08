package leetcode

//二叉树的前序遍历

//递归

func preorderTraversal(root *TreeNode) []int {
	var res []int
	preHelper(root, &res)
	return res
}

func preHelper(node *TreeNode, res *[]int) {
	if node == nil {
		return
	}

	*res = append(*res, node.Val)
	preHelper(node.Left, res)
	preHelper(node.Right, res)
}

//迭代
func preorderTraversal2(root *TreeNode) []int {
	var res []int
	if root == nil {
		return res
	}

	stack := []*TreeNode{root}
	for len(stack) > 0 {
		node := stack[len(stack)-1]
		res = append(res, node.Val)
		if node.Left != nil {
			stack = append(stack, node.Left)
		}
		if node.Right != nil {
			stack = append(stack, node.Right)
		}
	}
	return res
}
