package main

import (
	"container/list"
)

//翻转二叉树

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

//很典型的递归，交换根节点的左右子节点的指针
//然后左右子树分别再进行同样的操作
func invertTree(root *TreeNode) *TreeNode {
	if root != nil {
		root.Left, root.Right = root.Right, root.Left
		invertTree(root.Left)
		invertTree(root.Right)
	}
	return root
}

//迭代，广度优先搜索
func invertTree2(root *TreeNode) *TreeNode {
	if root == nil {
		return root
	}

	queue := list.New()
	queue.PushBack(root)
	for queue.Len() > 0 {
		e := queue.Front()
		queue.Remove(e)
		node := e.Value.(*TreeNode)

		node.Left, node.Right = node.Right, node.Left
		if node.Left != nil {
			queue.PushBack(node.Left)
		}
		if node.Right != nil {
			queue.PushBack(node.Right)
		}
	}
	return root
}
