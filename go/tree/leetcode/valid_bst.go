package leetcode

import (
	"math"
	"reflect"
	"sort"
)

//中序遍历，并排序比较
func isValidBST1(root *TreeNode) bool {
	var (
		res  []int
		temp []int
	)
	set := map[int]bool{}
	helper1(root, set, &res)

	for k := range set {
		temp = append(temp, k)
	}
	sort.Ints(temp)
	return reflect.DeepEqual(temp, res)
}

func helper1(node *TreeNode, set map[int]bool, res *[]int) {
	if node != nil {
		helper1(node.Left, set, res)
		set[node.Val] = true
		*res = append(*res, node.Val)
		helper1(node.Right, set, res)
	}
}

var prev *TreeNode

//中序遍历优化，比较前后节点
func isValidBST2(root *TreeNode) bool {
	if root == nil {
		return true
	}

	if !isValidBST2(root.Left) {
		return false
	}
	if prev != nil && prev.Val >= root.Val {
		return false
	}
	prev = root
	return isValidBST2(root.Right)
}

func isValidBST3(root *TreeNode) bool {
	return helper3(root, math.MinInt64, math.MaxInt64)
}

//递归比较
func helper3(node *TreeNode, min, max int) bool {
	if node == nil {
		return true
	}
	if node.Val <= min || node.Val >= max {
		return false
	}
	return helper3(node.Left, min, node.Val) && helper3(node.Right, node.Val, max)
}
