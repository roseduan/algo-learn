package main

import "container/list"

//二叉树的后序遍历

//递归
func postorderTraversal(root *TreeNode) []int {
	var res []int
	postHelper(root, &res)
	return res
}

func postHelper(node *TreeNode, res *[]int) {
	if node == nil {
		return
	}

	postHelper(node.Left, res)
	postHelper(node.Right, res)
	*res = append(*res, node.Val)
}

//迭代
func postorderTraversal2(root *TreeNode) []int {
	var res []int
	if root == nil {
		return res
	}

	stack := list.New()
	stack.PushFront(root)
	for stack.Len() > 0 {
		e := stack.Front()
		stack.Remove(e)
		node := e.Value.(*TreeNode)
		res = append([]int{node.Val}, res...)
		if node.Left != nil {
			stack.PushFront(node.Left)
		}
		if node.Right != nil {
			stack.PushFront(node.Right)
		}
	}
	return res
}
