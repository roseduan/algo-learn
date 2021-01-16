package main

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

	queue := []*TreeNode{root}

	for len(queue) > 0 {
		node := queue[0]
		queue = queue[1:]

		node.Left, node.Right = node.Right, node.Left
		if node.Left != nil {
			queue = append(queue, node.Left)
		}
		if node.Right != nil {
			queue = append(queue, node.Right)
		}
	}

	return root
}
