package leetcode

import (
	"container/list"
)

//二叉树的中序遍历

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

//递归
func inorderTraversal(root *TreeNode) []int {
	var res []int
	inHelper(root, &res)
	return res
}

func inHelper(node *TreeNode, res *[]int) {
	if node == nil {
		return
	}

	inHelper(node.Left, res)
	*res = append(*res, node.Val)
	inHelper(node.Right, res)
}

//使用一个栈
func inorderTraversal2(root *TreeNode) []int {
	stack := list.New()
	var res []int
	cur := root
	for cur != nil || stack.Len() > 0 {
		for cur != nil {
			stack.PushFront(cur)
			cur = cur.Left
		}

		e := stack.Front()
		res = append(res, e.Value.(*TreeNode).Val)
		stack.Remove(e)
		cur = e.Value.(*TreeNode).Right
	}
	return res
}
