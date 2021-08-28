package leetcode

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

// 递归-另一种写法
func postorderTraversal2(root *TreeNode) []int {
	var res []int
	var helper func(node *TreeNode)
	helper = func(node *TreeNode) {
		if node == nil {
			return
		}
		helper(node.Left)
		helper(node.Right)
		res = append(res, node.Val)
	}
	return res
}

//迭代
func postorderTraversal3(root *TreeNode) []int {
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

// 迭代
func postorderTraversal4(root *TreeNode) []int {
	var res []int
	if root == nil {
		return res
	}
	stack := []*TreeNode{root}
	for len(stack) > 0 {
		node := stack[len(stack)-1]
		stack = stack[:len(stack)-1]
		res = append(res, node.Val)
		if node.Left != nil {
			stack = append(stack, node.Left)
		}
		if node.Right != nil {
			stack = append(stack, node.Right)
		}
	}
	for i, j := 0, len(res)-1; i < j; i, j = i+1, j-1 {
		res[i], res[j] = res[j], res[i]
	}
	return res
}
