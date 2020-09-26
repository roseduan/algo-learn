package main

import "math"

//二叉树的最小深度

//递归
func minDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}

	x := minDepth(root.Left)
	y := minDepth(root.Right)
	if root.Left == nil || root.Right == nil {
		return x + y + 1
	} else {
		return min(x, y) + 1
	}
}

func min(x int, y int) int {
	if x < y {
		return x
	}
	return y
}

//广度优先遍历
func minDepth2(root *TreeNode) int {
	if root == nil {
		return 0
	}

	var queue []*TreeNode
	queue = append(queue, root)
	level := 0
	for len(queue) > 0 {
		n := len(queue)
		level++
		for i := 0; i < n; i++ {
			node := queue[0]
			queue = queue[1:]
			if node.Left == nil && node.Right == nil {
				return level
			}
			if node.Left != nil {
				queue = append(queue, node.Left)
			}
			if node.Right != nil {
				queue = append(queue, node.Right)
			}
		}
	}
	return -1
}

//深度优先遍历的思想，和递归的思路类似
func minDepth3(root *TreeNode) int {
	if root == nil {
		return 0
	}

	if root.Left == nil && root.Right == nil {
		return 1
	}

	res := math.MaxInt64
	if root.Left != nil {
		res = min(minDepth3(root.Left), res)
	}
	if root.Right != nil {
		res = min(minDepth3(root.Right), res)
	}
	return res + 1
}
