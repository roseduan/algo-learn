package main

import (
	"container/list"
)

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

	stack := list.New()
	stack.PushFront(root)
	for stack.Len() > 0 {
		e := stack.Front()
		if e != nil {
			node := e.Value.(*TreeNode)
			res = append(res, node.Val)
			stack.Remove(e)

			if node.Right != nil {
				stack.PushFront(node.Right)
			}
			if node.Left != nil {
				stack.PushFront(node.Left)
			}
		}
	}
	return res
}
