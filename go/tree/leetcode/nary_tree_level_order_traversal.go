package leetcode

import "container/list"

//N叉树的层次遍历

func levelOrder(root *Node) [][]int {
	var res [][]int
	if root == nil {
		return res
	}

	queue := list.New()
	queue.PushBack(root)
	for queue.Len() > 0 {
		var curLevel []int
		n := queue.Len()
		for i := 0; i < n; i++ {
			e := queue.Front()
			queue.Remove(e)

			node := e.Value.(*Node)
			curLevel = append(curLevel, node.Val)
			for _, child := range node.Children {
				queue.PushBack(child)
			}
		}
		res = append(res, curLevel)
	}
	return res
}
