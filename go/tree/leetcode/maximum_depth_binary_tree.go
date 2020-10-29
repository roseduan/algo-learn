package leetcode

import "container/list"

//二叉树的最大深度

//递归

func maxDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}
	return max(maxDepth(root.Left), maxDepth(root.Right)) + 1
}

func max(x int, y int) int {
	if x > y {
		return x
	}
	return y
}

//层次遍历
func maxDepth2(root *TreeNode) int {
	if root == nil {
		return 0
	}

	queue := list.New()
	queue.PushBack(root)
	level := 0
	for queue.Len() > 0 {
		n := queue.Len()
		for i := 0; i < n; i++ {
			e := queue.Front()
			queue.Remove(e)
			node := e.Value.(*TreeNode)
			if node.Left != nil {
				queue.PushBack(node.Left)
			}
			if node.Right != nil {
				queue.PushBack(node.Right)
			}
		}
		level++
	}
	return level
}
