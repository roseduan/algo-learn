package main

import (
	"math"
	"reflect"
	"sort"
)

//验证二叉搜索树

//根据二叉搜索树的特性，进行递归判断
func isValidBST(root *TreeNode) bool {
	return validBstHelper(root, math.MinInt64, math.MaxInt64)
}

func validBstHelper(node *TreeNode, lower, upper int) bool {
	if node == nil {
		return true
	}

	if node.Val <= lower || node.Val >= upper {
		return false
	}
	return validBstHelper(node.Left, lower, node.Val) && validBstHelper(node.Right, node.Val, upper)
}

//中序遍历二叉树，然后看是否有序
func isValidBST2(root *TreeNode) bool {
	if root == nil {
		return true
	}

	set := map[int]bool{}
	var temp []int
	iterative(root, set, &temp)

	var data []int
	for v := range set {
		data = append(data, v)
	}
	sort.Ints(data)
	return reflect.DeepEqual(temp, data)
}

func iterative(node *TreeNode, data map[int]bool, temp *[]int) {
	if node != nil {
		iterative(node.Left, data, temp)
		data[node.Val] = true
		*temp = append(*temp, node.Val)
		iterative(node.Right, data, temp)
	}
}

//中序遍历优化，不用全部将结果保存，只需要每次比较前后节点的值即可

func isValidBST3(root *TreeNode) bool {
	var stack []*TreeNode
	var prev *TreeNode
	cur := root
	for cur != nil || len(stack) > 0 {
		for cur != nil {
			stack = append(stack, cur)
			cur = cur.Left
		}
		node := stack[len(stack)-1]
		stack = stack[:len(stack)-1]
		if prev != nil && prev.Val >= node.Val {
			return false
		}
		prev = node
		cur = node.Right
	}
	return true
}
