package leetcode

import "container/list"

//N叉树的后序遍历

//递归

func postorder(root *Node) []int {
	var res []int
	npostHelper(root, &res)
	return res
}

func npostHelper(node *Node, res *[]int) {
	if node == nil {
		return
	}

	for _, child := range node.Children {
		npostHelper(child, res)
	}
	*res = append(*res, node.Val)
}

//迭代
func postorder2(root *Node) []int {
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
		res = append([]int{node.Val}, res...)
		for _, child := range node.Children {
			stack.PushFront(child)
		}
	}
	return res
}
