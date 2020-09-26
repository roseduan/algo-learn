package main

import "container/list"

//N叉树的前序遍历

//使用递归
func preorder(root *Node) []int {
	var res []int
	npreHelper(root, &res)
	return res
}

func npreHelper(node *Node, res *[]int) {
	if node == nil {
		return
	}

	*res = append(*res, node.Val)
	for _, child := range node.Children {
		npreHelper(child, res)
	}
}

//使用迭代
func preorder2(root *Node) []int {
	var res []int
	if root == nil {
		return res
	}

	stack := list.New()
	stack.PushFront(root)
	for stack.Len() > 0 {
		e := stack.Front()
		stack.Remove(e)
		node := e.Value.(*Node)
		res = append(res, node.Val)
		for i := len(node.Children) - 1; i >= 0; i-- {
			stack.PushFront(node.Children[i])
		}
	}
	return res
}

type Node struct {
	Val      int
	Children []*Node
}
