package leetcode

import "testing"

func TestConstructor(t *testing.T) {
	queue := []*TreeNode{nil, nil}
	queue = append(queue, nil)
	print(len(queue))
}
